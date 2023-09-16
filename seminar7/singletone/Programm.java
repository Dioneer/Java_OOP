package seminar7.singletone;

public class Programm {
	public static void main(String[] args) {
		Settings set1 = Settings.getInstance();
		Settings set2 = Settings.getInstance();
		System.out.println(set1);
		System.out.println(set2);
	}
}
