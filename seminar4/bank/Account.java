package seminar4.bank;

public abstract class Account<T extends PersonalData> {
	private double amount;
	private final T owner;

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public T getOwner() {
		return owner;
	}

	public Account(T owner, double amount) {
		this.amount = amount;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return String.format("%s limit is %.2f", owner, amount);
	}
}
