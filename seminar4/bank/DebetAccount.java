package seminar4.bank;

public class DebetAccount<T extends PersonalData> extends Account<T> {

	public DebetAccount(T owner, double amount) {
		super(owner, amount);

	}
}
