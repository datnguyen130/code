<html>
<body>
<?php
$to = "heksalty@gmail.com";
$from = "From: heksalty@gmail.com";
$subject = "Test e-mail";
$body = "This is an example for showing the useage of the mail function";
$send = mail($to, $subject, $body, $from);
if ($send){
    echo "Mail sent to $to address";
}
else{
    echo "Mail could not be sent";
}
?>
</body>
</html>
