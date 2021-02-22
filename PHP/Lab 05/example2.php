<?php
require_once 'example1.php';
$conn = new mysqli($hn,$un, $pw,$db);
if ($conn -> connect_error) {
    die($conn->connect_error);
}
?>
