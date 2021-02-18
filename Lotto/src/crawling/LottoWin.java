package crawling;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class LottoWin {

	public static void main(String[] args) {
		DBSelect selectSql=new DBSelect();
		DBInsert insertSql=new DBInsert();
		
		Document doc=null;
		Elements elemN=new Elements();
		String URL="https://dhlottery.co.kr/gameResult.do?method=byWin";
		//int [] ballArr=new int[7];
		String [] ballArr=new String[7];

		try {
			//int drwNo=3;
			for( int drwNo=1; drwNo<=950; drwNo++) {
			Connection connection=Jsoup.connect(URL+getParameter(drwNo));
			doc=connection.get();
			elemN=doc.select(".win_result");
			
			//회차 html //System.out.println(elemN);
			//System.out.println(elemN.size());//1
				//if(elemN.size()>0) {
					//for(int i=0;i<elemN.size();i++) {
						Elements balls=elemN.select("span");
						//System.out.println(balls);
						//System.out.println(balls.text());//숫자만
						//System.out.println(balls.size());//개수
							//if(selectSql.selectQuery(drwNo)<1) {
								
							
								//System.out.println(balls.get(b).text());
								int b1=Integer.parseInt(balls.get(0).text());
								//System.out.println(b1);
								int b2=Integer.parseInt(balls.get(1).text());
								int b3=Integer.parseInt(balls.get(2).text());
								int b4=Integer.parseInt(balls.get(3).text());
								int b5=Integer.parseInt(balls.get(4).text());
								int b6=Integer.parseInt(balls.get(5).text());
								int b7=Integer.parseInt(balls.get(6).text());
								
								insertSql.insertQuery(drwNo, b1, b2, b3, b4, b5, b6, b7);
							//}
			}
					//}
			
	
				//}
			}catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	public static String getParameter(int drwNo) {
		String params="&drwNo="+drwNo;
		return params;
	}

}
