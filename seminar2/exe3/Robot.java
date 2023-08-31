package seminar2.exe3;

public class Robot extends BaseRobot implements Runner {

	private final String name;
	private final int maxHeight;
	private final int maxLength;

	public Robot(String name, int maxHeight, int maxLength) {
		this.name = name;
		this.maxHeight = maxHeight;
		this.maxLength = maxLength;
	}

	public String getName() {
		return name;
	};

	public int getMaxHeight() {
		return maxHeight;
	};

	public int getMaxJupm() {
		return maxLength;
	};

}

abstract class BaseRobot {

}