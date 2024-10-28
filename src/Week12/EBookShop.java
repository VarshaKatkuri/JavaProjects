package Week12;

import java.util.List;

public class EBookShop {
	public static void main(String[] args) {
		try {
			List<Book> books = Book.getBooks();
			books.forEach(b->System.out.print(b));
			
			Book book = new Book();
			book.getBook(1003);
			System.out.print(book.toString());
			double price = book.getPrice();
			//update
			book.setPrice(price* 1.07);
			book.setQuantity(book.getQuantity()+1);
			book.executeUpdate();
			
			//delete 
			book.deleteBook();
			
			Book book1 =  new Book(12345, "Ajaya", 12.35, 10);
			book1.insertBook();
			
			book.getBook(12345);
			System.out.print(book.toString());
			
		}
		catch(IllegalArgumentException e) {
			System.out.print(e.getMessage());
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
