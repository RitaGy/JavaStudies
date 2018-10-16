package hw03;

public class Car {
	public String manufacturer;
	public int numberOfSeats;
	public String color;
	public int yearOfProduction;

	public void displayCustomer() {
		System.out.println("This is a " + (2018 - yearOfProduction) + "year-old" + manufacturer + "in " + color + ".");
	}
Car car1= new Car();
Car car2= new Car();
car1.manufacturer = "Opel";
car1.numberOfSeats = 5;
car1.color="blue";
car1.yearOfProduction=2011;

car2.manufacturer = "BNW";
car2.numberOfSeats = 7;
car2.color="red";
car2.yearOfProduction=2015;

car1.displayCustomer();
car2.displayCustomer ();


}