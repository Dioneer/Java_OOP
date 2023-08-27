import java.util.ArrayList;
import java.util.List;

public class VendigMachine {
	private List<Product> product;

	public VendigMachine(List<Product> product) {
		if (product == null) {
			product = new ArrayList<>();
		}
		this.product = product;
	}

	public void addProduct(Product product) {
		this.product.add(product);
	}

	public void showProducts(List<Product> product) {
		for (Product items : product) {
			System.out.println(displayInfo(items));
		}
	}

	private String displayInfo(Product items) {
		StringBuilder stringBuilder = new StringBuilder();
		String type;
		if (items instanceof BottleOfMilk) {
			type = "Milk";
		} else if (items instanceof BottleOfWater) {
			type = "Water";
		} else if (items instanceof PackOfCrackers) {
			type = "Crackers";
		} else
			type = "unknown";
		stringBuilder.append(items.getBrand()).append(", ").append(items.getName()).append(", ")
				.append(items.getPrice()).append(", ").append(type);
		return stringBuilder.toString();
	}

	public BottleOfWater getBottleOfWater(String name, double volume) {
		for (Product item : product) {
			if (item instanceof BottleOfWater) {
				BottleOfWater bottleOfWater = (BottleOfWater) item;
				if (item.getName().equals(name) && bottleOfWater.getVolume() == volume) {
					return bottleOfWater;
				}
			}
		}
		return null;
	}

	public BottleOfMilk getBottleOfMilk(String name, int fat) {
		for (Product item : product) {
			if (item instanceof BottleOfMilk) {
				BottleOfMilk bottleOfMilk = (BottleOfMilk) item;
				if (item.getName().equals(name) && bottleOfMilk.getFat() == fat) {
					return bottleOfMilk;
				}
			}
		}
		return null;
	}

	public PackOfCrackers getPackOfCracker(String name, double weight) {
		for (Product item : product) {
			if (item instanceof PackOfCrackers) {
				PackOfCrackers bottleOfMilk = (PackOfCrackers) item;
				if (item.getName().equals(name) && bottleOfMilk.getWeight() == weight) {
					return bottleOfMilk;
				}
			}
		}
		return null;
	}
}