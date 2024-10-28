package Week12;

import java.sql.*;
import java.util.List;


public class Book {

	private int id; 
	private String title;
	private double price;
	private int quantity;
	
	public Book() {
		
	}
	public Book(int id, String title, double price, int quantity){
		setId(id);
		setTitle(title);
		setPrice(price);
		setQuantity(quantity);
	}
	
	public void setId(int id) throws IllegalArgumentException {
		if(id < 0) {
			throw new IllegalArgumentException("Id cannot be negative");
		}
		this.id = id;
	}
	public void setTitle(String title) throws IllegalArgumentException {
		if(title == null) {
			throw new IllegalArgumentException("Title cannot be null");
		}
		this.title = title;
	}
	public void setPrice(double price) throws IllegalArgumentException {
		if(price < 0) {
			throw new IllegalArgumentException("Title cannot be null");
		}
		this.price = price;
	}
	
	public void setQuantity(int quantity) throws IllegalArgumentException {
		if(quantity < 0) {
			throw new IllegalArgumentException("Title cannot be null");
		}
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public static List<Book> getBooks() throws Exception{
		List<Book> bookList = EBookDataAccessLayer.getBooks();
		return bookList;
	}
	
	public Book getBook(int bookId) throws Exception{
		
		setId(bookId);
		Book book = EBookDataAccessLayer.getBookId(bookId);
		if(book != null) {
			setTitle(book.title);
		}
		return book;
	}
	
	public int executeUpdate() throws Exception {
		return EBookDataAccessLayer.updateBook(this);
	}
	
	
	public int deleteBook() throws Exception {
		return EBookDataAccessLayer.deleteBook(this.id);
	}
	
	public int insertBook() throws Exception {
		return EBookDataAccessLayer.insertBook(this);
	}
	
	
	 public String toString() {
	      return "Book ID: " + getId() + "\n" +
          "Title: " + getTitle()+ "\n";
	    }
}
	
