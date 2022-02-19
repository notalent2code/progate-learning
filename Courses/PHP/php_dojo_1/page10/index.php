<?php
$menus = array(
  array('name' => 'CURRY', 'price' => 9),
  array('name' => 'PASTA', 'price' => 12),
  array('name' => 'COFFEE', 'price' => 6)
);

// Write your code below
$sum = 0;
foreach($menus as $menu){
  echo $menu['name'] . ' is $' . $menu['price'] . '<br>';
  $sum += $menu['price'];
}
echo 'The total price is $' . $sum;

?>