package edu.mu.libraryapp.user;

import java.util.Arrays;

public class Library {
	
	/**
	 * Private attributes
	 */
	private Book[] books;
	private int count;
	
	/**
	 * Default constructor
	 */
	public Library() {
		books = new Book[5];
		count = 0;
	}
	
	/**
	 * Method to add a Book to Library
	 * @param book
	 * @return
	 */
	public boolean addBook(Book book) {
		if(count < books.length) {
			books[count++] = book;
			return true;
		}
		return false;
	}
	
	/**
	 * Method to remove a Book from Library
	 * @param book
	 * @return
	 */
	public boolean removeBook(Book book) {
		for(int i = 0; i<count;i++) {
			if(books[i].equals(book)) {
				books[i] = books[count-1];
				books[count-1] = null;
				count--;
				return true;
			}
		}
		System.out.println("Cannot remove book \"" + book + "\", book could not be found in library.");
		return false;
	}
	
	/**
	 * Method that finds a book using its ISBN
	 * @param ISBN
	 * @return
	 */
	public Book findISBN(String ISBN) {
		for(int i=0;i<count;i++) {
			if(books[i].getISBN().equals(ISBN)) {
				return books[i];
			}
		}
		return null;
	}
	
	/**
	 * Method that prints all books in the library
	 */
	public void showBooks() {
		if(count==0) {
			System.out.println("No books in the library.");
		}
		else {
			for(int i=0;i<count;i++) {
				System.out.println((i+1)+ ", "+books[i]);
			}
		}
	}
}
