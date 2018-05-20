package cn.happy.d0100;

import java.util.List;
import java.util.ArrayList;

public class Demo1Test {

	public static void main(String[] args) {
		List<Demo1> list = new ArrayList<Demo1>();
		Demo1 demo1 = new Demo1();
		demo1.setName("欧欧");
		demo1.setStrain("企鹅");
		Demo1 demo2 = new Demo1();
		demo2.setName("菲菲");
		demo2.setStrain("企鹅");
		Demo1 demo3 = new Demo1();
		demo3.setName("美美");
		demo3.setStrain("企鹅");
		list.add(demo1);
		list.add(demo2);
		list.add(demo3);
		
		for (Demo1 demo12 : list) {
			System.out.println(demo12.getName()+"\t"+demo12.getStrain());
		}
		System.out.println("增加后======================");
		Demo1 demo4 = new Demo1();
		demo4.setName("球球");
		demo4.setStrain("企鹅");
		list.add(0, demo4);
		
		for (Demo1 demo12 : list) {
			System.out.println(demo12.getName()+"\t"+demo12.getStrain());
		}
		System.out.println("单独提取======================");
		System.out.println(list.get(0).getName()+"\t"+list.get(0).getStrain());
		
		System.out.println("总数======================");
		System.out.println(list.size());
	}

}
