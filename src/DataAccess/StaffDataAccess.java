package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Business.Staff;

public class StaffDataAccess {
	
	private static Connection getConnection() throws Exception {
		// Step 1: Connect to the database via a 'Connection' object called 'connect1'
        Connection connect1 = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
              "root", "root");
		return connect1;
	}
	
	public static List<Staff> getStaffDetails() throws Exception{
		Connection connect1 = getConnection();
		
		Statement stmt = connect1.createStatement();
		
		String strSelect = "select * from books";
		ResultSet rset = stmt.executeQuery(strSelect);
		int rowCount = 0;
		
		List<Staff> staffList = new ArrayList<Staff>();
		while(rset.next()) {   // Repeatedly process each row
            String title = rset.getString("title");  // retrieve a 'String'-cell in the row
            double price = rset.getDouble("price");  // retrieve a 'double'-cell in the row
            int    qty   = rset.getInt("qty");       // retrieve a 'int'-cell in the row
            System.out.println(title + ", " + price + ", " + qty);
            ++rowCount;
          //  staffList.add();
         }
		 return staffList;
	}

}
