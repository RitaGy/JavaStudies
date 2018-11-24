package hw03;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] intArray = { 3, 4, 5, 34, 86, 34, 73, 78, 45, 52 };
//		for (int value : intArray) {
//			if ((value / 2) * 2 != value) {
//				//System.out.println(value);
//			}
//			if (value%2==0) {
//				System.out.println(value);
//			}
//		}


		String[] names = {"sdf", "sdfr"};

//		NameLength nameLength = new NameLength();
//		int avg = nameLength.nameLengthAverage(names);
//		int avg = NameLength.nameLengthAverage(names);

		NameLength nl1 = new NameLength();
		nl1.printResult();
		NameLength nl2 = new NameLength();
		nl2.printResult();
		//int avg = NameLength.nameLengthAverage(names);
		//System.out.println(avg);
		nl1.printResult();
		nl2.printResult();
	}
}
