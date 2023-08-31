package seminar2.exe1;

public abstract class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal() {

	}

	public Animal(String name) {
		this.name = name;
	}

	public void voice() {
		System.out.println("Sound");
	};

	public void jump() {
		System.out.println("Jump");
	};
}
