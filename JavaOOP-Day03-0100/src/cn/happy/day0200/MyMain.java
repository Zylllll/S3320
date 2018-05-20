package cn.happy.day0200;

public class MyMain {

	public static void main(String[] args) {
		TonyAnimal lion = TonyAnimalFackory.getInitnes("Lion") ;
		TonyAnimal Chicken = TonyAnimalFackory.getInitnes("Chicken");
		
		TonyAnimal[] tonyAnimals = new TonyAnimal[2];
		tonyAnimals[0] = lion;
		tonyAnimals[1] = Chicken;
		for (TonyAnimal item : tonyAnimals) {
			item.palyedBySomeBody();
		}
		
	}

}
