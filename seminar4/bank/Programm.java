package seminar4.bank;

public class Programm {
	public static void main(String[] args) {
		Person person1 = new Person("Smith", "123456");
		Entity entity1 = new Entity("RogaIKopyta", "123456");
		CreditAccount<Person> creditAccountPerson1 = new CreditAccount<Person>(person1, 5000);
		CreditAccount<Entity> creditAccountEntity1 = new CreditAccount<Entity>(entity1, 5000000);
		DebetAccount<Person> debetAccountPerson1 = new DebetAccount<Person>(person1, 5000);
		DebetAccount<Entity> debetAccountEntity1 = new DebetAccount<Entity>(entity1, 5000000);

		Transaction<Account> transaction = new Transaction<>(debetAccountEntity1,
				creditAccountPerson1, 250000);
		transaction.execute();
	}
}
