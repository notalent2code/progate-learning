<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Progate</title>
  <link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>

  <?php

    // Assign a number to $num
    $num = 12;
    // Assign the remainder of $num divided by 3
    $remainder = $num % 3;
    
    switch($remainder){
      case 0:
        echo 'Very lucky!!';
        break;
      case 1:
        echo 'Lucky!';
        break;
      case 2:
        echo 'A little lucky.';
        break;
      default:
        echo 'Unlucky..';
        break;
    }
    
  ?>

</body>
</html>