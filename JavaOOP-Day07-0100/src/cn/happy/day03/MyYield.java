package cn.happy.day03;

public class MyYield {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("线程A"+i);
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int j = 1; j <= 5; j++) {
					System.out.println("线程B"+j);
					if (j==3) {
						System.out.println("线程的礼让");
						Thread.yield();
					}
				}
			}
		});
		
		t2.start();
		t1.start();
	}

}
