package edu.mu.libraryapp;

import edu.mu.libraryapp.user.*;

public class LibraryApp {

	public static void main(String[] args) {
		/**
		 * Creates new Library
		 */
		Library library = new Library();
		
		/**
		 * Creating books using parameterized constructor
		 */
		Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99);
		Book book2 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99);
		
		/**
		 * Creating book using default constructor and setters
		 */
		Book book3 = new Book();
		book3.setTitle("The Pragmatic Programmer");
		book3.setAuthor("Andrew Hunt");
		book3.setISBN("978-0135957059");
		book3.setPrice(45.99);
		
		/**
		 * Adding books to library
		 */
		System.out.println("Adding books...");
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		/**
		 * Testing findISBN method
		 */
		System.out.println("\nSearching for book with ISBN: 978-0135166307");
		Book foundBook = library.findISBN("978-0135166307");
		if (foundBook == null) {
			System.out.println("Book could not be found.\n");
		}
		else {
			System.out.println("Book found: " + foundBook + "\n");
		}
		
		/**
		 * Testing showBooks method
		 */
		library.showBooks();
		
		
		/**
		 * Removing a book that exists
		 */
		library.removeBook(book2);
		
		/**
		 * Printing books in library after removing a book 
		 */
		library.showBooks();
		
		/**
		 * Attempting to remove book that is not in library
		 */
		library.removeBook(book2);
	}

}
