import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programm {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Product product = new Product("Snikers", "Mars", 100);
		// System.out.println(product.displayInfo());
		// Product product1 = new Product(null, "asdasd", 200);
		// System.out.println(product1.displayInfo());
		// Product product2 = new Product("");
		// System.out.println(product2.displayInfo());
		// BottleOfWater bottleOfWater = new BottleOfWater("Svyatoy", "Istochnik", 105,
		// 1.5);
		// System.out.println(bottleOfWater.displayInfo());
		// BottleOfMilk bottleOfMilk = new BottleOfMilk(null, "V_derevne", 105, 25);
		// System.out.println(bottleOfMilk.displayInfo());
		// ===============================================================================
		Product bottleOfMilk2 = new BottleOfMilk(null, null, 100, 3);
		Product bottleOfMilk1 = new BottleOfMilk("Milk", "Milk", 200, 6);
		Product bottleOfWater1 = new BottleOfWater("Voda", "Reka", 100, 1);
		Product bottleOfWater2 = new BottleOfWater(null, null, 100, 3);
		Product bottleOfWater3 = new BottleOfWater("Rich", "Rich", 100, 2);
		Product packOfCracks1 = new PackOfCrackers("Crackers", "Kirieshki", 250, 500);
		Product packOfCracks2 = new PackOfCrackers("Crackers", "Kirieshki", 500, 1000);
		Product packOfCracks3 = new PackOfCrackers("Crackers", "Kirieshki", 250, 300);
		Product packOfCracks4 = new PackOfCrackers("Crackers", "Kirieshki", 800, 1500);

		List<Product> list = new ArrayList<Product>();
		list.add(bottleOfMilk1);
		list.add(bottleOfMilk2);
		list.add(bottleOfWater1);
		list.add(bottleOfWater2);
		list.add(bottleOfWater3);
		list.add(packOfCracks1);
		list.add(packOfCracks2);
		list.add(packOfCracks3);
		list.add(packOfCracks4);

		VendigMachine vendigMachine = new VendigMachine(list);

		// ===============================================================================
		boolean f = true;

		while (f) {
			System.out.println("Menu");
			System.out.println("1 - Take a bottle of water");
			System.out.println("2 - Take a bottle of milk");
			System.out.println("3 - Take a pack of crackers");
			System.out.println("0 - exit");
			System.out.println("Enter your choice:");
			int key = Integer.parseInt(scanner.nextLine());
			switch (key) {
				case 1:
					BottleOfWater bottleOfWaterRes = vendigMachine.getBottleOfWater("Voda", 1);
					if (bottleOfWaterRes != null) {
						System.out.println("Take your:");
						System.out.println(bottleOfWaterRes.displayInfo());
						System.out.println("============================================");
					} else {
						System.out.println("There is not water in the vendingmachine");
						System.out.println("============================================");
					}
					break;
				case 2:
					BottleOfMilk bottleOfMilkRes = vendigMachine.getBottleOfMilk("Milk", 6);
					if (bottleOfMilkRes != null) {
						System.out.println("Take your:");
						System.out.println(bottleOfMilkRes.displayInfo());
						System.out.println("============================================");
					} else {
						System.out.println("There is not milk in the vendingmachine");
						System.out.println("============================================");
					}
					break;
				case 3:
					PackOfCrackers packOfCrackers = vendigMachine.getPackOfCracker("Crackers", 500);
					if (packOfCrackers != null) {
						System.out.println("Take your:");
						System.out.println(packOfCrackers.displayInfo());
						System.out.println("============================================");
					} else {
						System.out.println("There is not crackers in the vendingmachine");
						System.out.println("============================================");
					}
					break;
				case 0:
					System.out.println("Everything we have:");
					vendigMachine.showProducts(list);
					System.out.println("Bye!");
					f = false;
					break;
				default:
					System.out.println("Wrong choce! Try agane");
					break;
			}
		}
	}

}
