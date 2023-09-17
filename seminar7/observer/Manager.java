package seminar7.observer;

public class Manager extends Person {

	public Manager(String employeeName, TypeOfVacancy type, int experience) {
		super(employeeName, type, experience);
		super.setSalary(100000);
	}

	@Override
	public void receiveOffer(String companyName, int experience, TypeOfVacancy typeOfVacancy, int salary) {
		if (super.getSalary() <= salary) {
			System.out.printf(
					"PM: %s: Мне нужна эта работа! (Компания: %s; Вакансия: %s; Опыт: %d; Заработная плата: %d)\n",
					getEmployeeName(), companyName, typeOfVacancy, experience, salary);
		} else {
			System.out.printf(
					"PM: %s: Мне не нужна эта работа!(Компания: %s; Вакансия: %s; Опыт: %d; Заработная плата: %d)\n",
					getEmployeeName(), companyName, typeOfVacancy, experience, salary);
		}
	}

}
