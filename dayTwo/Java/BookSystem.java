
public class BookSystem {

    public static String[] bookStorage = new String[1000];

    public static int numberOfBooks = 0;
    
    public static String addBook(String bookTitle) {
        // Check if book already exists
        for (int position = 0; position < numberOfBooks; position++) {
            if (bookStorage[position].equals(bookTitle)) {
                return "Book already exists";
            }
        }
        
        // Add new book 
        bookStorage[numberOfBooks] = bookTitle;
        numberOfBooks = numberOfBooks + 1;
        return "Book added successfully";
    }
    
    public static String removeBook(String bookTitle) {
        for (int position = 0; position < numberOfBooks; position++) {
            if (bookStorage[position].equals(bookTitle)) {
                // Shift books left
                for (int shift = position; shift < numberOfBooks - 1; shift++) {
                    bookStorage[shift] = bookStorage[shift + 1];
                }
                numberOfBooks = numberOfBooks - 1;
                return "Book removed successfully";
            }
        }
        return "Book not found";
    }
    
    public static String updateBook(String oldBookTitle, String newBookTitle) {
        for (int position = 0; position < numberOfBooks; position++) {
            if (bookStorage[position].equals(oldBookTitle)) {
                bookStorage[position] = newBookTitle;
                return "Book updated successfully";
            }
        }
        return "Book not found";
    }
    
    public static String[] showAllBooks() {
        String[] allBooks = new String[numberOfBooks];
        for (int position = 0; position < numberOfBooks; position++) {
            allBooks[position] = bookStorage[position];
        }
        return allBooks;
    }
    
    public static String[] suggestBook() {
        String[] suggestion = new String[2];
        
        if (numberOfBooks == 0) {
            suggestion[0] = "No books available";
            suggestion[1] = "0";
            return suggestion;
        }

        return suggestion;
    }
}
