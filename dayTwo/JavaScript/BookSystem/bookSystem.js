// PSEUDOCODE:
// Store books in a list
// Random page between 1-100

// List to hold all my books
let bookList = [];

function addBook(bookName) {
    // Check if this book is already in my list
    for (let bookPosition = 0; bookPosition < bookList.length; bookPosition++) {
        if (bookList[bookPosition] === bookName) {
            return "Book already exists";
        }
    }
    
    // Add the new book to my list
    bookList.push(bookName);
    return "Book added successfully";
}

function removeBook(bookName) {
    // Look for the book in my list
    for (let bookPosition = 0; bookPosition < bookList.length; bookPosition++) {
        if (bookList[bookPosition] === bookName) {
            // Take the book out of my list
            bookList.splice(bookPosition, 1);
            return "Book removed successfully";
        }
    }
    return "Book not found";
}

function updateBook(oldBookName, newBookName) {
    // Look for the old book name
    for (let bookPosition = 0; bookPosition < bookList.length; bookPosition++) {
        if (bookList[bookPosition] === oldBookName) {
            // Change to new book name
            bookList[bookPosition] = newBookName;
            return "Book updated successfully";
        }
    }
    return "Book not found";
}

function showAllBooks() {
    return bookList;
}

function suggestBook() {
    // If no books, tell user
    if (bookList.length === 0) {
        return ["No books available", "0"];
    }
    
    // Pick random book from my list
    let randomBookPosition = Math.floor(Math.random() * bookList.length);
    let chosenBook = bookList[randomBookPosition];
    
    // Pick random page between 1 and 100
    let randomPageNumber = Math.floor(Math.random() * 100) + 1;
    
    return [chosenBook, String(randomPageNumber)];
}

// Share these functions with other files
module.exports = { addBook, removeBook, updateBook, showAllBooks, suggestBook, bookList };
