// PSEUDOCODE:
// Show menu options
// Get user choice
// Do what user wants

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Welcome to the Book Suggestions System!");
        
        while (true) {
            System.out.println();
            System.out.println("1. Get Suggestions");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Update book");
            System.out.println("5. Show all books");
            System.out.println("6. Exit");
            
            System.out.print("Enter operation: ");
            String userChoice = userInput.nextLine();
            
            // Option 1: Get random book suggestions
            if (userChoice.equals("1")) {
                while (true) {
                    String[] bookSuggestion = BookSystem.suggestBook();
                    System.out.println();
                    System.out.println("Book for the Day: Book Title: " + bookSuggestion[0] + " Page: " + bookSuggestion[1]);
                    System.out.print("Would you like another suggestion? (yes/no): ");
                    String userAnswer = userInput.nextLine();
                    if (userAnswer.equals("no")) {
                        break;
                    }
                }
            }
            
            // Option 2: Add a new book
            if (userChoice.equals("2")) {
                System.out.print("Enter the book title: ");
                String newBookTitle = userInput.nextLine();
                String operationResult = BookSystem.addBook(newBookTitle);
                System.out.println(operationResult);
            }
            
            // Option 3: Remove a book
            if (userChoice.equals("3")) {
                System.out.print("Enter the book title to remove: ");
                String bookToRemove = userInput.nextLine();
                String operationResult = BookSystem.removeBook(bookToRemove);
                System.out.println(operationResult);
            }
            
            // Option 4: Update a book title
            if (userChoice.equals("4")) {
                System.out.print("Enter the old title: ");
                String oldBookTitle = userInput.nextLine();
                System.out.print("Enter the new title: ");
                String newBookTitle = userInput.nextLine();
                String operationResult = BookSystem.updateBook(oldBookTitle, newBookTitle);
                System.out.println(operationResult);
            }
            
            // Option 5: Show all books
            if (userChoice.equals("5")) {
                String[] allBookTitles = BookSystem.showAllBooks();
                if (allBookTitles.length == 0) {
                    System.out.println("No books available");
                } else {
                    System.out.println();
                    System.out.println("All Books:");
                    for (int bookPosition = 0; bookPosition < allBookTitles.length; bookPosition++) {
                        int bookNumber = bookPosition + 1;
                        System.out.println(bookNumber + ". " + allBookTitles[bookPosition]);
                    }
                }
            }
            
            // Option 6: Exit program
            if (userChoice.equals("6")) {
                System.out.println();
                System.out.println("THANKS! Hope that was fun?");
                break;
            }
        }
    }
}
