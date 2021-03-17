<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Product extends Model
{
    use HasFactory;

    protected $table ='products';
    protected $primaryKey = 'id';
    protected $guarded =[];

    public function order_details(){
        return $this->hasMany(OrderDetail::class,'product_id','id');
    }
    public function product_comments(){
        return $this->hasMany(ProductComment::class,'product_id','id');
    }
    public function product_details(){
        return $this->hasMany(ProductDetail::class,'product_id','id');
    }
    public function product_images(){
        return $this->hasMany(ProductImage::class,'product_id','id');
    }

    public function brands(){
        return $this->belongsTo(Brand::class,'brand_id','id');
    }
    public function product_category(){
        return $this->belongsTo(ProductCategory::class,'product_category_id','id');
    }

}
