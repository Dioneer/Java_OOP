package seminar3.exe2;

public class Worker extends Employee {

	public Worker(String name, String surName, double salary) {
		super(name, surName, salary);

	}

	@Override
	public double calculateSalary() {
		return salary;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(name);
		stringBuilder.append(" ");
		stringBuilder.append(surName);
		stringBuilder.append(" ");
		stringBuilder.append(salary);
		return stringBuilder.toString();
	}

}
