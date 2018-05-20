package cn.happy.day11;

public class Test {

	public static void main(String[] args) {
		Site site = new Site();
		Thread thread = new Thread(site, "ÌÓÅÜÅÜ");
		Thread thread1 = new Thread(site, "»ÆÅ£µ³");
		Thread thread2 = new Thread(site, "ÕÅÆ±Æ±");
		
		thread.start();
		thread1.start();
		thread2.start();
	}

}
