import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Credit Card Validator!");
        System.out.println("Enter your credit card number (numbers only):");
        System.out.print("Enter your card number: ");
        String userCardNumber = scanner.nextLine();

        String cardNumberWithoutSpaces = "";
        for (int characterPosition = 0; characterPosition < userCardNumber.length(); characterPosition++) {
            char currentCharacter = userCardNumber.charAt(characterPosition);
            if (currentCharacter != ' ') {
                cardNumberWithoutSpaces = cardNumberWithoutSpaces + currentCharacter;
            }
        }
        
        int numberOfDigits = cardNumberWithoutSpaces.length();
        System.out.println("Your card has " + numberOfDigits + " digits");
        
        char firstDigit = cardNumberWithoutSpaces.charAt(0);
        
        String firstTwoDigits = "";
        if (numberOfDigits >= 2) {
            firstTwoDigits = cardNumberWithoutSpaces.substring(0, 2);
        }
        
        String cardType = "";
        if (firstDigit == '4') {
            cardType = "Visa";
        } else if (firstDigit == '5') {
            cardType = "MasterCard";
        } else if (firstTwoDigits.equals("37")) {
            cardType = "American Express";
        } else if (firstDigit == '6') {
            cardType = "Discover";
        } else {
            cardType = "Unknown";
        }
        
        System.out.println("Card type: " + cardType);
        
        // Start Luhn Algorithm to check if card is valid
        int sumOfDoubledDigits = 0;      
        int sumOfOddPositionDigits = 0; 
        int positionFromRight = 1;         
        
        for (int currentPosition = numberOfDigits - 1; currentPosition >= 0; currentPosition--) {
            char digitChar = cardNumberWithoutSpaces.charAt(currentPosition);
            int currentDigit = digitChar - '0';  
            
            if (positionFromRight % 2 == 0) {  
                int doubledValue = currentDigit * 2;
                
                if (doubledValue >= 10) {
                    int tensDigit = doubledValue / 10;
                    int onesDigit = doubledValue % 10;
                    sumOfDoubledDigits = sumOfDoubledDigits + tensDigit + onesDigit;
                } else {
                    sumOfDoubledDigits = sumOfDoubledDigits + doubledValue;
                }
            } else { 
                sumOfOddPositionDigits = sumOfOddPositionDigits + currentDigit;
            }
            
            positionFromRight = positionFromRight + 1;
        }
        
        System.out.println("sum of all doubled digits : " + sumOfDoubledDigits);
        System.out.println("sum of odd position digits : " + sumOfOddPositionDigits);
        
        int totalSum = sumOfDoubledDigits + sumOfOddPositionDigits;
        System.out.println("Total sum: " + totalSum);
        
        String isValid = "";
        if (totalSum % 10 == 0) {
            System.out.println("\n 😍️ VALID! This credit card number is valid!");
            isValid = "Valid";
        } else {
            System.out.println("\n😡️ INVALID! This credit card number is NOT valid!");
            isValid = "Invalid";
        }
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("CREDIT CARD VALIDATION RESULT");
        System.out.println("=".repeat(50));
        System.out.println("Card number: " + cardNumberWithoutSpaces);
        System.out.println("Length: " + numberOfDigits + " digits");
        System.out.println("Card type: " + cardType);
        System.out.println("Validity: " + isValid);
        System.out.println("=".repeat(50));
        
    }
}
