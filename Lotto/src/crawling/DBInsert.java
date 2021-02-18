package crawling;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBInsert {
	public void insertQuery(int drwNo, int b1,int b2,int b3,int b4,int b5,int b6,int b7 ) {
		DBCon conn=new DBCon();//����Ŭ��
		PreparedStatement pstmt=null;
		
		try {
			//Insert�� ?�κ��� �Ʒ��� �Է°��� �ڵ����� ��ȯ�ȴ�
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
			//SQL����
			int count=pstmt.executeUpdate();
			if(count==0) {
				System.out.println("�����Ͱ��� �̻��� �ֽ��ϴ�.");
			}else {
				System.out.println("������ Insert ����");
			}
		}catch(SQLException e){
			System.out.println("Database ������ ������ �߻��߽��ϴ�.");
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
