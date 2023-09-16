package seminar7.factory;

public class Worker extends Employee {

	public Worker(String name, String surName, double salary) {
		super(name, surName, salary);
	}

	@Override
	public double culculateSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return String.format("Name - %s, Surname - %s, Salary - %.2f", name, surName, salary);
	}

}
