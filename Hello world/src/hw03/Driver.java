package hw03;

public class Driver {
	public String name;
	public Car ownedCar;

	public void driverDisplay() {
		System.out.println(name + " drives a " + ownedCar.color + " car.");
	}

	public String getDriverDisplay (String extraInfo1, String extraInfo2) {
		return name + " drives a "+ ownedCar.color + " car.(" + extraInfo1 + " - " + extraInfo2 + ")";
	}
}
