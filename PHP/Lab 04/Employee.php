<?php
 class Employee {
    private $man_no;
    private $name;
    protected $position;

    public function __contruct(){
        $this->name = null;
        $this->man_no = null;
        $this->position = null;
    }

    /**
     * @param mixed $position
     */
    public function setPosition($position): void
    {
        $this->position = $position;
    }

    /**
     * @param mixed $name
     */
    public function setName($name): void
    {
        $this->name = $name;
    }

    /**
     * @param mixed $man_no
     */
    public function setManNo($man_no): void
    {
        $this->man_no = $man_no;
    }

    /**
     * @return mixed
     */
    public function getPosition()
    {
        return $this->position;
    }

    /**
     * @return mixed
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @return mixed
     */
    public function getManNo()
    {
        return $this->man_no;
    }

    public function toString(){

        return "Employee Detail : Man_no : " . $this->getManNo() . ",  name : " . $this->getName() . " ,  position : " .$this->getPosition();
    }

}
?>