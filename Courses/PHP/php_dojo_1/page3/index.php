<?php
$price = 10;
$taxRate = 0.08;
echo 'Value of $price: '.$price;
echo '<br>';
echo 'Value of $taxRate: '.$taxRate;
echo '<br>';
echo '-----';
echo '<br>';

// Write your code below
$afterTax =  $price + $price * $taxRate;
echo "The price after tax is $" . "{$afterTax}"; 

?>