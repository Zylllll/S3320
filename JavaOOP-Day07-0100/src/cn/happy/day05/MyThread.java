package cn.happy.day05;

public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i+".你好，来自线程"+Thread.currentThread().getName());
		}
	}
}
