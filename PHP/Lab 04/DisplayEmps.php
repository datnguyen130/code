<?php
include_once 'Employee.php';
$Emp_1 = new Employee();
$Emp_1->setManNo(001);
$Emp_1->setName("Harry");
$Emp_1->setPosition("Lv9");
$Emp_2 = new Employee();
$Emp_2->setManNo(002);
$Emp_2->setName("Voldermore");
$Emp_2->setPosition("Lv2");
echo print_r($Emp_1)."<Br>";

echo var_dump($Emp_2)."<BR>";
?>