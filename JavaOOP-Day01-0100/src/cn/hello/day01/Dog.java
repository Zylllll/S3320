package cn.hello.day01;

public class Dog {
	private String name;
	private int age;
	private String brand;

	public Dog() {

	}

	public Dog(String name, int age, String brand) {
		this.name = name;
		this.age = age;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void print(){
		System.out.println(name+age+"Ëê"+brand);
	}

}
