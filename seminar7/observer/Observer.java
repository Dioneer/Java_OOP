package seminar7.observer;

public interface Observer {
	Person receiveOffer(String companyName, int experience, TypeOfVacancy typeOfVacancy, int salary);

	TypeOfVacancy getType();

	int getExperience();
}
