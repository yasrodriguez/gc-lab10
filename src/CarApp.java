import java.util.ArrayList;
import java.util.Scanner;

/**
 * Display car inventory of new and used car. Let the user select one of the
 * cars. Display information for the car selected and ask them if they want to
 * buy it. If they do, remove the car from inventory and redisplay the
 * inventory.
 * 
 * @author Yasmin
 *
 */
public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> carInventory = new ArrayList<>();

		System.out.println("Welcome to Grand Circus Car Dealership!");
		System.out.println();

		carInventory.add(new Car("Honda", "Accord", 2012, 31000));
		carInventory.add(new Car("Toyota", "Corolla", 2001, 18000));
		carInventory.add(new Car("Cadillac", "ATS Sedan", 2017, 34595));
		carInventory.add(new UsedCar("Audi", "A4", 2016, 44366, 34000));
		carInventory.add(new UsedCar("Chevrolet", "Malibu", 2015, 15999, 30000));
		carInventory.add(new UsedCar("Pontiac", "Grand Prix", 2008, 10000, 50000));

		printMenu(carInventory);

		boolean keepGoing = true;

		while (keepGoing) {
			int carSelected = Validator.getInt(scan,
					"Enter the number of the car you would like (or " + (carInventory.size() + 1) + " to quit.) ", 1,
					carInventory.size() + 1);
			System.out.println();

			if (carSelected == carInventory.size() + 1) {
				keepGoing = false;
				System.out.println("Have a great day!");

			} else {

				System.out.println(carInventory.get(carSelected - 1));

				String purchase = Validator.getYOrN(scan, "Would you like to buy this car? Enter y/n: ");
				System.out.println();

				if (purchase.equals("y")) {
					System.out.println("Excellent! Our finance department will be in touch with you shortly.");
					System.out.println();

					carInventory.remove(carSelected - 1);
					printMenu(carInventory);
				}
			}
		}
		scan.close();
	}

	public static void printMenu(ArrayList<Car> carInventory) {

		for (int i = 0; i < carInventory.size(); i++) {
			System.out.println((i + 1) + ". " + carInventory.get(i));
		}

		// Add Quit as the last option in the menu
		System.out.println((carInventory.size() + 1) + ". Quit");
		System.out.println();
	}

}
