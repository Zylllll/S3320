package cn.happy.day12;

public class Test {

	public static void main(String[] args) {
		Site site = new Site();
		
		Thread t1 = new Thread(site, "1�Ŵ���");
		Thread t2 = new Thread(site, "2�Ŵ���");
		Thread t3 = new Thread(site, "3�Ŵ���");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
