package seminar7.observer;

public abstract class Person implements Observer {
	private String employeeName;
	private int salary;

	public Person(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
