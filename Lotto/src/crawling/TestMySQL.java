package crawling;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestMySQL {
	public static void main(String[] args) {
		//private static String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
	
		Connection conn;
		
		try {
			//�ش� ����̹��� Ŭ����:ȣ��Ʈ�ּ�:��Ʈ/�����ͺ��̽���","���̵�","��й�ȣ"
			//conn=DriverManager.getConnection("jdbc:mysql://34.97.0.206:3306/lot","god","1004");
			conn=DriverManager.getConnection("jdbc:mysql://34.97.0.206:3306/lot?useSSL=false","god","1004");

			System.out.println("��񿬰� ����");
			conn.close();//�����ͺ��̽� ��ü�޸𸮿��� �Ҹ�
		}catch(Exception e) {
			System.out.println("����:"+e);
		}
	}
}
