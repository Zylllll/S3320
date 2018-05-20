package cn.happy.day05;

public class Test {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		
		MyThreadTwo t2 = new MyThreadTwo();
		
		t1.start();
		t2.start();
	}

}
