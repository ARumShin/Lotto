package lotto;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainApp {

	//url= https://dhlottery.co.kr/gameResult.do?method=byWin&drwNo=935
	private static String URL="https://dhlottery.co.kr/gameResult.do?method=byWin";
	public static void main(String[] args) throws IOException {
		int drwNo=1;
		
		for(int n=drwNo; n<=10; n++) {
		//1. url 페이지 Document
		/* Document doc=Jsoup.connect(URL+getParameter(drwNo)).get(); */
			Document doc=Jsoup.connect(URL+getParameter(n)).get();
		//2. html 찍힘- 당첨번호 랑 보너스번호
//		System.out.println(""+doc.toString());
		Elements elements=doc.select(".win_result span");
		
		//3. 2번배열?에서 정보를 가져온다?
//		int ball=0;
//		for (Element element:elements) {
//			System.out.println(++ball+":"+element.toString());
//			System.out.print(element.toString().split("\">")[1].split("</")[0]+",\n");
//		}
		System.out.println(n+"회");
		for(int i=0;i<elements.size();i++) {
			if(i==elements.size()-1) {
				System.out.println("bonus:"+elements.get(i).toString().split("\">")[1].split("</")[0]);
			}else if(i==elements.size()-2) {
				System.out.println(elements.get(i).toString().split("\">")[1].split("</")[0]);
			}else {
				System.out.print(elements.get(i).toString().split("\">")[1].split("</")[0]+", ");
			}
		}
		}
	}
	
	public static String getParameter(int drwNo) {
		String params="&drwNo="+drwNo;
		return params;
	}
}
