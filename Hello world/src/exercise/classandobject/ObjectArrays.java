package exercise.classandobject;

public class ObjectArrays {

	public static void main(String[] args) {
		House[] housesNo = {new House(), new House()};
		
		House[] houses = new House[30];
		String log = "";
		for(House house : houses) {
			house = new House();
			log = log + " plus 1 house";
		}
		System.out.println(log);
	
	}

}
