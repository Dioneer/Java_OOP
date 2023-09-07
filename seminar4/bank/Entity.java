package seminar4.bank;

public class Entity implements PersonalData {

	private final String name;
	private final String inn;

	@Override
	public String getInn() {
		return inn;
	}

	public String getFio() {
		return name;
	}

	public Entity(String name, String inn) {
		this.name = name;
		this.inn = inn;
	}

	public String toString() {
		return String.format("%s (inn - %s)", name, inn);
	}
}
