package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Calendar;

import db.DB;

public class InsertNoBanco {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;

		try {
			conn = DB.getConnection();
			//st = conn.createStatement();
			
			// create a sql date object so we can use it in our INSERT statement
			Calendar calendar = Calendar.getInstance();
			java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

			// the mysql insert statement
			String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
					+ " values (?, ?, ?, ?, ?)";

			String query1 = " insert into funcionario (fun_codigo, fun_nome, fun_sexo, fun_data_cadastro)"
					+ " values (?, ?, ?, ?)";
			
			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query1);
			preparedStmt.setString(1, "6");
			preparedStmt.setString(2, "Fred");
			preparedStmt.setString(3, "M");
			preparedStmt.setDate(4, startDate);
			//preparedStmt.setBoolean(4, false);
			//preparedStmt.setInt(5, 5000);

			// execute the preparedstatement
			preparedStmt.execute();

			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}

	}

}
