package seminar7.observer;

import java.util.Random;

public class Company {

	private Random random = new Random();
	private String companyName;
	private Publisher jobAgency;
	private int maxSalary;

	public Company(String companyName, Publisher jobAgency, int maxSalary) {
		this.companyName = companyName;
		this.jobAgency = jobAgency;
		this.maxSalary = maxSalary;
	}

	public void needEmloyee() {
		int salary = random.nextInt(maxSalary);
		jobAgency.sendOffer(companyName, salary);
	}
}
