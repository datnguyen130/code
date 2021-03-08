<?php

use App\Models\Student;
use Illuminate\Support\Facades\Route;
use App\Models\Product;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Validator;
use Illuminate\Support\Fluent;
/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

//Route::get('/', function () {
//    return view('welcome');
//});
//Route::get('/',function (){
//    return view('add');
//}) -> name('add');
//
//Route::get('view',function (){
//    $products = Product::orderBy('id','ASC') -> get();
//    return view('view') -> with('products',$products);
//}) ->name('view');
//
////Route::delete('delete',function (Request $request){
////   $product = Product::where('name',$request->name) -> take(1);
////   $product -> delete();
////   redirect('view');
////});
//
//Route::delete('delete/{name}',function ($name){
//    $product = Product::where('name',$name) -> take(1);
//   $product -> delete();
//   return redirect('view');
//});
//
//Route::post('search',function (Request $request){
//   $products = Product::where('name','LIKE',"%"."$request->search"."%")
//       -> orWhere('id', $request->search)
//       ->get();
//   return view('view') -> with('products',$products);
//}) -> name('search');
//
//Route::post('validation',function (Request $request){
//    $ValidationData = Validator::make($request->all(),[
//        'id' => 'bail|required|unique:products,id|numeric|min:1|',
//        'name' => 'bail|required|unique:products,name|min:6|max:100',
//        'price' => 'bail|regex:/^[0-9]+(\.[0-9][0-9]?)?$/|required',
//        'image' => 'bail|required',
//        'status' => 'bail|required',
//    ]);
//    $ValidationData->sometimes('qty','min:0|max:0|numeric',function ($input){
//        return ($input->status =='available soon') or ($input->status == "sold");
//    });
//    $ValidationData->sometimes('qty','min:1|numeric',function ($input){
//        return $input->status == 'available';
//    });
//    if ($ValidationData->fails()){
//        return redirect('/') ->withInput($request->input()) ->withErrors($ValidationData);
//    }
//    else{
//        $product = new Product();
//        $product->id = $request->id;
//        $product->name = $request->name;
//        $product->price = $request->price;
//        $product->image = $request->image;
//        $product->description = $request->description;
//        $product->qty = $request->qty;
//        $product->status = $request->status;
//        $product->save();
//        return redirect('/');
//    }
//});
Route::get('/',function (){
    $students = Student::orderBy('id','ASC') -> get();
    return view('student') ->with('students',$students);
});
Route::post('validation',function (Request $request){
   $validationData = Validator::make($request->all(),[
        'name' => 'bail|required|min:6|max:255',
       'age' => 'bail|required',
       'address' => 'bail|required|max:200|min:2',
       'telephone' => 'bail|required|min:9',
   ]);
    if ($validationData->fails()){
        return redirect('/') ->withInput($request->input()) ->withErrors($validationData);
    }
    else{
        $student = new Student();
        $student->name = $request->name;
        $student->age = $request->age;
        $student->address = $request->address;
        $student->telephone = $request->telephone;
        $student ->save();
        return redirect('/');
    }
});
