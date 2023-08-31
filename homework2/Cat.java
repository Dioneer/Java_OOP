package homework2;

public class Cat {
	private String name;
	private int appetite;
	private boolean satiety = false;
	private static int count;

	static {
		count = 0;
	}

	public Cat(String name, int appetite) {
		settName(name);
		setAppetite(appetite);
	}

	public Cat(int appetite) {
		this("Noname" + count++, appetite);
	}

	public int getAppetite() {
		return appetite;
	}

	public void setAppetite(int appetite) {
		this.appetite = appetite;
	}

	public String getName() {
		return name;
	}

	public void settName(String name) {
		if (name == null || name.length() > 3) {
			this.name = name;
		} else {
			this.name = "Noname" + count++;
		}
	}

	public void eat(int food) {
		if (food - this.appetite > 0) {
			this.satiety = true;
		}
		return;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Name - ");
		stringBuilder.append(this.name);
		stringBuilder.append(", ");
		stringBuilder.append("satiety - ");
		stringBuilder.append(this.satiety);
		return stringBuilder.toString();
	}
}
