package crawling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBCon {
	Connection conn;
	public DBCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");//드라이버 설정
			String url="jdbc:mysql://34.97.0.206:3306/lot?useSSL=false";//접속할 DB주소 설정
			//String url = "jdbc:mysql://34.97.0.206:3306/test_db01?serverTimezone=Asia/Seoul&useSSL=false";
			conn=DriverManager.getConnection(url, "god", "1004");//접속할 아이디,비밀번호 설정
			System.out.println("DB연결 성공!");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver 찾을수 없습니다.");
		}catch(SQLException e) {
			System.out.println("Database 연결 중 에러가 발생 했습니다.");
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
