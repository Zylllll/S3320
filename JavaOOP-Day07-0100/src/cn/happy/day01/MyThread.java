package cn.happy.day01;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("当前线程"+Thread.currentThread().getName()+"执行了"+i);
		}
	}
	
	
}
