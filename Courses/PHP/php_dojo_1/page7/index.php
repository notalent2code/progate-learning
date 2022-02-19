<?php
$prices = array(10, 6, 7, 8);
echo 'Value of $prices: ';
foreach ($prices as $price) {
  echo $price.' ';
}
echo '<br>';
echo '-----';
echo '<br>';

// Write your code below
$sum = 0;
foreach($prices as $price){
  $sum += $price;
}
echo "The total price is $" . "{$sum}" . '<br>';

$max = $prices[0];
foreach($prices as $price){
  if($price > $max){
    $max = $price;
  }
}
echo "The highest price is $" . "{$max}";


?>