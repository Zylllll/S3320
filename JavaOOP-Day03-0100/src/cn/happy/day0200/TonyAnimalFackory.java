package cn.happy.day0200;

/**
 * ������߹���
 * 
 * @author Administrator
 *
 */
public class TonyAnimalFackory {
	public static TonyAnimal getInitnes(String type) {
		TonyAnimal tonyAnimal = null;
		switch (type) {
		case "Chicken":
			tonyAnimal = new ChickenAnimal();
			break;
		case "Lion":
			tonyAnimal = new LionAnimal();
			break;
		}

		return tonyAnimal;

	}
}
