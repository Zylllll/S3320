package cn.happy.d0600;

import java.util.LinkedList;
import java.util.Queue;

public class Day05 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("001");
		queue.offer("002");
		queue.offer("003");
		
		String poll = queue.poll();
		
		for (String string : queue) {
			System.out.println(string);
		}
	}

}
