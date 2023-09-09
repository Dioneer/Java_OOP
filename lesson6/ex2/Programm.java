package lesson6.ex2;

public class Programm {
	public static void main(String[] args) {
		System.out.println(new BaseClient().getDiscount(100));
		System.out.println(new SilverClient().getDiscount(100));
		System.out.println(new GoldClient().getDiscount(100));
	}
}
