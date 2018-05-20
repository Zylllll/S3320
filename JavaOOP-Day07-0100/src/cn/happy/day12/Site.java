package cn.happy.day12;

public class Site implements Runnable {
	private int count = 10;
	private int num = 0;

	@Override
	public void run() {
		while (count > 0) {
			synchronized (this) {
				if (count <= 0) {
					break;
				}
				count--;
				num++;
				System.out.println(Thread.currentThread().getName()+"ÇÀµ½µÚ"+num+"Æ±,Ê£Óà"+count+"Æ±");
			}
		}
	}
}
