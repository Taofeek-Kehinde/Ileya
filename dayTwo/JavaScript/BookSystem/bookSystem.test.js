const { addBook, removeBook, updateBook, showAllBooks, suggestBook, bookList } = require('./bookSystem');

// Clear all books before each test
beforeEach(() => {
    while (bookList.length > 0) {
        bookList.pop();
    }
});

test('Add book should put book in list', () => {
    addBook("The Hobbit");
    expect(bookList.length).toBe(1);
    expect(bookList[0]).toBe("The Hobbit");
});

test('Add same book should not work', () => {
    addBook("The Hobbit");
    let result = addBook("The Hobbit");
    expect(result).toBe("Book already exists");
});

test('Remove book should take book out', () => {
    addBook("Harry Potter");
    removeBook("Harry Potter");
    expect(bookList.length).toBe(0);
});

test('Remove fake book should say not found', () => {
    let result = removeBook("Fake Book");
    expect(result).toBe("Book not found");
});

test('Update book should change name', () => {
    addBook("Brave Kind");
    updateBook("Brave Kind", "Brave Kingdom");
    expect(bookList[0]).toBe("Brave Kingdom");
});

test('Suggest book should return random book', () => {
    addBook("Test Book");
    let [bookTitle, pageNumber] = suggestBook();
    expect(bookTitle).toBe("Test Book");
    expect(Number(pageNumber)).toBeGreaterThanOrEqual(1);
    expect(Number(pageNumber)).toBeLessThanOrEqual(100);
});
