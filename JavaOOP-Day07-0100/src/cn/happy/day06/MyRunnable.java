package cn.happy.day06;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName("�߳�A");
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
