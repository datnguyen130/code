<?php
function sum()
{
    static $var1 = 9;
    $var1 = $var1 + 12;
    echo 'The value of $var1 is : ', $var1, "<br>";
    echo "the addition value of 9 + 12 = ", $var1, "<br>";
}
sum();
sum();
sum();
