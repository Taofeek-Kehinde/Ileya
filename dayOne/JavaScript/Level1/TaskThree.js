function isPerfectSquare(number) {
    let current = 0;
    while (current * current < number)
 current ++;
    return current * current == number;   

}

const numbers = [4,7,9,10,16,18];
const perfectSquare = numbers.filter(isPerfectSquare);

console.log(perfectSquare);
