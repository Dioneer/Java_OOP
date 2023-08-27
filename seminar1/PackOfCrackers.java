public class PackOfCrackers extends Product {
	private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		checkWeight(weight);
	}

	public PackOfCrackers(String name, String brand, double price, double weight) {
		super(name, brand, price);
		checkWeight(weight);
	}

	private void checkWeight(double weight) {
		if (weight > 0 && weight < 5000) {
			this.weight = weight;
		} else
			this.weight = 50;
	}

	@Override
	public String displayInfo() {
		return String.format("%s - %s - %s - %.2f - %.1fG", this.getClass().getSimpleName(), super.getName(),
				super.getBrand(), super.getPrice(), this.getWeight());
	}
}
