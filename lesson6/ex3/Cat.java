package lesson6.ex3;

public class Cat extends Animal implements Legs {
	private int legs;

	public Cat(int legs) {
		this.legs = legs;
	}

	@Override
	public String getType() {
		return "Cat";
	}

	@Override
	public void getLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return String.format(getType() + " " + legs);
	}
}
