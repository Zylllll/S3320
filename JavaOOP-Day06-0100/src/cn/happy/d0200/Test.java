package cn.happy.d0200;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map countrise = new HashMap();
		countrise.put("欧欧","企鹅");
		countrise.put("菲菲","企鹅");
		countrise.put("美美","企鹅");
		countrise.put("亚亚欧","企鹅");
		System.out.println(countrise);
		
		countrise.remove("欧欧");
		System.out.println(countrise);
		
		System.out.println("是否有欧欧这个企鹅："+countrise.containsKey("欧欧"));
		System.out.println("");
		

	}

}
