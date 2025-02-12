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
	
}
