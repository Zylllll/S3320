package cn.happy.day04;

public class MyThreadTwo extends Thread {
	
	public Print print;
	
	@Override
	public void run() {
		print.run2();
	}
}
