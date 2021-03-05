<?php
?>
<!DOCTYPE html>
<html>
<head>
    <link href="../../public/css/bootstrap.min.css" rel="stylesheet">
    <title>Task ToDo List</title>
</head>
<body>
@extends('layouts.app')

@section('content')
<div class="row ml-4">
    <h2>Insert Form</h2>
    <form action="{{url('task')}}" method="post" class="col-lg-4">
        {{csrf_field()}}
        <div class="form-group">
            <label for="exampleInputPassword1">Name</label>
            <input type="text" class="form-control" name="name" value="{{old('name')}}" id="exampleInputPassword1" placeholder="Name">
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input type="email" class="form-control" name="email" value="{{old('email')}}" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" class="form-control" name="pass" id="exampleInputPassword1" placeholder="Password">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Confirm Password</label>
            <input type="password" class="form-control" name="confirmpass" id="exampleInputPassword1" placeholder="Confirm Password">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
    <div class="col-lg-2">
        @include('errors.503')
    </div>
    <div class="col-lg-4">
        @if(count($tasks)>0)
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Gmail</th>
                    <th scope="col">Password</th>
                </tr>
                <tbody>
                @foreach($tasks as $task)
                    <tr>
                        <td>{{$task->id}}</td>
                        <td>{{$task->name}}</td>
                        <td>{{$task->email}}</td>
                        <td>{{$task->password}}</td>
                    </tr>
                @endforeach
                </tbody>

                </thead>
            </table>
        @endif
    </div>
</div> <br><br><br>
<div class="row">
    <h2>Delete Tasks with Name</h2>
    <div class="ml-4 col-lg-4">
        <form action="{{url('delete')}}" method="post">

            <div class="form-group">
                <label for="exampleInputPassword1">Name</label>
                <input type="text" class="form-control" name="name" id="exampleInputPassword1" placeholder="Name">
            </div>
            <br>
            <button class="btn btn-primary">DELETE</button>
            @method('delete')
            @csrf
        </form>
    </div>
</div>
@endsection


</body>
</html>
