package homework.hw02;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int randomNumber = 3;
		boolean odd;
		if ((randomNumber / 2) * 2 == randomNumber) {
			odd = false;
			System.out.println("even " + randomNumber);
		} else {
			odd = true;
			System.out.println("odd " + randomNumber);
		}
	}

}
