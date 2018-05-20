package cn.happy.day04;

public class Test {

	public static void main(String[] args) {
		Print print = new Print();
		
		MyThread t1 = new MyThread();
		
		MyThreadTwo t2 = new MyThreadTwo();
		
		t1.print = print;
		
		t2.print = print;
		
		t1.start();
		
		t2.start();
	}

}
