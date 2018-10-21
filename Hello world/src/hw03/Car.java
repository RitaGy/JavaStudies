package hw03;

public class Car {
	public String manufacturer;
	public int numberOfSeats;
	public String color;
	public int yearOfProduction;
	public Car subtitutedCar;
	
	public void displayCustomer() {
		System.out.println("This is a " + (2018 - yearOfProduction) + "-year-old " + manufacturer + " in " + color + ".");
	}
	
	public void setSubCar() {
		subtitutedCar = new Car();
	}
}