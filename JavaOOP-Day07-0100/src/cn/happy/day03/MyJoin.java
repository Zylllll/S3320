package cn.happy.day03;

public class MyJoin {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i < 50; i++) {
					System.out.println("线程A"+i);
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i < 50; i++) {
					System.out.println("线程B"+i);
					if (i==1) {
						try {
							t1.join();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				
			}
		});
		
		t1.start();
		t2.start();
	}

}
