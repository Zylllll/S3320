package cn.happy.d0100;

import java.util.List;
import java.util.ArrayList;

public class Demo1Test {

	public static void main(String[] args) {
		List<Demo1> list = new ArrayList<Demo1>();
		Demo1 demo1 = new Demo1();
		demo1.setName("ŷŷ");
		demo1.setStrain("���");
		Demo1 demo2 = new Demo1();
		demo2.setName("�Ʒ�");
		demo2.setStrain("���");
		Demo1 demo3 = new Demo1();
		demo3.setName("����");
		demo3.setStrain("���");
		list.add(demo1);
		list.add(demo2);
		list.add(demo3);
		
		for (Demo1 demo12 : list) {
			System.out.println(demo12.getName()+"\t"+demo12.getStrain());
		}
		System.out.println("���Ӻ�======================");
		Demo1 demo4 = new Demo1();
		demo4.setName("����");
		demo4.setStrain("���");
		list.add(0, demo4);
		
		for (Demo1 demo12 : list) {
			System.out.println(demo12.getName()+"\t"+demo12.getStrain());
		}
		System.out.println("������ȡ======================");
		System.out.println(list.get(0).getName()+"\t"+list.get(0).getStrain());
		
		System.out.println("����======================");
		System.out.println(list.size());
	}

}
