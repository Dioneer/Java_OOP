package seminar7.factory;

import java.util.Random;

public class Programm {

	private static Random random = new Random();

	public static Employee generateEmployee(EmployeeType employeeType) {
		String[] names = new String[] { "Авдей", "Адам", "Аким", "Борис", "Вадим", "Глеб", "Денис" };
		String[] surNames = new String[] { "Иванов", "Петров", "Сидоров", "Иванов", "Петров", "Сидоров", "Иванов" };
		int typeIndex = random.nextInt(2);
		int salaryIndex = random.nextInt(300, 500);
		int index = random.nextInt(18, 62);

		switch (employeeType) {
			case Worker:
				return new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)],
						salaryIndex * 100);
			case Freelancer:
				return new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)],
						salaryIndex * index);
			default:
				break;
		}
		return null;
	}

	public static void main(String[] args) {

	}
}
