package cn.happy.d0500;

import java.util.HashSet;
import java.util.Set;

public class DayLast {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setAge(12);
		dog.setName("´ó»Æ¹·");
		
		Dog dog1 = new Dog();
		dog1.setAge(12);
		dog1.setName("Ð¡»Æ³µ");
		
		if (dog.equals(dog1)) {
			System.out.println("true");
		}
		
		if (dog == dog1) {
			System.out.println("true");
		}
		
		Set<Dog> set = new HashSet<Dog>();
		set.add(dog);
		set.add(dog1);
		System.out.println(set.size());
	}

}
