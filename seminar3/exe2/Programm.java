package seminar3.exe2;

import java.util.Random;

public class Programm {

	private static Random random = new Random();

	public static Worker generateWorker() {
		String[] names = new String[] { "Авдей", "Адам", "Аким", "Борис", "Вадим", "Глеб", "Денис" };
		String[] surNames = new String[] { "Иванов", "Петров", "Сидоров", "Иванов", "Петров", "Сидоров", "Иванов" };

		int salaryIndex = random.nextInt(300, 500);

		Worker worker = new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)],
				salaryIndex * 100);

		return worker;
	}

	public static Worker[] generateWorkers(int counter) {
		Worker[] workers = new Worker[counter];
		for (int i = 0; i < counter; i++) {
			workers[i] = generateWorker();
		}
		return workers;
	}

	public static void main(String[] args) {
		Worker[] workers = generateWorkers(12);

		for (Worker worker : workers) {
			System.out.println(worker);
		}
	}
}
