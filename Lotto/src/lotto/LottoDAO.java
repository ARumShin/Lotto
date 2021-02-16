package lotto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LottoDAO {
	public void Connection(){
		Connection con = null;   
		ResultSet rs = null;
	
		String url = "jdbc:mysql://34.97.0.206:3306/lot";
		//String user = "shin";
		String user = "god";
		//String password="arum";
		String password="1004";
		      
		   try {
		      con = DriverManager.getConnection(url, user, password);
		      System.out.println("立加 己傍");
		   } catch (SQLException e) {
		      System.out.println("立加 角菩");
		      e.printStackTrace();
		   }
	}
}
