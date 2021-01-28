<?php
if (isset($_COOKIE['Name'])){
    $last = $_COOKIE['Name'];
    echo "Welcome back! Your name is ". $last;
}
else{
    echo "Welcome to out site";
}
