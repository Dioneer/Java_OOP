package seminar4.bank;

public class Transaction<T extends Account> {
	private final T from;
	private final T to;
	private final double amount;

	public Transaction(T from, T to, double amount) {
		this.from = from;
		this.to = to;
		this.amount = amount;
	}

	public void execute() {
		if (from.getAmount() > amount) {
			System.out.printf("Осуществлен перевод стредств на сумму %.2f\n", amount);
			System.out.printf("Счет списания %s: %.2f руб.\nСчет зачисления %s: %.2f руб.\n", from.getOwner(),
					from.getAmount(), to.getOwner(), to.getAmount());
			from.setAmount(from.getAmount() - amount);
			to.setAmount(to.getAmount() + amount);
			System.out.printf("Текущее состояние счетов:\n");
			System.out.println(from.getAmount() + ", " + from.getOwner());
			System.out.println(to.getAmount() + ", " + to.getOwner());
		} else {
			throw new RuntimeException("Not enouth money");
		}
	}
}
