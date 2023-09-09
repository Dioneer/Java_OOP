package lesson6.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programm {
	public static void main(String[] args) {
		List<Animal> list = new ArrayList<>(Arrays.asList(new Cat(4), new Fish()));
		for (Animal animal : list) {
			System.out.println(animal);
		}
	}
}
