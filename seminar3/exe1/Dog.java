package seminar3.exe1;

public class Dog extends Animal {

	private static int counter;

	public Dog(String name, int maxSwim, int maxrun) {
		super(name, maxSwim, maxSwim);
	}

	{
		counter++;
	}

	public static int getСounter() {
		return counter;
	}
}
