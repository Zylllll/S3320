package cn.happy.d0200;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map countrise = new HashMap();
		countrise.put("ŷŷ","���");
		countrise.put("�Ʒ�","���");
		countrise.put("����","���");
		countrise.put("����ŷ","���");
		System.out.println(countrise);
		
		countrise.remove("ŷŷ");
		System.out.println(countrise);
		
		System.out.println("�Ƿ���ŷŷ�����죺"+countrise.containsKey("ŷŷ"));
		System.out.println("");
		

	}

}
