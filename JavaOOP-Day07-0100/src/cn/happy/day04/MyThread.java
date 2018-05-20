package cn.happy.day04;

public class MyThread extends Thread {
	
	public Print print;
	
	@Override
	public void run() {
		print.run1();
	}
}
