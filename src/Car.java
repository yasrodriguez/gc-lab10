/**
 * Car class.
 * 
 * @author Yasmin
 *
 */
public class Car {
	private String make;
	private String model;
	private int year;
	private double price;

	/**
	 * Creates an empty car.
	 */
	public Car() {
		make = "";
		model = "";
		year = 0;
		price = 0.0;
	}

	/**
	 * Creates a car and sets the make, model, year, and price.
	 * 
	 * @param make
	 *            car make
	 * @param model
	 *            car model
	 * @param year
	 *            car year
	 * @param price
	 *            car price
	 */
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	/**
	 * Gets the car's make.
	 * 
	 * @return car make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * Sets the car's make.
	 * 
	 * @param make
	 *            car make
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * Gets the car's model.
	 * 
	 * @return car model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Sets the car's model.
	 * 
	 * @param make
	 *            car model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Gets the car's year.
	 * 
	 * @return car year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Set the car's year.
	 * 
	 * @return car year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Gets the car's price.
	 * 
	 * @return car price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the car's price.
	 * 
	 * @return car price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10d $%,10.2f\n", make, model, year, price);
	}

}
