package exercise.classandobject;

public class StringExercise {

	public static void main(String[] args) {
		String name = "Sanyi";
		name = name.concat(" bacsi");
		boolean isTrue = name.endsWith("nyi");
		int nameLength = name.length();
		System.out.println("Name length is: " + nameLength);
		if (isTrue) {
			System.out.println("O sanyi");
		} else {
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

		System.out.println("----------");
		System.out.println("lababafababa".lastIndexOf("ba"));
		System.out.println("lababafababa".startsWith("ba", 10));
		System.out.println("----------");

		StringBuilder sb = new StringBuilder();
		sb.append(greet).append("HOW").append(54).delete(3, 6).insert(2, 0);
		System.out.println(sb.toString());

		String c = "abcdef".substring(2, 5);
		System.out.println(c);
		
		final int AGE_NUM = 10;
		//AGE_NUM = 9;

	}

}
