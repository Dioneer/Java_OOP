package seminar2.exe3;

public interface Runner {
	String getName();

	int getMaxJupm();

	int getMaxHeight();

	default boolean run(int length) {
		if (length <= getMaxHeight()) {
			System.out.println(getName() + " run successfully");
			return true;
		} else {
			System.out.println(getName() + " run not successfully");
			return false;
		}
	};

	default boolean jump(int height) {
		if (height <= getMaxJupm()) {
			System.out.println(getName() + " jump successfully");
			return true;
		} else {
			System.out.println(getName() + " jump not successfully");
			return false;
		}
	}
}
