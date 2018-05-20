package cn.happy.day11;

public class Site implements Runnable {
	private int count = 10;
	private int num = 0; // 记录买到第几张票

	@Override
	public void run() {
		while (count>0) {
			if (sale() == false) {
				break;
			}
		}
	}
	
	public synchronized boolean sale() {
		if (count <= 0) {
			return false;
		}
		num++;
		count--;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"抢到第"+num+"票,剩余"+count+"票");
		if (Thread.currentThread().getName().equals("黄牛党")) {
			return false;
		}
		return true;
	}
}