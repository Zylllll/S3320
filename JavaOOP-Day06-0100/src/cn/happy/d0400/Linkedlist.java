package cn.happy.d0400;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("�ƻ�");
		linkedList.add("��˾");
		linkedList.add("����");
		linkedList.addFirst("�뿪");
		linkedList.addLast("ż��");
		
		for (Object object : linkedList) {
			System.out.println(object);
		}
		System.out.println("========");
		linkedList.removeLast();
		for (Object object : linkedList) {
			System.out.println(object);
		}
	}

}
