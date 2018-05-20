package cn.happy.day06;

public class Test {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
