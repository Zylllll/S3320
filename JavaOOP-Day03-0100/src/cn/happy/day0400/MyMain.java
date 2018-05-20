package cn.happy.day0400;

public class MyMain {

	public static void main(String[] args) {
		ITeach iTeach = new Teacher();
		ITeach profess = new Professor();
		ITeach[] it = new ITeach[2];
		it[0] = iTeach;
		it[1] = profess;
		for (ITeach iteam : it) {
			iteam.teachClass();
		}

	}

}
