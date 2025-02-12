package edu.mu.libraryapp.user;
import java.util.Arrays;

public class Library {
	private Book[] books;
	private int count;
	
	public Library() {
		books = new Book[5];
		count = 0;
	} //it's not pushing properly?
	
	public boolean addBook(Book book) {
		if(count < books.length) {
			books[count++] = book;
			return true;
		}
		return false;
	}
	
	public boolean removeBook(Book book) {
		for(int i = 0; i<count;i++) {
			if(books[i].equals(book)) {
				books[i] = books[count-1];
				books[count-1] = null;
				count--;
				return true;
			}
		}
		return false;
	}
	
	public Book findISBN(String ISBN) {
		for(int i=0;i<count;i++) {
			if(books[i].getISBN().equals(ISBN)) {
				return books[i];
			}
		}
		return null;
	}
	
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
