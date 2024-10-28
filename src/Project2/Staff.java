package Project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Staff implements Comparable<Staff> {
	
	public static void main(String[] args) throws SQLException {
		
	     try (
		         // Step 1: Connect to the database via a 'Connection' object called 'connect1'
		         Connection connect1 = DriverManager.getConnection(
		               "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
		               "root", "root");   // For MySQL only
		               // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"
		 
		         // Step 2: Construct a 'Statement' object called 'stmt' inside the Connection created
		         Statement stmt = connect1.createStatement();
		  ) {
	    	 
		         // Step 3: Write a SQL query string. Execute the SQL query via the 'Statement'.
		         String strSelect = "select title, price, qty from books";
		         System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging
		 
		         ResultSet rset = stmt.executeQuery(strSelect);
		 
		         // Step 4: Process the 'ResultSet' by scrolling the cursor forward via next().
		         //  For each row, retrieve the contents of the cells with getXxx(columnName).
		         System.out.println("The records selected are:");
		         int rowCount = 0;
		         // Row-cursor initially positioned before the first row of the 'ResultSet'.
		         // rset.next() inside the whole-loop repeatedly moves the cursor to the next row.
		         // It returns false if no more rows.
		         while(rset.next()) {   // Repeatedly process each row
		            String title = rset.getString("title");  // retrieve a 'String'-cell in the row
		            double price = rset.getDouble("price");  // retrieve a 'double'-cell in the row
		            int    qty   = rset.getInt("qty");       // retrieve a 'int'-cell in the row
		            System.out.println(title + ", " + price + ", " + qty);
		            ++rowCount;
		         }
		         System.out.println("Total number of records = " + rowCount);
		 
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }
	}

	@Override
	public int compareTo(Staff o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private static 

}
