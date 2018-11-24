package hw03;

public class Car {
	public static int counter = 0;
	public static int minYear = 1920;

	public String manufacturer;
	public int numberOfSeats;
	public String color;
	public int yearOfProduction;
	public Car subtitutedCar;

	public Car(){
		counter++;
	}

	public static void printValue(){
		System.out.println(counter);
	}

	public void printCounter(){
		printValue();
		System.out.println("number of cars: " + counter + numberOfSeats);
	}
	
	public void displayCustomer() {
		System.out.println("This is a " + (2018 - yearOfProduction) + "-year-old " + manufacturer + " in " + color + ".");
	}
	
	public void setSubCar() {
		subtitutedCar = new Car();
	}

	public void setYearOfProduction(int year){
		if(year > minYear) {
			this.yearOfProduction = year;
			System.out.println();
			System.out.println(Math.PI);
		}
	}

	public void paint(){
		this.color = "blue";
	}

	public void paint(String color){
		this.color = color;
	}
}