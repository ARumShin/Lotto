package crawling;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBInsert {
	public void insertQuery(int drwNo, int b1,int b2,int b3,int b4,int b5,int b6,int b7 ) {
		DBCon conn=new DBCon();//연결클라스
		PreparedStatement pstmt=null;
		
		try {
			//Insert문 ?부분은 아래의 입력값이 자동으로 변환된다
			String sql="INSERT INTO past (drwNo,b1,b2,b3,b4,b5,b6,b7) VALUES (?,?,?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			int index=1;
			pstmt.setInt(index++, drwNo);
			pstmt.setInt(index++, b1);
			pstmt.setInt(index++, b2);
			pstmt.setInt(index++, b3);
			pstmt.setInt(index++, b4);
			pstmt.setInt(index++, b5);
			pstmt.setInt(index++, b6);
			pstmt.setInt(index++, b7);
			//SQL실행
			int count=pstmt.executeUpdate();
			if(count==0) {
				System.out.println("데이터값에 이상이 있습니다.");
			}else {
				System.out.println("데이터 Insert 성공");
			}
		}catch(SQLException e){
			System.out.println("Database 연결중 에러가 발생했습니다.");
		}finally {
			try {
				if(conn!=null&&!conn.isClosed()) {
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}
