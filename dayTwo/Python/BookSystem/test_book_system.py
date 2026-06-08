# PSEUDOCODE:
# Test if we can add a book
# Test if we can remove a book  
# Test if we can update a book
# Test if we can see all books
# Test if we can get a random book suggestion

import unittest
import book_system

class TestBookSystem(unittest.TestCase):
    
    def test_that_add_book_works(self):
        book_system.add_book("The Hobbit")
        
    def test_that_add_book_returns_success(self):
        result = book_system.add_book("The Mystery")
        self.assertEqual(result, "Book added successfully")
    
    def test_that_add_same_book_returns_error(self):
        book_system.add_book("The Mystery")
        result = book_system.add_book("The Mystery")
        self.assertEqual(result, "Book already exists")
    
    def test_that_remove_book_works(self):
        book_system.add_book("Harry Potter")
        book_system.remove_book("Harry Potter")
        
    def test_that_remove_book_returns_success(self):
        book_system.add_book("1984")
        result = book_system.remove_book("1984")
        self.assertEqual(result, "Book removed successfully")
    
    def test_that_update_book_works(self):
        book_system.add_book("Brave Kind")
        book_system.update_book("Brave Kind", "Brave Kingdom")
    
    def test_that_suggest_book_returns_two_things(self):
        book_system.add_book("The Hobbit")
        book, page = book_system.suggest_book()
        self.assertEqual(book, "The Mystery")
