<?php

namespace App\Http\Controllers\Front;

use App\Http\Controllers\Controller;
use App\Models\Order;
use App\Models\OrderDetail;
use Illuminate\Http\Request;
use App\Models\Product;
use Gloudemans\Shoppingcart\Facades\Cart;
use Illuminate\Support\Facades\Mail;

class CheckOutController extends Controller
{
    public function index(){

        $carts = Cart::content();
        $total = Cart::total();
        $subtotal = Cart::subtotal();

        return view('front.checkout.index', compact('carts','total','subtotal'));
    }

    public function addOrder(Request $request){
        if ($request->payment_type =='pay_later'){
            //01. Them don hang
            $order =  Order::create($request->all());


            //02. Them chi tet don hang
            $carts = Cart::content();

            foreach ($carts as $cart){
                $data = [
                    'order_id' => $order->id ,
                    'product_id' => $cart->id ,
                    'qty'=> $cart->qty ,
                    'amount' => $cart->price ,
                    'total' => $cart->price * $cart->qty,
                ];

                OrderDetail::create($data);
            }

            //03. Gui email


            //04. Xoa gio hang

            Cart::destroy();

            //05. Tra ve ket qua
            return "Success!!!";

        }
        else{
            return "online payment method is not supported";
        }
    }

    public function sendEmail($order,$total,$subtotal){
        $email_to = $order->email;
        Mail::send('front.checkout.email',compact('order','total','subtotal'),function (){
            $message->from()
        });
    }
}
