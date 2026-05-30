import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Semicolon Store Checkout System");
        System.out.println("Available products:");
        System.out.println("  apple - ₦100");
        System.out.println("  banana - ₦50");
        System.out.println("  orange - ₦75");
        System.out.println("  milk - ₦200");
        System.out.println("  bread - ₦150");
        
        String product1 = "";
        int quantity1 = 0;
        int price1 = 0;
        
        String product2 = "";
        int quantity2 = 0;
        int price2 = 0;
        
        String product3 = "";
        int quantity3 = 0;
        int price3 = 0;
        
        String product4 = "";
        int quantity4 = 0;
        int price4 = 0;
        
        String product5 = "";
        int quantity5 = 0;
        int price5 = 0;
        
        int itemCounter = 0;
        
        while (true) {
            System.out.print("\nDo you want to add product to cart? (yes/no): ");
            String userChoice = scanner.nextLine();
            if (!userChoice.equals("yes")) {
                break;
            }
            
            System.out.print("Enter product name: ");
            String selectedProduct = scanner.nextLine();
            selectedProduct = selectedProduct.toLowerCase();
            
            int productPrice = 0;
            if (selectedProduct.equals("apple")) {
                productPrice = 100;
            } else if (selectedProduct.equals("banana")) {
                productPrice = 50;
            } else if (selectedProduct.equals("orange")) {
                productPrice = 75;
            } else if (selectedProduct.equals("milk")) {
                productPrice = 200;
            } else if (selectedProduct.equals("bread")) {
                productPrice = 150;
            } else {
                System.out.println("Product not found! Available products: apple, banana, orange, milk, bread");
                continue;
            }
            
            System.out.print("Enter quantity: ");
            String quantityInput = scanner.nextLine();
            int quantityBought = 0;
            
            if (quantityInput.equals("1")) {
                quantityBought = 1;
            } else if (quantityInput.equals("2")) {
                quantityBought = 2;
            } else if (quantityInput.equals("3")) {
                quantityBought = 3;
            } else if (quantityInput.equals("4")) {
                quantityBought = 4;
            } else if (quantityInput.equals("5")) {
                quantityBought = 5;
            } else {
                quantityBought = Integer.valueOf(quantityInput);
            }
            
            itemCounter = itemCounter + 1;
            
            if (itemCounter == 1) {
                product1 = selectedProduct;
                quantity1 = quantityBought;
                price1 = productPrice;
            } else if (itemCounter == 2) {
                product2 = selectedProduct;
                quantity2 = quantityBought;
                price2 = productPrice;
            } else if (itemCounter == 3) {
                product3 = selectedProduct;
                quantity3 = quantityBought;
                price3 = productPrice;
            } else if (itemCounter == 4) {
                product4 = selectedProduct;
                quantity4 = quantityBought;
                price4 = productPrice;
            } else if (itemCounter == 5) {
                product5 = selectedProduct;
                quantity5 = quantityBought;
                price5 = productPrice;
            }
        }
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("CUSTOMER INVOICE");
        System.out.println("=".repeat(50));
        System.out.println("Product          Quantity     Unit Price     Total");
        System.out.println("-".repeat(50));
        
        int totalBeforeTax = 0;
        
        if (itemCounter >= 1) {
            int lineTotal = quantity1 * price1;
            totalBeforeTax = totalBeforeTax + lineTotal;
            System.out.println(product1 + "              " + quantity1 + "            ₦" + price1 + "          ₦" + lineTotal);
        }
        
        if (itemCounter >= 2) {
            int lineTotal = quantity2 * price2;
            totalBeforeTax = totalBeforeTax + lineTotal;
            System.out.println(product2 + "              " + quantity2 + "            ₦" + price2 + "          ₦" + lineTotal);
        }
        
        if (itemCounter >= 3) {
            int lineTotal = quantity3 * price3;
            totalBeforeTax = totalBeforeTax + lineTotal;
            System.out.println(product3 + "              " + quantity3 + "            ₦" + price3 + "          ₦" + lineTotal);
        }
        
        if (itemCounter >= 4) {
            int lineTotal = quantity4 * price4;
            totalBeforeTax = totalBeforeTax + lineTotal;
            System.out.println(product4 + "              " + quantity4 + "            ₦" + price4 + "          ₦" + lineTotal);
        }
        
        if (itemCounter >= 5) {
            int lineTotal = quantity5 * price5;
            totalBeforeTax = totalBeforeTax + lineTotal;
            System.out.println(product5 + "              " + quantity5 + "            ₦" + price5 + "          ₦" + lineTotal);
        }
        
        System.out.println("-".repeat(50));
        System.out.println("Subtotal                                      ₦" + totalBeforeTax);
        
        double discountAmount = totalBeforeTax * 0.10;
        double vatAmount = totalBeforeTax * 0.075;
        double finalTotal = totalBeforeTax - discountAmount + vatAmount;
        
        System.out.println("Discount (10%)                               -₦" + discountAmount);
        System.out.println("VAT (7.5%)                                   +₦" + vatAmount);
        System.out.println("=".repeat(50));
        System.out.println("TOTAL AMOUNT DUE                             ₦" + finalTotal);
        System.out.println("=".repeat(50));
        System.out.println("Thank you for shopping at Semicolon Store!");
    }
}
