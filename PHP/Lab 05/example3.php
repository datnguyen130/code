<?php
$query = "SELECT * FROM classics";
$result = $conn->query($query);
if (!$result) die ($conn->error);
?>
