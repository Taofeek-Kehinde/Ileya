const totalNumbers = [45, 60, 3, 10, 9, 2];
const oddNumbers = totalNumbers.filter(numbers => numbers % 2 != 0);
const evenNumbers = totalNumbers.filter(numbers => numbers % 2 == 0);
const result = [oddNumbers, evenNumbers];

console.log(result);  
