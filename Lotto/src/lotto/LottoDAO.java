package lotto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LottoDAO {
	public void Connection(){
		Connection con = null;   
		ResultSet rs = null;
	
		String url = "jdbc:mysql://34.64.186.191:3306/ap";
		String user = "shin";
		String password="arum";
		      
		   try {
		      con = DriverManager.getConnection(url, user, password);
		      System.out.println("立加 己傍");
		   } catch (SQLException e) {
		      System.out.println("立加 角菩");
		      e.printStackTrace();
		   }
	}
}
