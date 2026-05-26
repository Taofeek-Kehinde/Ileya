# PSEUDOCODE:
# Step 1: Show menu with 6 options
# Step 2: Ask user to type a number
# Step 3: If number 1 - Keep showing random books until user says no
# Step 4: If number 2 - Ask for book title and add it
# Step 5: If number 3 - Ask for book title and remove it
# Step 6: If number 4 - Ask for old and new title, then update
# Step 7: If number 5 - Show all books with numbers
# Step 8: If number 6 - Exit the program

import book_system

print("Welcome to the Book Suggestions System!")

while True:
    print("")
    print("1. Get Suggestions")
    print("2. Add Book")
    print("3. Remove Book")
    print("4. Update book")
    print("5. Show all books")
    print("6. Exit")
    
    choice = input("Enter operation: ")
    
    # first option: Get random book suggestions
    if choice == "1":
        while True:
            # Get a random book and random page
            book_title, page_number = book_system.suggest_book()
            print("")
            print("Book for the Day: Book Title:", book_title, "Page:", page_number)
            
            # Ask if user wants another suggestion
            answer = input("Would you like another suggestion? (yes/no): ")
            if answer == "no":
                break
    
    # second option: Add a new book to the store
    if choice == "2":
        book_title = input("Enter the book title: ")
        result = book_system.add_book(book_title)
        print(result)
    
    # third option: Remove a book from the list
    if choice == "3":
        book_title = input("Enter the book title to remove: ")
        result = book_system.remove_book(book_title)
        print(result)
    
    # forth option: Update the book title
    if choice == "4":
        old_title = input("Enter the old title: ")
        new_title = input("Enter the new title: ")
        result = book_system.update_book(old_title, new_title)
        print(result)
    
    # third option: Show all books
    if choice == "5":
        all_books = book_system.show_all_books()
        
        # Checking if there are any books
        if len(all_books) == 0:
            print("No books available")
        else:
            print("")
            print("All Books:")
            
            for position in range(len(all_books)):
                book_number = position + 1
                book_title = all_books[position]
                print(book_number, book_title)
    
    # last option: Exit
    if choice == "6":
        print("")
        print("THANKS! Hope that was fun?")
        break
