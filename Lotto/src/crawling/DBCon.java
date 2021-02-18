package crawling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBCon {
	Connection conn;
	public DBCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");//����̹� ����
			String url="jdbc:mysql://34.97.0.206:3306/lot?useSSL=false";//������ DB�ּ� ����
			//String url = "jdbc:mysql://34.97.0.206:3306/test_db01?serverTimezone=Asia/Seoul&useSSL=false";
			conn=DriverManager.getConnection(url, "god", "1004");//������ ���̵�,��й�ȣ ����
			System.out.println("DB���� ����!");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver ã���� �����ϴ�.");
		}catch(SQLException e) {
			System.out.println("Database ���� �� ������ �߻� �߽��ϴ�.");
		}
	}
	
	public PreparedStatement prepareStatement(String sql) throws SQLException{
		return conn.prepareStatement(sql);
	}
	
	public boolean isClosed() throws SQLException{
		return conn.isClosed();
	}
	
	public void close() throws SQLException{
		conn.close();
	}

}
