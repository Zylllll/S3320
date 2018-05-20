package cn.happy.day09;

public class MyTherad {

	public static void main(String[] args) {
		int time = 1000;

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					try {
						Thread.sleep(time * 2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("特需号：" + i + "号在看病");
				}
			}
		});

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 50; i++) {
					try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("普通号：" + i + "号在看病");
					if (i == 9) {
						try {
							t2.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
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
