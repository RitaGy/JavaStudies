
public class Homework04 {
	public int[] numbers;
	public String text;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 3, 4, 5, 17, 19, 1, 23, 0, 27, 30, 34, 40 };
		String random = "Az erdei állatok élete érdekes és izgalmas.";
		Homework04 hw04 = new Homework04();
		hw04.numbers = intArray;
		hw04.text=random;
		hw04.minMaxValue();
	}

	public void minMaxValue() {
		int min = numbers[0];
		int max = numbers[0];

		for (int element : numbers) {
			if (element > max) {
				max = element;
			} else if (element < min) {
				min = element;
			}

		}
		System.out.println(text.substring(min, max));
	}
}
