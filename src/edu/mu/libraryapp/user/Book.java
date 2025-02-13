package edu.mu.libraryapp.user;

public class Book {
	
	// Private attributes
	private String title;
	private String author;
	private String isbn;
	private double price;
	
	// Default Constructor
	public Book() {
		title = "Unknown";
		author = "Unknown";
		isbn = "Unknown";
		price = 0.0;
	}

	/**
	 * Parameterized Constructor
	 * @param title
	 * @param author
	 * @param isbn
	 * @param price
	 */
	public Book(String title, String author, String isbn, double price) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	
	/**
	 * Copy Constructor
	 * @param book
	 */
	public Book(Book book) {
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.isbn = book.getISBN();
		this.price = book.getPrice();
	}

	// Accessor method for title
	public String getTitle() {
		return title;
	}
	
	// Accessor method for author
	public String getAuthor() {
		return author;
	}
	
	// Accessor method for ISBN
	public String getISBN() {
		return isbn;
	}
	
	// Accessor method for price
	public double getPrice() {
		return price;
	}
	
	/**
	 * Mutator method for title
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Mutator method for author
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * Mutator method for ISBN
	 * @param isbn
	 */
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * Mutator method for price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	// toString method
	@Override
	public String toString() {
		return title + " by " + author + " (ISBN:" + isbn + ", $" + price + ")";
	}

	/**
	 * equals method
	 * @param other
	 */
	@Override
	public boolean equals(Object other) {
		Book book = (Book)other;
		if (this.isbn.equals(book.getISBN())) { 
			return true;
		}
		return false;
	}
}
