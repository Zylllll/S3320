package cn.happy.d01000;

public class Animal {
	public static String name;
	
	public static void eat() {
		System.out.println("Animal�ľ�̬�෽��eat()");
	}
	
	static class Dog{
		public static void show(){
			eat();
		}
	}
}
