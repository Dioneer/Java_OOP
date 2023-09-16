package seminar7.builder;

public class Programm {
	public static void main(String[] args) {
		new OrderBuilder()
				.setClientName("AAAAA")
				.setCompanyName("BBBB")
				.setProductId(1234)
				.setAnt(5)
				.setPrice(123)
				.build();
	}
}
