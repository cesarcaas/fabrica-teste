package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		String url = "jdbc:MySQL://localhost:3306/fabrica";         //db is the name of the database
		String user ="root";                                                  
		String password = "123456";

		try {

			//1. Create a connection
			Connection myConn = DriverManager.getConnection(url,user,password);
			
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute Query
			String sql = "insert into student "
					+"(Name, age, class)"
					+ " values ('Matt', 13, 7)";
			myStmt.executeUpdate(sql);
			System.out.println("Insert complete.");

            //4. Close connection
			myConn.close();
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}

}
