<?php
?>
<!DOCTYPE html>
<head>
    <link href="{{URL::asset('css/bootstrap.min.css')}}" rel="stylesheet">

</head>
<body>
@extends('layouts.app')


@section('add_tab')
    <span class="sr-only">(current)</span>
@endsection

@section('content')
    <div class="row">
        <form action="{{url('validation')}}" method="post" class="col-lg-10 ml-5" >
            {{csrf_field()}}
{{--            nhap ID --}}
            <div class="row ">
                <div class="form-group col-lg-6 ">
                    <label for="exampleInputPassword1">ID</label>
                    <input type="text" class="form-control" name="id" value="{{old('id')}}" id="exampleInputPassword1" placeholder="ID">
                </div>
                <div class="col-lg-4 pt-4">
                    @if(count($errors->get('id')) >0)
                        <div class="alert alert-danger" role="alert">{{$errors->first('id')}}</div>
                    @endif
                </div>
            </div>
{{--            nhap name--}}
            <div class="row ">
                <div class="form-group col-lg-6 ">
                    <label for="exampleInputPassword1">Name</label>
                    <input type="text" class="form-control" name="name" value="{{old('name')}}" id="exampleInputPassword1" placeholder="Name">
                </div>
                <div class="col-lg-4 pt-4">
                    @if(count($errors->get('name')) >0)
                        <div class="alert alert-danger" role="alert">{{$errors->first('name')}}</div>
                    @endif
                </div>
            </div>
{{--            nhap price--}}
            <div class="row ">
                <div class="form-group col-lg-6 ">
                    <label for="exampleInputPassword1">Price</label>
                    <input type="text" class="form-control" name="price" value="{{old('price')}}" id="exampleInputPassword1" placeholder="Price">
                </div>
                <div class="col-lg-4 pt-4">
                    @if(count($errors->get('price')) >0)
                        <div class="alert alert-danger" role="alert">{{$errors->first('price')}}</div>
                    @endif
                </div>
            </div>
{{--            nhap image--}}
            <div class="row ">
                <div class="form-group col-lg-6 ">
                    <label for="exampleInputPassword1">Image</label>
                    <input type="text" class="form-control" name="image" value="{{old('image')}}" id="exampleInputPassword1" placeholder="Image">
                </div>
                <div class="col-lg-4 pt-4">
                    @if(count($errors->get('image')) >0)
                        <div class="alert alert-danger" role="alert">{{$errors->first('image')}}</div>
                    @endif
                </div>
            </div>
{{--            nhap Description --}}
            <div class="row ">
                <div class="form-group col-lg-6 ">
                    <label for="exampleInputPassword1">Description</label>
                    <input type="text" class="form-control" name="description" value="{{old('description')}}" id="exampleInputPassword1" placeholder="Description">
                </div>
                <div class="col-lg-4 pt-4">
                    @if(count($errors->get('description')) >0)
                        <div class="alert alert-danger" role="alert">{{$errors->first('description')}}</div>
                    @endif
                </div>
            </div>
{{--            nhap qty--}}
            <div class="row ">
                <div class="form-group col-lg-6 ">
                    <label for="exampleInputPassword1">Qty</label>
                    <input type="text" class="form-control" name="qty" value="{{old('qty')}}" id="exampleInputPassword1" placeholder="Qty">
                </div>
                <div class="col-lg-4 pt-4">
                    @if(count($errors->get('qty')) >0)
                        <div class="alert alert-danger" role="alert">{{$errors->first('qty')}}</div>
                    @endif
                </div>
            </div>
            <br>
{{--            nhap status--}}
            <div class="row ml-4 ">
                <div class="form-check mr-4">
                    <input class="form-check-input" type="radio" name="status" id="flexRadioDefault1" value="available" >
                    <label class="form-check-label" for="flexRadioDefault1">
                        Available
                    </label>
                </div>
                <div class="form-check mr-4">
                    <input class="form-check-input" type="radio" name="status" id="flexRadioDefault1" value="available soon">
                    <label class="form-check-label" for="flexRadioDefault1">
                        Available soon
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="status" id="flexRadioDefault1" value="sold">
                    <label class="form-check-label" for="flexRadioDefault1">
                        Sold
                    </label>
                </div>
                <div class="col-lg-4 pt-4">
                    @if(count($errors->get('status')) >0)
                        <div class="alert alert-danger" role="alert">{{$errors->first('status')}}</div>
                    @endif
                </div>
            </div>
            <br><br>
            <button  type="submit" class="btn btn-primary ">Submit</button>
        </form>
    </div>
@endsection
</body>
