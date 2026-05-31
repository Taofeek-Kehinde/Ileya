import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter a word to encrypt: ");

        String plainTextMessage = inputReader.nextLine();

        System.out.print("Enter encryption shift value: ");

        int shiftAmount = inputReader.nextInt();

        String encryptedMessage = "";

        for (int position = 0; position < plainTextMessage.length(); position++) {

            char currentCharacter = plainTextMessage.charAt(position);

            char encryptedCharacter = (char) (currentCharacter + shiftAmount);

            encryptedMessage = encryptedMessage + encryptedCharacter;
        }

        System.out.println("Encrypted message: " + encryptedMessage);

    }
}
