package cn.happy.d0900;

public class Animal {

	public void eat(String foot) {
		class Dog {
			public void show() {
				System.out.println(foot);
			}
		}
		new Dog().show();
	}
}
