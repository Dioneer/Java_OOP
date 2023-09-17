package seminar7.observer;

public class Worker extends Person {

	public Worker(String employeeName) {
		super(employeeName);
		super.setSalary(80000);
	}

	@Override
	public void receiveOffer(String companyName, int salary) {
		if (super.getSalary() <= salary) {
			System.out.printf("Работник: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",
					getEmployeeName(), companyName, salary);
		} else {
			System.out.printf("Работник: %s: Мне не нужна эта работа! (Компания: %s; Заработная плата: %d)\n",
					getEmployeeName(), companyName, salary);
		}
	}

}
