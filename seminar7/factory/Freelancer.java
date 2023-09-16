package seminar7.factory;

public class Freelancer extends Employee {

	public Freelancer(String name, String surName, double salary) {
		super(name, surName, salary);
	}

	@Override
	public double culculateSalary() {
		return salary * 0.8;
	}

	@Override
	public String toString() {
		return String.format("Name - %s, Surname - %s, Salary - %.2f", name, surName, salary);
	}
}
