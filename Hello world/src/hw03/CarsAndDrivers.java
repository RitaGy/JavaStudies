package hw03;

public class CarsAndDrivers {
	public void printValue(){
		System.out.println("sdf");
	}
	public int age = 10;
	public static void main(String[] args) {
		CarsAndDrivers carsAndDrivers = new CarsAndDrivers();
		carsAndDrivers.printValue();
		carsAndDrivers.age = 10;
		Car.printValue();
		Car car1 = new Car();
		car1.printCounter();
		Car car2 = new Car();
		car2.printCounter();
		car1.manufacturer = "Opel";
		car1.numberOfSeats = 5;
		car1.color = "blue";
		car1.yearOfProduction = 2011;

		car2.manufacturer = "BMW";
		car2.numberOfSeats = 7;
		car2.color = "red";
		car2.yearOfProduction = 2015;

		car1.displayCustomer();
		car2.displayCustomer();
		car2.setSubCar();
		Driver driver1 = new Driver();
		driver1.name = "Sanyi";
		driver1.ownedCar= car1;
		driver1.driverDisplay();
		String driverWithExtraInfo = driver1.getDriverDisplay("extra info for car", "");
		System.out.println(("New driver display: " + driverWithExtraInfo).toUpperCase());
		
	}

}
