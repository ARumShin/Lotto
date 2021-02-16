package lotto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		
		Connection conn=null;
		
		String url="jdbc:mysql://34.97.0.206:3306/lot";
//		String user="root";
		String user="god";
		String password="1004";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(url, user, password);
		
		return conn;
	}

}
