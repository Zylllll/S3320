package cn.happy.day04;

public class Print {
	
	public synchronized void run1() {
		for (int i = 1; i <= 50; i++) {
			System.out.print("΢");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println();
			
		}
	}
	
	public synchronized void run2() {
		for (int i = 1; i <= 50; i++) {
			System.out.print("��");
			System.out.print("��");
			System.out.println();
		}
	}
}
