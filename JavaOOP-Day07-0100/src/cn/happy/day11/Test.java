package cn.happy.day11;

public class Test {

	public static void main(String[] args) {
		Site site = new Site();
		Thread thread = new Thread(site, "������");
		Thread thread1 = new Thread(site, "��ţ��");
		Thread thread2 = new Thread(site, "��ƱƱ");
		
		thread.start();
		thread1.start();
		thread2.start();
	}

}
