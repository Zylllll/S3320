package cn.happy.day12;

public class Test {

	public static void main(String[] args) {
		Site site = new Site();
		
		Thread t1 = new Thread(site, "1ºÅ´°¿Ú");
		Thread t2 = new Thread(site, "2ºÅ´°¿Ú");
		Thread t3 = new Thread(site, "3ºÅ´°¿Ú");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
