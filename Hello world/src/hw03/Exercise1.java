package hw03;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 3, 4, 5, 34, 86, 34, 73, 78, 45, 52 };
		for (int value : intArray) {
			if ((value / 2) * 2 != value) {
				System.out.println(value);
			}
		}
	}
}
