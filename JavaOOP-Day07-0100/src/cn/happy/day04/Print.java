package cn.happy.day04;

public class Print {
	
	public synchronized void run1() {
		for (int i = 1; i <= 50; i++) {
			System.out.print("Î¢");
			System.out.print("Àä");
			System.out.print("µÄ");
			System.out.print("Óê");
			System.out.println();
			
		}
	}
	
	public synchronized void run2() {
		for (int i = 1; i <= 50; i++) {
			System.out.print("ºÃ");
			System.out.print("ÈË");
			System.out.println();
		}
	}
}
