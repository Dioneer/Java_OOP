package seminar2.exe1;

class Dog extends Animal {
	private String color;

	public Dog(String color) {
		this.color = color;
	}

	public Dog() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void voice() {
		System.out.println("Gav");
	}

	@Override
	public void jump() {
		System.out.println("Jump!");
	}
}
