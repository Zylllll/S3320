package cn.happy.day07;

public class Test {

	public static void main(String[] args) {
		ClimbThread c1 = new ClimbThread(500, 1000, "������");
		ClimbThread c2 = new ClimbThread(1500, 1000, "������");
		c1.start();
		c2.start();
	}

}
