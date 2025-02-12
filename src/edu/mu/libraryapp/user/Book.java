package edu.mu.libraryapp.user;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private double price;
	
	public Book() {
		title = "Unknown";
		author = "Unknown";
		isbn = "Unknown";
		price = 0.0;
	}

	public Book(String title, String author, String isbn, double price) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	
	public Book(Book book) {
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.isbn = book.getISBN();
		this.price = book.getPrice();
	}

	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getISBN() {
		return isbn;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return title + " by " + author + " (ISBN:" + isbn + ", $" + price + ")";
	}
	
	
}
