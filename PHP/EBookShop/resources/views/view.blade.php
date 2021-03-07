<?php
?>
    <!DOCTYPE html>
<head>
    <link href="{{URL::asset('css/bootstrap.min.css')}}" rel="stylesheet">

</head>
<body>
@extends('layouts.app')

@section('content')
<div class="container">
    <div class="row">
        <div class="col-12">
            @if(count($products) >0)
            <table class="table table-image ">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Price</th>
                    <th scope="col">Image</th>
                    <th scope="col">Description</th>
                    <th scope="col">Qty</th>
                    <th scope="col">Status</th>
                    <th scope="col">Delete</th>
                </tr>
                </thead>
                <tbody>
                @foreach($products as $product)
                <tr >
                    <th scope="row" class="align-middle">{{$product->id}}</th>
                    <td class="align-middle">{{$product->name}}</td>
                    <td class="align-middle">{{$product->price}}$</td>
                    <td class="w-25">
                        <img src="{{URL::asset("images/"."$product->image")}}" class="img-fluid img-thumbnail" alt="Sheep">
                    </td>
                    <td class="align-middle">{{$product->description	}}</td>
                    <td class="align-middle">{{$product->qty}}</td>
                    <td class="align-middle"> {{$product->status}}</td>
                    <td class="align-middle">
                        <form action="delete/{{$product->name}}" method="post">
                            <button class="btn btn-primary">DELETE</button>
                            @method('delete')
                            @csrf
                        </form>
                    </td>

                </tr>
                @endforeach
                </tbody>
            </table>
            @endif
        </div>
    </div>
</div>
@endsection
</body>
