<?php
?>
<!DOCTYPE html>
<html>
<head>
    <link href="{{URL::asset('css/bootstrap.min.css')}}" rel="stylesheet">
    <title>Purse Shop</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand mr-5" href="#">Purse Shop</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="{{url('/')}}">Add Product</a>
            </li>
            <li class="nav-item active ">
                <a class="nav-link" href="{{url('view')}}">View Products </a>
            </li>

        </ul>
        <form action="{{url('search')}}" method="post" class="form-inline my-2 my-lg-0" >
            {{csrf_field()}}
            <input class="form-control mr-sm-2" type="search" name="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-dark my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
<br><br><br>
@yield('content')
</body>
</html>
