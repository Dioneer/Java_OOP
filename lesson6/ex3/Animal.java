package lesson6.ex3;

public abstract class Animal {
	public String getType() {
		return "Animal";
	}

	@Override
	public String toString() {
		return String.format(getType());
	}
}
