<?php
require_once 'example1.php';
$conn = new mysqli($hn,$un, $pw,$db);
if ($conn -> connect_error) {
    die($conn->connect_error);
} else{
    echo "Connected to DB <BR>";
}

$query = "SELECT * FROM classics";
$result = $conn->query($query);
if (!$result) die ($conn->error);
$rows = $result->num_rows;
if ($rows >0){
    while ($rows = $result->fetch_assoc()){
        echo 'Author: '. $rows['author'] . " - Title: " . $rows['title'] . "- type: " . $rows['type'] . " - year: " . $rows['year'] . " - isbn: " . $rows['isbn'] . "<BR>";
    }
} else {
    echo "0 result";
}
echo "<BR>";
if ($rows >0){
    while ($rows = mysqli_fetch_array($result)){
        echo 'Author: '. $rows['1'] . " - Title: " . $rows['2'] . "- type: " . $rows['3'] . " - year: " . $rows['4'] . " - isbn: " . $rows['5'] . "<BR>";
    }
} else {
    echo "0 result";
}


$result->close();
$conn->close();
?>


