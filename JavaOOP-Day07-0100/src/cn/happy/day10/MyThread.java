package cn.happy.day10;

public class MyThread implements Runnable {
	int meters = 1000;
	@Override
	public synchronized void run() {
		boolean a = true;
		while (a) {
			if (meters <= 100) {
				break;
			}
			System.out.println(Thread.currentThread().getName()+"拿到接力棒");
			for (int i = 0; i < 100; i+=10) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"跑了"+(i+10)+"米！");
			}
			meters = meters - 100;
			a = false;
		}
	}
}
