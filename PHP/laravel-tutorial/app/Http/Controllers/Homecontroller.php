<?php


namespace App\Http\Controllers;
use Illuminate\Foundation\Auth\Access\AuthorizesRequests;
use Illuminate\Foundation\Bus\DispatchesJobs;
use Illuminate\Foundation\Validation\ValidatesRequests;
use Illuminate\Routing\Controller as BaseController;

class Homecontroller extends BaseController
{
    public function showwelcome(){
        return "Welcome Controller";
    }
    public function showindex(){
        return view('index');
    }

}
