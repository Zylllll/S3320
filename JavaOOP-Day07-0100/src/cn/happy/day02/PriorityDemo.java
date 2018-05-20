package cn.happy.day02;

public class PriorityDemo {
	
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		MyRunnable r2 = new MyRunnable();

		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");
		
		System.out.println("T1优先级是是："+t1.getPriority());
		System.out.println("T2优先级是是："+t2.getPriority());
		
		System.out.println("********************************");
		
		t1.setPriority(10);
		System.out.println("T1优先级是是："+t1.getPriority());
		System.out.println("T2优先级是是："+t2.getPriority());
		
		System.out.println("********************************");
		t1.start();
		t2.start();
	}
}
