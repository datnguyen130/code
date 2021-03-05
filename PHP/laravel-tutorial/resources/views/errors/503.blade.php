<?php
?>
<!DOCTYPE html>
<html>
<head>
    <link href="../../../public/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">

            @if(count($errors)>0)
                OOPS! ERRORS!
            <div class="alert alert-danger" role="alert">
                <ul style="list-style: none">
                    @foreach($errors->all() as $error)
                        <li>{{$error}}</li>
                    @endforeach
                </ul>
            </div>
            @endif

    </div>
</body>
</html>
