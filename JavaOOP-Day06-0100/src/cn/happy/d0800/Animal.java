package cn.happy.d0800;

public class Animal {
	public int age;
	private String name;

	private void eat() {
		
	}

	protected void show(String name) {
		System.out.println(name);
	}

	class Dog {
		public void dogTest() {
			System.out.println(age = 12);
			System.out.println(name = "da");
			eat();
			show("sd");
			System.out.println("啊发奖励积分了");
		}
	}
}
