package seminar6.ocp;

public class RightTriangle2 implements ShapeV2 {
	private int katet1;
	private int katet2;
	private double gipotenuza;

	public int getKatet1() {
		return katet1;
	}

	public int getKatet2() {
		return katet2;
	}

	public double gipotenuza() {
		return gipotenuza;
	}

	public RightTriangle2(int katet1, int katet2) {
		this.katet1 = katet1;
		this.katet2 = katet2;
		this.gipotenuza = Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
	}

	@Override
	public double getArea() {
		return katet1 * katet2;
	}
}
