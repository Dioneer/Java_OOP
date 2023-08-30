package seminar2.exe1;

public class Programm {
	public static void main(String[] args) {
		Animal cat1 = new Cat();
		Animal dog1 = new Dog();
		Animal[] animals = new Animal[2];
		animals[0] = cat1;
		animals[1] = dog1;

		processVoice(animals);
	}

	public static void processVoice(Animal[] animals) {
		for (Animal animal : animals) {
			Cat cat = (Cat) animal;
			animal.voice();
		}
	}
}