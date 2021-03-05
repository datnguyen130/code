<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\Homecontroller;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Validator;
use App\Models\Task;
use Illuminate\Validation\Rule;
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
    $tasks = Task::orderBy('id','ASC')
        ->get();
    return view('task') -> with('tasks',$tasks);
});

//Route::get('/{name}','Homecontroller@showwelcome');

Route::get('about', function (){
   return "About content";
});
//Route::get('about/direction', function (){
//   return "Direction go here";
//});
////Route::any('submit-form',function (){
////    return "Test Routes any";
////});
//Route::get('about/{theSubject}', function ($theSubject){
//    return $theSubject . " go here";
//});
//Route::get('try/{price}/{art}',function($price,$art){
//    return "The ".$art  ." have the price : ".$price;
//});
//Route::get('where', function (){
//    return redirect('about');
//});
////Route::redirect('where1','about',302);
//Route::get('price/{price?}/art/{art?}',function($price=null,$art=null){
//    if (!$art){
//        return "Please enter art";
//    }
//    if (!$price){
//        return "Please enter price";
//    }
//    return "The ".$art  ." have the price : ".$price;
//});
//Route::get('user/{userid}/name/{username}',function ($userid,$username){
//    return "user ID is $userid <br> user name is $username";
//}) ->where('userid','[0-9]+') ->where('username','([a-zA-Z])+');
//Route::get('home','Homecontroller@showindex');
//
//Route::get('profile/{name?}','profileController@showprofile') ;
//
//Route::get('trangchu',function (){
//    return view('index');
//});

//Route::get('displayposts','Post_Controller@DisplayPost');
//
//Route::get('postsfindid/{id}','Post_Controller@FindId');
//
//Route::get('insertposts/title/{title}/author/{author}','Post_Controller@insert');
//
//Route::get('update/{id}/{title}/{author}','Post_Controller@Update_Post');

Route::get('test',function (){
    return view('layouts.app');
});
Route::post('task',function (Request $request){
    $validationData = Validator::make ($request->all(),[
        'name' => 'bail|required|unique:tasks,name|min:6|max:50',
        'email' => 'bail|required|unique:tasks,email|email',
        'pass' => 'bail|required|min:8',
        'confirmpass' => 'bail|required|same:pass',
    ]);
    if ($validationData->fails()){
        return redirect('/') ->withInput($request->input()) ->withErrors($validationData);
    }
    else{
        $task = new Task();
        $task->name = $request->name;
        $task->email = $request->email;
        $task->password = $request->pass;
        $task->save();
        return redirect('/');
    }

});
Route::delete('delete',function (Request $request){
    $task = Task::where('name',$request->name) -> take(1) ;
    $task-> delete();
    return redirect('/');
});
