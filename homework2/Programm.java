package homework2;

class Programm {
	public static void main(String[] args) {
		Cat[] cats = { new Cat("", 5), new Cat("", 6), new Cat("", 25), new Cat("", 25),
				new Cat("", 25), new Cat("", 125) };
		Plate plate = new Plate(100);
		plate.addFood(25);

		for (Cat cat : cats) {
			cat.eat(plate.getFood());
			plate.setFood(plate.getFood() - cat.getAppetite());
			System.out.println(cat);
			plate.info();
		}
	}
}