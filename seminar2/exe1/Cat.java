package seminar2.exe1;

class Cat extends Animal {
	private String color;

	public Cat(String color) {
		this.color = color;
	}

	public Cat() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void voice() {
		System.out.println("May");
	}

	@Override
	public void jump() {
		System.out.println("Jump!");
	}
}
