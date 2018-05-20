package cn.happy.day10;

public class Test {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		for (int i = 0; i < 5; i++) {
			new Thread(t1,(i+1)+"ºÅÑ¡ÊÖ").start();
		}
		
	}

}
