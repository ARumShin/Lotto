package lotto;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumberMake {

	public static void main(String[] args) {
		//�ζǰ��� �����ϴ� �� ������ �ߺ��� �����Ѵ�.
		Map<String, String> lottoMap=new HashMap<String, String> ();
		//������ ���� �ۿ� ����
		Random rd=new Random();
		
		while(true) {
			//������ ����ϰ� ���� 1���� 45���� ����
			int lottoNo=rd.nextInt(45)+1;
			//���� ����� �ʿ� ��´�.
			lottoMap.put(String.valueOf(lottoNo), "");
			
			//�ʿ� ���� ��� �ߺ��̸� ���� ���� ������Ʈ�Ͽ� �����ϱ� ������ ������ ó���� �� �ʿ䰡 ����.
			//���� ���� 6���� �Ѿ�� break�� ������ ����
			if(lottoMap.size()>=6)
				break;//���ѷ�������
		}
		//�ζǸʿ� ����� Ű�� ȣ���Ѵ�.
		for(String lottoNo : lottoMap.keySet()) {
			System.out.println(lottoNo);
		}

	}

}
