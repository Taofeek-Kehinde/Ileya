const { addBook, removeBook, updateBook, showAllBooks, suggestBook } = require('./bookSystem');
const prompt = require('prompt-sync')();

console.log("Welcome to the Book Suggestions System!");

while (true) {
    console.log("\n1. Get Suggestions");
    console.log("2. Add Book");
    console.log("3. Remove Book");
    console.log("4. Update book");
    console.log("5. Show all books");
    console.log("6. Exit");
    
    let userChoice = prompt("Enter operation: ");
    
    if (userChoice === "1") {
        while (true) {
            let [bookTitle, pageNumber] = suggestBook();
            console.log(`\nBook for the Day: Book Title: ${bookTitle} Page: ${pageNumber}`);
            let userAnswer = prompt("Would you like another suggestion? (yes/no): ");
            if (userAnswer === "no") {
                break;
            }
        }
    }
    
    else if (userChoice === "2") {
        let bookTitle = prompt("Enter the book title: ");
        let operationResult = addBook(bookTitle);
        console.log(operationResult);
    }
    
    else if (userChoice === "3") {
        let bookTitle = prompt("Enter the book title to remove: ");
        let operationResult = removeBook(bookTitle);
        console.log(operationResult);
    }
    
    else if (userChoice === "4") {
        let oldBookTitle = prompt("Enter the old title: ");
        let newBookTitle = prompt("Enter the new title: ");
        let operationResult = updateBook(oldBookTitle, newBookTitle);
        console.log(operationResult);
    }
    
    else if (userChoice === "5") {
        let allBookTitles = showAllBooks();
        if (allBookTitles.length === 0) {
            console.log("No books available");
        } else {
            console.log("\nAll Books:");
            for (let bookPosition = 0; bookPosition < allBookTitles.length; bookPosition++) {
                let displayNumber = bookPosition + 1;
                console.log(`${displayNumber}. ${allBookTitles[bookPosition]}`);
            }
        }
    }
    
    else if (userChoice === "6") {
        console.log("\nTHANKS! Hope that was fun?");
        break;
    }
    
    else {
        console.log("Invalid choice! Pick 1-6");
    }
}
