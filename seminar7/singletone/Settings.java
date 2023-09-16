package seminar7.singletone;

public class Settings {
	private static Settings instance;

	public static Settings getInstance() {
		if (instance == null) {
			instance = new Settings();
			instance.param1 = "1";
			instance.param2 = 1;
			instance.param3 = true;
		}
		return instance;
	};

	private String param1;
	private int param2;
	private boolean param3;

	public String getParam1() {
		return param1;
	}

	public int getParam2() {
		return param2;
	}

	public boolean getParam3() {
		return param3;
	}

	private Settings() {
	}

	private Settings(String param1, int param2, boolean param3) {
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
	}

	@Override
	public String toString() {
		return String.format("first = %s, second = %d, third = %b", param1, param2, param3);
	}
}
