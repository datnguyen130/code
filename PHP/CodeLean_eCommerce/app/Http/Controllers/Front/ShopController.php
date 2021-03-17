<?php

namespace App\Http\Controllers\Front;

use App\Http\Controllers\Controller;
use App\Models\Brand;
use App\Models\Product;
use App\Models\ProductCategory;
use App\Models\ProductComment;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class ShopController extends Controller
{
    public function show($id){
        $product = Product::findOrFail($id);

        $avgRating = 0;
        $sumRating = array_sum(array_column($product->product_comments->toArray(),'rating'));
        $countRating = count($product->product_comments);
        if ($countRating != 0){
            $avgRating = $sumRating/$countRating;
        }

        $relatedProducts = Product::where('product_category_id',$product->product_category_id)
            ->where('tag',$product->tag)
            ->where('id','!=',$product->id)
            ->limit(4)
            ->get();

        return view('front.shop.show',compact('product','avgRating','relatedProducts'));
    }

    public function postComment(Request $request){
        ProductComment::create($request->all());
        return redirect() ->back();
    }

    public function index(Request $request)
    {
        //set categories,brands
        $categories = ProductCategory::all();
        $brands = Brand::all();

        //set products
        $perPage = $request->show ?? 3;
        $sortBy = $request->sort_by ?? 'latest';
        $search = $request->search ?? '';

        $products = Product::where('name', 'like', '%' . $search . '%');

        $products =$this->Filter($products, $request);

        $products = $this->SortAndPagination($products,$sortBy,$perPage);

        return view('front.shop.index', compact('products', 'categories','brands'));



    }

    public function category($categoryName,Request $request){

        $perPage = $request->show ?? 3;
        $sortBy = $request->sort_by ?? 'latest';

        //get categories,brands
        $categories = ProductCategory::all();
        $brands = Brand::all();

        //get Products
        $products = ProductCategory::where('name',$categoryName)->first()->products->toQuery();

        $products =$this->Filter($products, $request);

        $products = $this->SortAndPagination($products,$sortBy,$perPage);

        return view('front.shop.index',compact('categories','products','brands'));
    }

    public function SortAndPagination($products,$sortBy,$perPage){
        switch ($sortBy) {
            case 'latest' :
                $products = $products->orderBy('id');
                break;
            case 'oldest' :
                $products = $products->orderBy('id', 'DESC');
                break;
            case 'name-ascending' :
                $products = $products->orderBy('name');
                break;
            case 'name-descending' :
                $products = $products->orderBy('name', 'DESC');
                break;
            case 'price-ascending' :
                $products = $products->orderByRaw('IFNULL(discount,price)');
                break;
            case 'price-descending' :
                $products = $products->orderByRaw('(IFNULL(discount,price))desc');
                break;
            default:
                $products = $products->orderBy('id');
                break;

        }

        $products = $products->paginate($perPage);

        $products->appends(['sort_by' => $sortBy, 'show' => $perPage]);

        return $products;
    }

    public function Filter($products,Request $request){

        $brands = $request->brand ?? [];
        $brand_ids = array_keys($brands);
        $products = $brand_ids != null ? $products->whereIn('brand_id',$brand_ids) : $products;

        //price
        $priceMin = $request->price_min;
        $priceMax = $request->price_max;
        $priceMin = str_replace('$','',$priceMin);
        $priceMax = str_replace('$','',$priceMax);
        $products = ($priceMin != null && $priceMax != null) ? $products->whereBetween('price',[$priceMin,$priceMax]) : $products;
        return $products;
    }
}
