package seminar7.observer;

public class Student extends Person {

	public Student(String employeeName) {
		super(employeeName);
		super.setSalary(2000);
	}

	@Override
	public void receiveOffer(String companyName, int salary) {
		if (super.getSalary() <= salary) {
			System.out.printf("Студент: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",
					super.getEmployeeName(), companyName, salary);
			super.setSalary(salary);
		} else {
			System.out.printf("Студент: %s: Я найду работу получше! (Компания: %s; Заработная плата: %d)\n",
					super.getEmployeeName(), companyName, salary);
		}
	}

}
