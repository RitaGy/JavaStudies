package exercise.classandobject;

public class StringExercise {

	public static void main(String[] args) {
		String name = "Sanyi";
		name = name.concat(" bacsi");
		boolean isTrue = name.endsWith("nyi");
		int nameLength = name.length();
		System.out.println("Name length is: " + nameLength);
		if(isTrue) {
			System.out.println("O sanyi");
		}else {
			System.out.println("O nem sanyi");
		}
		
		String greet = " HOW ".trim();
		String lc = greet + "DY".toLowerCase();
		System.out.println(lc);
		System.out.println(" HOW ".trim() + "DY".toLowerCase());
		String lc2 = (greet + "DY").toLowerCase();
		System.out.println(lc2);
		int lenght = lc2.concat("ASD").concat("FF").length();
		System.out.println(lenght);
		
		char character = 'k';
		System.out.println(character);

	}

}
