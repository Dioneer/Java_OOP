package seminar7.observer;

public class Company {
	private final String companyName;
	private Publisher jobAgency;
	private int maxSalary;
	private int experience;

	public Company(String companyName, Publisher jobAgency, int maxSalary, int experience) {
		this.companyName = companyName;
		this.jobAgency = jobAgency;
		this.maxSalary = maxSalary;
		this.experience = experience;
	}

	public void needEmloyee() {
		jobAgency.sendOffer(new Vacancy(experience, maxSalary, companyName));
	}

}
