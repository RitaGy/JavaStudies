package hw03;

public class Calc {
	public int result;

	public void add(int number1, int number2) {
		result = number1 + number2;
	}

	public void add(int number1) {
		result = result + number1;
	}

	public void subtract(int number1, int number2) {
		result = number1 - number2;
	}

	public void subtract(int number1) {
		result = result - number1;
	}

	public void multiply(int number1, int number2) {
		result = number1 * number2;
	}

	public void multiply(int number1) {
		result = result * number1;
	}

	public void divide(int number1, int number2) {
		result = number1 / number2;
	}

	public void divide(int number1) {
		result = result / number1;
	}

	public void print() {
		System.out.println(result);
	}

	public void clear() {
		result = 0;
	}

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.add(0, 5);
		calc.print();
		calc.add(3);
		calc.print();
		calc.clear();
		calc.print();
		calc.divide(6, 2);
		calc.print();
		calc.multiply(5);
		calc.print();
		calc.subtract(45, 15);
		calc.print();
	}
}
