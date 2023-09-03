package seminar3.exe1;

public class Programm {
	public static void main(String[] args) {
		Animal[] animals = {
				new Cat("Barsik"),
				new Cat("Barsik"),
				new Cat("Barsik"),
				new Cat("Barsik"),
				new Cat("Barsik"),
				new Dog("Bobik", 500, 50),
				new Dog("Bobik", 500, 50),
				new Dog("Bobik", 500, 50),
				new Dog("Bobik", 500, 50)
		};

		for (Animal animal : animals) {
			System.out.printf("%d - %s \n", animal.getId(), animal.getName());
			animal.swim(200);
			animal.run(50);
		}
		System.out.println(Animal.getСounter());
		System.out.println(Cat.getСounter());
		System.out.println(Dog.getСounter());
	}
}
