package streamsdeepdive.dataclasses;

public class Car {
	private final int id;
	private final String make;
	private final String model;
	private final double price;
	private final int year;
	private final String color;
	
	public Car(int id, String make, String model, double price, int year, String color) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", price=" + price + ", year=" + year
				+ ", color=" + color + "]";
	}
	
	
}
