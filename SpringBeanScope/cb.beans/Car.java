package cb.beans;

public class Car {
	private String chassisNumber;
	private String color;
	private String fuelType;
	private long price;
	private double average;

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public double getAverage() {
		return average;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public void show() {
		System.out.println("showing car " + chassisNumber + " having color: " 
					+ color + " and price: " + price);
	}

	public Car(String chassisNumber, String color, double average, long price, 
			String fuelType) {
		this.chassisNumber = chassisNumber;
		this.average = average;
		this.price = price;
		this.color = color;
		this.fuelType = fuelType;
	}

	public Car() {
		chassisNumber = "eng00";
		color = "white";
		fuelType = "diesel";
		price = 27000;
		average = 12;
	}
}
