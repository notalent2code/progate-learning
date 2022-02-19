<?php
class Menu {
  public $name;
  // Declare the $price property
  public $price;
  // Declare the $image property
  public $image;
  
  // Add the $price and $image parameters to the constructor
  public function __construct($name, $price, $image) {
    $this->name = $name;
    // Assign $price to the price property 
    $this->price = $price;
    // Assign $image to the image property
    $this->image = $image;
  }
  
}
?>