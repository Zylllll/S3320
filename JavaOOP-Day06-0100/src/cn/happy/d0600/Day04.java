package cn.happy.d0600;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day04 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		map.put("CN", "中国");
		map.put("USA", "美国");
		map.put("UK", "联合王国");
		map.put("JP", "日本");
		
		// Key值
		Set<String> keyset = map.keySet();
		
		for (String string : keyset) {
			System.out.println(string);
		}
		System.out.println("====================");
		
		// values值
		Collection<String> values = map.values();
		
		for (String string : values) {
			System.out.println(string);
		}
		System.out.println("====================");
		
		//键值
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+"------"+entry.getValue());
		}
		System.out.println("=====================");
		
		//Iterator 获取key
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			String count = map.get(next);
			System.out.println(next+count);
		}
		System.out.println("=====================");
		
		//Iterator 获取values
		Iterator<String> iterValues = map.values().iterator();
		while (iterValues.hasNext()) {
			String next = iterValues.next();
			System.out.println(next);
		}
		System.out.println("=====================");
		
		//Iterator 获取key+values
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Entry<String, String> next = iter.next();
			System.out.println(next.getKey()+"-----"+next.getValue());
		}
			
	}

}
