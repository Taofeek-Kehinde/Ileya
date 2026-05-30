import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Credit Card Validator!");
        System.out.println("Enter your credit card number (numbers only):");
        System.out.print("Enter your card number: ");
        String user_card_number = scanner.nextLine();

        String card_number_without_spaces = "";
        for (int character_position = 0; character_position < user_card_number.length(); character_position++) {
            char current_character = user_card_number.charAt(character_position);
            if (current_character != ' ') {
                card_number_without_spaces = card_number_without_spaces + current_character;
            }
        }
        
        int number_of_digits = card_number_without_spaces.length();
        System.out.println("Your card has " + number_of_digits + " digits");
        
        char first_digit = card_number_without_spaces.charAt(0);
        
        String first_two_digits = "";
        if (number_of_digits >= 2) {
            first_two_digits = card_number_without_spaces.substring(0, 2);
        }
        
        String card_type = "";
        if (first_digit == '4') {
            card_type = "Visa";
        } else if (first_digit == '5') {
            card_type = "MasterCard";
        } else if (first_two_digits.equals("37")) {
            card_type = "American Express";
        } else if (first_digit == '6') {
            card_type = "Discover";
        } else {
            card_type = "Unknown";
        }
        
        System.out.println("Card type: " + card_type);
        
        // Start Luhn Algorithm to check if card is valid
        int sum_of_doubled_digits = 0;      
        int sum_of_odd_position_digits = 0; 
        int position_from_right = 1;         
        
        for (int current_position = number_of_digits - 1; current_position >= 0; current_position--) {
            char digit_char = card_number_without_spaces.charAt(current_position);
            int current_digit = digit_char - '0';  
            
            if (position_from_right % 2 == 0) {  
                int doubled_value = current_digit * 2;
                
                if (doubled_value >= 10) {
                    int tens_digit = doubled_value / 10;
                    int ones_digit = doubled_value % 10;
                    sum_of_doubled_digits = sum_of_doubled_digits + tens_digit + ones_digit;
                } else {
                    sum_of_doubled_digits = sum_of_doubled_digits + doubled_value;
                }
            } else { 
                sum_of_odd_position_digits = sum_of_odd_position_digits + current_digit;
            }
            
            position_from_right = position_from_right + 1;
        }
        
        System.out.println("sum of all doubled digits : " + sum_of_doubled_digits);
        System.out.println("sum of odd position digits : " + sum_of_odd_position_digits);
        
        int total_sum = sum_of_doubled_digits + sum_of_odd_position_digits;
        System.out.println("Total sum: " + total_sum);
        
        String is_valid = "";
        if (total_sum % 10 == 0) {
            System.out.println("\n 😍️ VALID! This credit card number is valid!");
            is_valid = "Valid";
        } else {
            System.out.println("\n😡️ INVALID! This credit card number is NOT valid!");
            is_valid = "Invalid";
        }
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("CREDIT CARD VALIDATION RESULT");
        System.out.println("=".repeat(50));
        System.out.println("Card number: " + card_number_without_spaces);
        System.out.println("Length: " + number_of_digits + " digits");
        System.out.println("Card type: " + card_type);
        System.out.println("Validity: " + is_valid);
        System.out.println("=".repeat(50));
        
    }
}
