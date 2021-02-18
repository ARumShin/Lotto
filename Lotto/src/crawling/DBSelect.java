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
			//Select ������
			String sql="SELECT count(*) as cnt FROM past WHERE drwNo=?";
			pstmt=conn.prepareStatement(sql);
			int pstmtIndex=1;
			pstmt.setInt(pstmtIndex++, drwNo);
			//SQL����
			rs=pstmt.executeQuery();
			//����� ���
			while(rs.next()) {
				result=rs.getInt(1);
				break;
			}
		}catch(SQLException e) {
			System.out.println("Database ������ ������ �߻� �߽��ϴ�.");
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
