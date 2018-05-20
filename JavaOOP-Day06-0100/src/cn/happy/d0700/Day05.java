package cn.happy.d0700;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Day05 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("����",100);
		map.put("����",90);
		map.put("����",80);
		
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		map.put("����",95);
		System.out.println("===========================");
		
		Iterator<Integer> iterator2 = map.values().iterator();
		while (iterator2.hasNext()) {
			Integer integer = iterator2.next();
			System.out.println(integer);
		}
	}

}
