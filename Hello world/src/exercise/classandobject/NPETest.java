package exercise.classandobject;

public class NPETest {

	public static void main(String[] args) {
		House[] houses = new House[4];
		//houses[0] = new House();
		System.out.println(houses[0]);
		houses[0].floor = 2;

	}

}
