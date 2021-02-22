<?php

class Animal
{
    private string $family  ;
    private string $food   ;

    public function __construct( $family, $food)
    {
        $this->family = $family;
        $this->food = $food;
    }

    /**
     * @return mixed
     */
    public function getFamily() : int
    {
        return $this->family;
    }

    /**
     * @return mixed
     */
    public function getFood()
    {
        return $this->food;
    }

    /**
     * @param mixed $family
     */
    public function setFamily($family): void
    {
        $this->family = $family;
    }

    /**
     * @param mixed $food
     */
    public function setFood($food): void
    {
        $this->food = $food;
    }


}
?>