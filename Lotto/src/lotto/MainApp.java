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
		int drwNo=935;
		
		for(int n=drwNo; n>=930; n--) {
		//1. url ÆäÀÌÁö Document
		/* Document doc=Jsoup.connect(URL+getParameter(drwNo)).get(); */
			Document doc=Jsoup.connect(URL+getParameter(n)).get();
		//2. html ÂïÈû- ´çÃ·¹øÈ£ ¶û º¸³Ê½º¹øÈ£
//		System.out.println(""+doc.toString());
		Elements elements=doc.select(".win_result span");
		
		//3. 2¹ø¹è¿­?¿¡¼­ Á¤º¸¸¦ °¡Á®¿Â´Ù?
//		int ball=0;
//		for (Element element:elements) {
//			System.out.println(++ball+":"+element.toString());
//			System.out.print(element.toString().split("\">")[1].split("</")[0]+",\n");
//		}
		System.out.println(n+"--");
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
