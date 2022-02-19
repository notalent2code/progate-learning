<?php
$menus = array(
  array('name' => 'CURRY', 'price' => 9),
  array('name' => 'PASTA', 'price' => 12),
  array('name' => 'COFFEE', 'price' => 6)
);

// Write your code below
$sum = 0;
$max = $menus[0];
foreach($menus as $menu){
  echo $menu['name'] . ' is $' . $menu['price'] . '<br>';
  $sum += $menu['price'];
  if($menu['price'] > $max['price']){
    $max = $menu;
  }
}
echo 'The total price is $' . $sum;
echo 'The most expensive item is ' . $max['name'] . ' with the price $' . $max['price'];
?>