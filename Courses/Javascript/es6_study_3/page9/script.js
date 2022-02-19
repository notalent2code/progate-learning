const number1 = 103;
const number2 = 72;
const number3 = 189;

// Write a function called getMax to get the maximum value
const getMax = (a, b, c)=>{
  let max = a;
  if(b > a){
    max = b;
  }else if(c > a){
    max = c;
  }
  return max;
}

// Print "The maximum value is __"
console.log(`The maximum value is ${getMax(number1, number2, number3)}`);
