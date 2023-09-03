package seminar3.exe2;

public class Freelancer extends Employee {

	public Freelancer(String name, String surName, double salary) {
		super(name, surName, salary);

	}

	@Override
	public double calculateSalary() {
		return 0;
	}

}
