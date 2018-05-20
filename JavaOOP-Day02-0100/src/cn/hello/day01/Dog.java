package cn.hello.day01;

public class Dog extends Animal {
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age, int love, int health,String strain) {
		super(name, age, love, health);
		this.strain = strain;
		// TODO Auto-generated constructor stub
	}
	
	
}
