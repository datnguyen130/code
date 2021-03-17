<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class ProducImage extends Model
{
    use HasFactory;

    protected $table ='product_images';
    protected $primaryKey = 'id';
    protected $guarded =[];

    public function products(){
        return $this->belongsTo(Product::class,'product_id','id');
    }
}
