	package Week12;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;
	
	public class EBookDataAccessLayer {
		
		private static Connection getConnection() throws Exception {
			// Step 1: Connect to the database via a 'Connection' object called 'connect1'
	        Connection connect1 = DriverManager.getConnection(
	              "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
	              "root", "root");
			return connect1;
		}
		
		public static List<Book> getBooks() throws Exception{
			
			Connection connect1 = getConnection();
			Statement stmt = connect1.createStatement();
			
			String strSelect = "select * from books";
			ResultSet rset = stmt.executeQuery(strSelect);
			
			
			List<Book> bookList = new ArrayList<Book>();
			while(rset.next()) {   // Repeatedly process each row
				int id = rset.getInt("id");
	            String title = rset.getString("title");  // retrieve a 'String'-cell in the row          
	            double price = rset.getDouble("price");
	            int quantity = rset.getInt("qty");
	            Book book = new Book(id, title, price, quantity);
	            bookList.add(book);
	         }
			 return bookList;
		}
		
		public static Book getBookId(int bookId) throws Exception{
			
			Connection connect1 = getConnection();
			Statement stmt = connect1.createStatement();
			
			String strSelect = "select id, title, price, qty from books where id ="+ bookId;
			ResultSet rset = stmt.executeQuery(strSelect);
			
			
			Book book = null;
			while(rset.next()) {   // Repeatedly process each row
				int id = rset.getInt("id");
	            String title = rset.getString("title");  // retrieve a 'String'-cell in the row       
	            double price = rset.getFloat("price");
	            int quantity = rset.getInt("qty");
	            book = new Book(id, title, price, quantity);
	         }
			 return book;
		}
		
	public static int updateBook(Book book) throws Exception{
			
			Connection connect1 = getConnection();
			Statement stmt = connect1.createStatement();
			
			String strUpdatePrice = "update books set price =" + book.getPrice() + ", qty=" + book.getQuantity() + " where id =" + book.getId();
			int rowCount = stmt.executeUpdate(strUpdatePrice);
			return rowCount;
		
		}
	
	public static int deleteBook(int bookId) throws Exception {
		
		Connection connect1 = getConnection();
		Statement stmt = connect1.createStatement();
		
		String strDelete = "delete from books where id >= 3000 and id < 4000";
		int rowCount = stmt.executeUpdate(strDelete);
		return rowCount;
	}
	
	public static int insertBook(Book book) throws Exception{
		
		Connection connect1 = getConnection();
		Statement stmt = connect1.createStatement();
		
		String strInsert = "insert into books values (" +book.getId()+ ","+ "'"+ book.getTitle()+ "'"+ "," + " 'Anand Neelakanthan' , " + book.getPrice()+ ","+ book.getQuantity()+")";
		int rowCount = stmt.executeUpdate(strInsert);
		return rowCount;
	
	}
	
}
	
	
