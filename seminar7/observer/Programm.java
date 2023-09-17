package seminar7.observer;

public class Programm {
	public static void main(String[] args) {
		Publisher jodAgency = new JobAgency();
		Company company1 = new Company("Roga", jodAgency, 20000);
		Company company2 = new Company("Kopyta", jodAgency, 50000);
		Company company3 = new Company("Volga", jodAgency, 100000);
		Student student1 = new Student("Misha");
		Student student2 = new Student("Masha");
		Worker worker1 = new Worker("Dima");
		Worker worker2 = new Worker("Prima");
		jodAgency.registerObserver(student1);
		jodAgency.registerObserver(student2);
		jodAgency.registerObserver(worker1);
		jodAgency.registerObserver(worker2);
		for (int i = 0; i < 3; i++) {
			company1.needEmloyee();
			company2.needEmloyee();
			company3.needEmloyee();
		}
	}
}
