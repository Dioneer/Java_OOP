package seminar7.observer;

public class Company {
	private String companyName;
	private Publisher jobAgency;
	private int maxSalary;

	public Company(String companyName, Publisher jobAgency, int maxSalary) {
		this.companyName = companyName;
		this.jobAgency = jobAgency;
		this.maxSalary = maxSalary;
	}
}
