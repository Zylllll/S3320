package cn.happy.day07;

public class Test {

	public static void main(String[] args) {
		ClimbThread c1 = new ClimbThread(500, 1000, "年轻人");
		ClimbThread c2 = new ClimbThread(1500, 1000, "老年人");
		c1.start();
		c2.start();
	}

}
