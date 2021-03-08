<?php
?>
    <!DOCTYPE html>
<html>
<head>
    <link href="{{URL::asset('css/bootstrap.min.css')}}" rel="stylesheet">
    <title>Student's Information</title>
</head>
<body>
<h2>Add new Student</h2>
<div class="row">
    <form action="{{url('validation')}}" method="post" class="col-lg-10 ml-5" >
        {{csrf_field()}}
{{--        nhap ten--}}
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
{{--        nhap tuoi--}}
        <div class="row ">
            <div class="form-group col-lg-6 ">
                <label for="exampleInputPassword1">Age</label>
                <input type="text" class="form-control" name="age" value="{{old('age')}}" id="exampleInputPassword1" placeholder="Age">
            </div>
            <div class="col-lg-4 pt-4">
                @if(count($errors->get('age')) >0)
                    <div class="alert alert-danger" role="alert">{{$errors->first('age')}}</div>
                @endif
            </div>
        </div>
{{--        nhap dia chi--}}
        <div class="row ">
            <div class="form-group col-lg-6 ">
                <label for="exampleInputPassword1">Address</label>
                <input type="text" class="form-control" name="address" value="{{old('address')}}" id="exampleInputPassword1" placeholder="Address">
            </div>
            <div class="col-lg-4 pt-4">
                @if(count($errors->get('address')) >0)
                    <div class="alert alert-danger" role="alert">{{$errors->first('address')}}</div>
                @endif
            </div>
        </div>
{{--        nhap so dien thoai--}}
        <div class="row ">
            <div class="form-group col-lg-6 ">
                <label for="exampleInputPassword1">Telephone</label>
                <input type="text" class="form-control" name="telephone" value="{{old('telephone')}}" id="exampleInputPassword1" placeholder="Telephone">
            </div>
            <div class="col-lg-4 pt-4">
                @if(count($errors->get('telephone')) >0)
                    <div class="alert alert-danger" role="alert">{{$errors->first('telephone')}}</div>
                @endif
            </div>
        </div>
        <br><br>
        <button  type="submit" class="btn btn-primary ">Submit</button>
    </form>
</div>
<br><br><br>
<h2>All Students's Information</h2>
<div class="container">
    <div class="row">
        <div class="col-12">
            @if(count($students) >0)
                <table class="table table-image ">
                    <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Name</th>
                        <th scope="col">Age</th>
                        <th scope="col">Address</th>
                        <th scope="col">Telephone</th>
                    </tr>
                    </thead>
                    <tbody>
                    @foreach($students as $student)
                        <tr >
                            <th scope="row" class="align-middle">{{$student->id}}</th>
                            <td class="align-middle">{{$student->name}}</td>
                            <td class="align-middle">{{$student->age}}</td>
                            <td class="align-middle">{{$student->address}}</td>
                            <td class="align-middle">{{$student->telephone}}</td>
                        </tr>
                    @endforeach
                    </tbody>
                </table>
            @endif
        </div>
    </div>
</div>
</body>
</html>
