package seminar7.observer;

public class Cleaner extends Person {

	public Cleaner(String employeeName, TypeOfVacancy type, int experience) {
		super(employeeName, type, experience);
		super.setSalary(50000);
	}

	@Override
	public void receiveOffer(String companyName, int experience, TypeOfVacancy typeOfVacancy, int salary) {
		if (super.getSalary() <= salary) {
			System.out.printf(
					"Уборщик: %s: Мне нужна эта работа! (Компания: %s; Вакансия: %s; Опыт: %d; Заработная плата: %d)\n",
					super.getEmployeeName(), companyName, typeOfVacancy, experience, salary);
		} else {
			System.out.printf(
					"Уборщик: %s: Мне не нужна эта работа! (Компания: %s; Вакансия: %s; Опыт: %d; Заработная плата: %d)\n",
					super.getEmployeeName(), companyName, typeOfVacancy, experience, salary);
		}
	}

}
