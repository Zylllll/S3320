package cn.happy.day03;

public class Mythread {

	public static void main(String[] args) {
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Ïß³Ì"+1);
				}
			}
		});
		t2.start();
	}

}
