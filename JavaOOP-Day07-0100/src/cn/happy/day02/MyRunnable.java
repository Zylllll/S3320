package cn.happy.day02;

public class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("当前线程" + Thread.currentThread().getName() + "执行了" + i);
		}
	}

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		MyRunnable r2 = new MyRunnable();

		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");
		
		t1.start();
		t2.start();
	}
}
