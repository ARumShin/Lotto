package crawling;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestMySQL {
	public static void main(String[] args) {
		//private static String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
	
		Connection conn;
		
		try {
			//해당 드라이버의 클래스:호스트주소:포트/데이터베이스명","아이디","비밀번호"
			//conn=DriverManager.getConnection("jdbc:mysql://34.97.0.206:3306/lot","god","1004");
			conn=DriverManager.getConnection("jdbc:mysql://34.97.0.206:3306/lot?useSSL=false","god","1004");

			System.out.println("디비연결 성공");
			conn.close();//데이터베이스 객체메모리에서 소멸
		}catch(Exception e) {
			System.out.println("오류:"+e);
		}
	}
}
