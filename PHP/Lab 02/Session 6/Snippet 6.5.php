<html>
<head>
    <title>String Assigment Operation</title>
</head>
<body>
<?php
$var1 = 68;
$var2 = 50;
function division(){
    global $var1, $var2;
    $var3 = $var1 / $var2;
    echo "The quotient for $var1/$var2 = $var3";
}
division();
?>
</body>
</html>
