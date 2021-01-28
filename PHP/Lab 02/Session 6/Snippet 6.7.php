<html>
<head>
    <title>FORM INTEGER</title>
</head>
<body>
<?php
$var1 = $var2 = $var3 = 0;
$boo = true;
?>
<form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="post">
    <p>Enter two number and sumit to know addition operation</p>
    Number 1 : <input type="text" name="var1">
    Number 2 : <input type="text" name ="var2">
    <br><br>
    <input type="submit" name="submit" value="Submit">
</form>
<?php
if (isset($_POST['var1']) and isset($_POST['var2']) and is_numeric($_POST['var1']) and is_numeric($_POST['var2'])){
    $var1 = $_POST['var1'];
    $var2 = $_POST['var2'];
    $var3 = $var1 + $var2;
    echo "<h3> The addition of two number is : $var3</h3>";
}
else{
    $boo = false;
}
if ($boo = false){
    echo "Please try again";
}
?>
</body>
</html>