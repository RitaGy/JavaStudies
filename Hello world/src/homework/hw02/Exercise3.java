package homework.hw02;

public class Exercise3 {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 3, 4 };
		String[] texts = { "Java", "C++", "Python", "JavaScript" };
		String[] copyTexts = { texts[0], texts[1], texts[2], texts[3] };
		System.out.println(copyTexts);
		String forText = "For loop value: ";

		// for loop example
		for (String text : copyTexts) {
			System.out.println(forText + text);
		}

		System.out.println("int array elements:");
		int[] numbers = new int[5];
		numbers[2] = 9;
		for (int i : numbers) {
			System.out.println(i);
		}

	}

}
