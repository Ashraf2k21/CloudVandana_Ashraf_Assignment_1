const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter numbers separated by spaces: ', (input) => {
  const numbers = input.split(' ').map(Number);
  
  numbers.sort(function(a, b) {
    return b - a;
  });

  console.log("Sorted array in descending order:", numbers);
  rl.close();
});

