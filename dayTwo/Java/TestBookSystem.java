// PSEUDOCODE:
// Test 1: Can we add a book?
// Test 2: Does add return success message?
// Test 3: Can we remove a book?
// Test 4: Can we update a book title?

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestBookSystem {
    
    @BeforeEach
    void cleanBooksBeforeEachTest() {
        BookSystem.bookStorage = new String[10];
        BookSystem.numberOfBooks = 0;
    }
    
    @Test
    void testThatAddBookIncreasesBookCount() {
        BookSystem.addBook("The Hobbit");
        assertEquals(1, BookSystem.numberOfBooks);
    }
    
    @Test
    void testThatAddBookReturnsSuccessMessage() {
        String result = BookSystem.addBook("Animal Farm");
        assertEquals("Book added successfully", result);
    }
    
    @Test
    void testThatAddingSameBookReturnsErrorMessage() {
        BookSystem.addBook("The Mystery");
        String result = BookSystem.addBook("The Mystery");
        assertEquals("Book already exists", result);
    }
    
    @Test
    void testThatRemoveBookDecreasesBookCount() {
        BookSystem.addBook("Harry Potter");
        BookSystem.removeBook("Harry Potter");
        assertEquals(0, BookSystem.numberOfBooks);
    }
    
    @Test
    void testThatUpdateBookChangesTitle() {
        BookSystem.addBook("Brave Kind");
        BookSystem.updateBook("Brave Kind", "Brave Kingdom");
        String[] allBooks = BookSystem.showAllBooks();
        assertEquals("Brave Kingdom", allBooks[0]);
    }
}
