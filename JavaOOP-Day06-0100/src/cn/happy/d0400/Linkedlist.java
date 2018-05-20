package cn.happy.d0400;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("计划");
		linkedList.add("公司");
		linkedList.add("还能");
		linkedList.addFirst("离开");
		linkedList.addLast("偶家");
		
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
