const prompt = require('prompt-sync')();

console.log("Welcome to Credit Card Validator!");
console.log("Enter your credit card number (numbers only):");
let user_card_number = prompt("Enter your card number: ");

let card_number_without_spaces = "";
for (let character_position = 0; character_position < user_card_number.length; character_position++) {
    let current_character = user_card_number[character_position];
    if (current_character != " ") {
        card_number_without_spaces = card_number_without_spaces + current_character;
    }
}

let number_of_digits = card_number_without_spaces.length;
console.log("Your card has", number_of_digits, "digits");

let first_digit = card_number_without_spaces[0];

let first_two_digits = "";
if (number_of_digits >= 2) {
    first_two_digits = card_number_without_spaces[0] + card_number_without_spaces[1];
}

let card_type = "";
if (first_digit == "4") {
    card_type = "Visa";
} else if (first_digit == "5") {
    card_type = "MasterCard";
} else if (first_two_digits == "37") {
    card_type = "American Express";
} else if (first_digit == "6") {
    card_type = "Discover";
} else {
    card_type = "Unknown";
}

console.log("Card type:", card_type);

let sum_of_doubled_digits = 0;      
let sum_of_odd_position_digits = 0; 
let position_from_right = 1;         

for (let current_position = number_of_digits - 1; current_position >= 0; current_position--) {
    let current_digit = parseInt(card_number_without_spaces[current_position]);
    
    if (position_from_right % 2 == 0) {  
        let doubled_value = current_digit * 2;
        
        if (doubled_value >= 10) {
            let tens_digit = Math.floor(doubled_value / 10);
            let ones_digit = doubled_value % 10;
            sum_of_doubled_digits = sum_of_doubled_digits + tens_digit + ones_digit;
        } else {
            sum_of_doubled_digits = sum_of_doubled_digits + doubled_value;
        }
    } else { 
        sum_of_odd_position_digits = sum_of_odd_position_digits + current_digit;
    }
    
    position_from_right = position_from_right + 1;
}

console.log("sum of all doubled digits :", sum_of_doubled_digits);
console.log("sum of odd position digits :", sum_of_odd_position_digits);

let total_sum = sum_of_doubled_digits + sum_of_odd_position_digits;
console.log("Total sum:", total_sum);

let is_valid = "";
if (total_sum % 10 == 0) {
    console.log("\n 😍️ VALID! This credit card number is valid!");
    is_valid = "Valid";
} else {
    console.log("\n😡️ INVALID! This credit card number is NOT valid!");
    is_valid = "Invalid";
}

console.log("\n" + "=".repeat(50));
console.log("CREDIT CARD VALIDATION RESULT");
console.log("=".repeat(50));
console.log("Card number:", card_number_without_spaces);
console.log("Length:", number_of_digits, "digits");
console.log("Card type:", card_type);
console.log("Validity:", is_valid);
console.log("=".repeat(50));
