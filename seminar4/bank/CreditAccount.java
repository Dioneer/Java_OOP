package seminar4.bank;

public class CreditAccount<T extends PersonalData> extends Account<T> {

	public CreditAccount(T owner, double amount) {
		super(owner, amount);

	}

}
