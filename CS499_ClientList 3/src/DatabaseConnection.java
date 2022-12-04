import java.sql.Connection; //used to establish connection with database
import java.sql.DriverManager; //allows use of jdbc to connect with database server
import java.sql.SQLException; //provides additional info on any SQL errors
import java.sql.Statement; //imported to allow for use of SQL statement queries

//database connection class to connect to and communicate with MySQL database
public class DatabaseConnection {
	Connection conn = null;
	Statement stmt = null;{
	
	try {
		//establishes connection to SQL server and connects to database "clientList
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Connecting to the database");
		conn = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/clientList","root","");
		System.out.println("You are now connected to the database");
		//createStatement method assigns SQL statement to new stmt object of Statement class
		System.out.println("Inserting client records into the clientList database");
		stmt = conn.createStatement();
		
		//SQL queries to insert values into clientList database
		String sql = "INSERT INTO clientList " + 
		"VALUES(Bob Jones)";
		stmt.executeUpdate(sql);
		
		sql = "INSERT INTO clientList " + 
		"VALUES(Sarah Davis)";
		stmt.executeUpdate(sql);
		
		sql = "INSERT INTO clientList " + 
		"VALUES(Amy Friendly)";
		stmt.executeUpdate(sql);
		
		sql = "INSERT INTO clientList " + 
		"VALUES(Johnny Smith)";
		stmt.executeUpdate(sql);
		
		sql = "INSERT INTO clientList " + 
		"VALUES(Carol Spears)";
		stmt.executeUpdate(sql);
		
	}catch(SQLException se) {
		se.printStackTrace();
		
	}catch(Exception e) {
		e.printStackTrace();
	
	}finally {
		try {
			if(stmt != null)
				conn.close();
		}catch(SQLException se) {
	}try {
		if(conn != null)
			conn.close();
		
	}catch(SQLException se) {
		se.printStackTrace();
	}

}

}

	public Connection getConnection() {
		// method returns "conn" object from Connection class
		return conn;
	}

	
}

