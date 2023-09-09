package lesson6.ex2;

public class SilverClient extends BaseClient {
	@Override
	public double getDiscount(double price) {
		return super.getDiscount(price) * 0.9;
	}
}
