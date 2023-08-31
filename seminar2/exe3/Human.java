package seminar2.exe3;

public class Human extends BaseHuman implements Runner {

	private final String name;
	private final int maxHeight;
	private final int maxLength;

	public Human(String name, int maxHeight, int maxLength) {
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

abstract class BaseHuman {

}