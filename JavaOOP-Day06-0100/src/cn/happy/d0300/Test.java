package cn.happy.d0300;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Demo demo1 = new Demo("≈∑≈∑", "π∑π∑");
		Demo demo2 = new Demo("∑∆∑∆", "÷Ì÷Ì");
		Demo demo3 = new Demo("√¿√¿", "–‹–‹");
		Demo demo4 = new Demo("—«—«", "±ø±ø");
		Map<String,Demo> map = new HashMap<String,Demo>();
		map.put(demo1.getName(), demo1);
		map.put(demo2.getName(), demo2);
		map.put(demo3.getName(), demo3);
		map.put(demo4.getName(), demo4);
		
		// π”√Iterator±È¿˙
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			Demo demo = map.get(next);
			System.out.println(next+"------"+demo.getStrain());
		}

	}

}
