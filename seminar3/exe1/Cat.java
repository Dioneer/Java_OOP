package seminar3.exe1;

public class Cat extends Animal {
	private static int counter;

	public Cat(String name, int maxSwim, int maxrun) {
		super(name, maxSwim, maxSwim);
	}

	public Cat(String name) {
		this(name, 50, 100);
	}

	{
		counter++;
	}

	public static int getСounter() {
		return counter;
	}

	@Override
	public void swim(int distance) {
		System.out.printf("%s can't swim.\n", name);
	}
}
