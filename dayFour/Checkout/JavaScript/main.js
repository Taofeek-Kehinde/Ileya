let cartProducts = [];
let cartQuantities = [];
let cartPrices = [];
let itemCount = 0;

console.log("Welcome to Semicolon Store Checkout System");
console.log("Available products:");
console.log("  apple - ₦100");
console.log("  banana - ₦50");
console.log("  orange - ₦75");
console.log("  milk - ₦200");
console.log("  bread - ₦150");

while (true) {
    let userChoice = prompt("\nDo you want to add product to cart? (yes/no): ");
    if (userChoice !== "yes") {
        break;
    }
    
    let selectedProduct = prompt("Enter product name: ");
    selectedProduct = selectedProduct.toLowerCase();
    
    let productPrice = 0;
    if (selectedProduct === "apple") {
        productPrice = 100;
    } else if (selectedProduct === "banana") {
        productPrice = 50;
    } else if (selectedProduct === "orange") {
        productPrice = 75;
    } else if (selectedProduct === "milk") {
        productPrice = 200;
    } else if (selectedProduct === "bread") {
        productPrice = 150;
    } else {
        console.log("Product not found! Available products: apple, banana, orange, milk, bread");
        continue;
    }
    
    let quantityInput = prompt("Enter quantity: ");
    let quantityBought = Number(quantityInput);
    
    cartProducts[itemCount] = selectedProduct;
    cartQuantities[itemCount] = quantityBought;
    cartPrices[itemCount] = productPrice;
    itemCount = itemCount + 1;
}

console.log("\n" + "=".repeat(50));
console.log("CUSTOMER INVOICE");
console.log("=".repeat(50));
console.log("Product          Quantity     Unit Price     Total");
console.log("-".repeat(50));

let totalBeforeTax = 0;

for (let index = 0; index < itemCount; index++) {
    let lineTotal = cartQuantities[index] * cartPrices[index];
    totalBeforeTax = totalBeforeTax + lineTotal;
    console.log(cartProducts[index] + "              " + cartQuantities[index] + "            ₦" + cartPrices[index] + "          ₦" + lineTotal);
}

console.log("-".repeat(50));
console.log("Subtotal                                      ₦" + totalBeforeTax);

let discountAmount = totalBeforeTax * 0.10;
let vatAmount = totalBeforeTax * 0.075;
let finalTotal = totalBeforeTax - discountAmount + vatAmount;

console.log("Discount (10%)                               -₦" + discountAmount);
console.log("VAT (7.5%)                                   +₦" + vatAmount);
console.log("=".repeat(50));
console.log("TOTAL AMOUNT DUE                             ₦" + finalTotal);
console.log("=".repeat(50));
console.log("Thank you for shopping at Semicolon Store!");
