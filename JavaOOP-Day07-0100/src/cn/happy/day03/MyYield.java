package cn.happy.day03;

public class MyYield {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("�߳�A"+i);
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int j = 1; j <= 5; j++) {
					System.out.println("�߳�B"+j);
					if (j==3) {
						System.out.println("�̵߳�����");
						Thread.yield();
					}
				}
			}
		});
		
		t2.start();
		t1.start();
	}

}
