<?php
$Fname = "John";
$LName = "Smith";
$name = & $Fname;
$name = "Sam";

echo '$name : ', $name , "<br>";
echo '$Fname : ', $Fname , "<br>";

unset($name);
$name = "Car";
echo '$name after unset() : ', $name,"<br>";
echo '$Fname after unset() : ', $Fname, "<br>";
echo $LName;
?>
