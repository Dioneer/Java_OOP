package seminar3.exe1;

public abstract class Animal {
	protected String name;
	private int id;
	private static int idCounter = 1000;
	private static int counter = 0;
	private int maxSwim;
	private int maxRun;

	public String getName() {
		return name;
	}

	public int getMaxSwim() {
		return maxSwim;
	}

	public int getMaxRun() {
		return maxRun;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMaxSwim(int maxSwim) {
		this.maxSwim = maxSwim;
	}

	public void setMaxrun(int maxrun) {
		this.maxRun = maxrun;
	}

	public Animal(String name, int maxSwim, int maxRun) {
		this.name = name;
		this.maxSwim = maxSwim;
		this.maxRun = maxRun;
	}

	public void run(int distance) {
		if (distance <= maxRun) {
			System.out.printf("%s run %d.\n", this.name, distance);
		} else {
			System.out.printf("%s can't run %d. \n", this.name, distance);
		}
	}

	public void swim(int distance) {
		if (distance <= maxSwim) {
			System.out.printf("%s swim %d. \n", this.name, distance);
		} else {
			System.out.printf("%s can't swim %d. \n", this.name, distance);
		}

	}

	public int getId() {
		return id;
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public static int getСounter() {
		return counter;
	}

	{
		this.id = ++idCounter;
		++counter;
	}

}
