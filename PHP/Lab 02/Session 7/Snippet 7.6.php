<?php
$anon_class_obj = new class {
    public $greeting = 'hello';
    public $id = 754;
    const SETT = "Some configuration";
    public function getValue(){
        return 'some returned value';
    }
    public function  getValueWithArg($str1){
        return 'returned value is '.$str1;
    }
};
echo $anon_class_obj ->greeting , "<br>";

echo $anon_class_obj::SETT;