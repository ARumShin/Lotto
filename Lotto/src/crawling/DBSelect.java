package crawling;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSelect {
	public int selectQuery(int drwNo) {
		int result=0;
		
		DBCon conn=new DBCon();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			//Select 퀴리문
			String sql="SELECT count(*) as cnt FROM past WHERE drwNo=?";
			pstmt=conn.prepareStatement(sql);
			int pstmtIndex=1;
			pstmt.setInt(pstmtIndex++, drwNo);
			//SQL실행
			rs=pstmt.executeQuery();
			//결과값 출력
			while(rs.next()) {
				result=rs.getInt(1);
				break;
			}
		}catch(SQLException e) {
			System.out.println("Database 연결중 에러가 발생 했습니다.");
		}finally {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
