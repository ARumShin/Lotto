package lotto;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumberMake {

	public static void main(String[] args) {
		//로또값을 저장하는 맵 구조상 중복을 방지한다.
		Map<String, String> lottoMap=new HashMap<String, String> ();
		//랜덤을 루프 밖에 지정
		Random rd=new Random();
		
		while(true) {
			//랜덤을 사용하고 값은 1부터 45까지 사이
			int lottoNo=rd.nextInt(45)+1;
			//나온 결과를 맵에 담는다.
			lottoMap.put(String.valueOf(lottoNo), "");
			
			//맵에 담을 경우 중복이면 기존 것을 업데이트하여 저장하기 때문에 별도의 처리를 할 필요가 없다.
			//맵의 값이 6개가 넘어가면 break로 루프를 종료
			if(lottoMap.size()>=6)
				break;//무한루프방지
		}
		//로또맵에 저장된 키를 호출한다.
		for(String lottoNo : lottoMap.keySet()) {
			System.out.println(lottoNo);
		}

	}

}
