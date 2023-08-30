package seminar2.exe2;

public class Programm {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();

		Voice[] animals = new Voice[2];
		animals[0] = cat;
		animals[1] = dog;

		processVoice(animals);
	}

	public static void processVoice(Voice[] animals) {
		for (Voice animal : animals) {
			animal.voice();
			animal.jump();
		}
	}
}
