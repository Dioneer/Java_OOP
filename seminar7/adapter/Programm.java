package seminar7.adapter;

public class Programm {
	public static void main(String[] args) {
		MeteoStore meteoStore = new MeteoStore();
		MS200 ms200 = new MS200(111);
		ST500 st500 = new ST500(123456);
		meteoStore.save(ms200);
		meteoStore.save(new AdapterST500(st500));
	}
}
