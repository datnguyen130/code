<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\Homecontroller;
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

Route::get('/', function () {
    return view('welcome');
});

//Route::get('/{name}','Homecontroller@showwelcome');

Route::get('about', function (){
   return "About content";
});
Route::get('about/direction', function (){
   return "Direction go here";
});
//Route::any('submit-form',function (){
//    return "Test Routes any";
//});
Route::get('about/{theSubject}', function ($theSubject){
    return $theSubject . " go here";
});
Route::get('try/{price}/{art}',function($price,$art){
    return "The ".$art  ." have the price : ".$price;
});
Route::get('where', function (){
    return redirect('about');
});
//Route::redirect('where1','about',302);
Route::get('price/{price?}/art/{art?}',function($price=null,$art=null){
    if (!$art){
        return "Please enter art";
    }
    if (!$price){
        return "Please enter price";
    }
    return "The ".$art  ." have the price : ".$price;
});
Route::get('user/{userid}/name/{username}',function ($userid,$username){
    return "user ID is $userid <br> user name is $username";
}) ->where('userid','[0-9]+') ->where('username','([a-zA-Z])+');
Route::get('home','Homecontroller@showindex');

Route::get('profile/{name?}','profileController@showprofile') ;

Route::view('trangchu','index') ;
