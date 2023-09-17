package seminar7.observer;

public interface Observer {
	void receiveOffer(String companyName, int experience, TypeOfVacancy typeOfVacancy, int salary);

	TypeOfVacancy getType();

	int getExperience();
}
