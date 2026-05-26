# PSEUDOCODE:
# Make a list to store books
# add_book: put book in list
# remove_book: take book out of list
# update_book: change book name in list
# show_all_books: show everything in list
# suggest_book: pick random book and random page

import random

# My list of books
my_books = []

def add_book(name):
    # Check if book already in my list
    if name in my_books:
        return "Book already exists"
    # Add new book to my list
    my_books.append(name)
    return "Book added successfully"

def remove_book(name):
    # Check if book is in my list
    if name in my_books:
        my_books.remove(name)
        return "Book removed successfully"
    return "Book not found"

def update_book(old_name, new_name):
    # Find the old book and change it
    if old_name in my_books:
        # Get the position
        position = my_books.index(old_name)
        # Change to new name
        my_books[position] = new_name
        return "Book updated successfully"
    return "Book not found"

def show_all_books():
    # Just return my list
    return my_books

def suggest_book():
    # Pick a random book from my list
    book = random.choice(my_books)
    # Pick random page between 1 and 100
    page = random.randint(1, 101)
    return book, page
