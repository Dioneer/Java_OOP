package homework2;

public class Plate {
	private int food;

	public Plate(int food) {
		setFood(food);
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		if (food < 0) {
			System.out.println("too little food, too mach appetite");
		} else {
			this.food = food;
		}
	}

	public void addFood(int eat) {
		this.food = this.food + eat;
		System.out.println("You add " + eat + " food. Tottal: " + this.food);
	}

	public void info() {
		System.out.println("plate: " + food);
	}
}
