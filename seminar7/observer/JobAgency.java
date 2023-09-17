package seminar7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void sendOffer(Vacancy vacancy) {
		for (Observer observer : observers) {
			if ((observer.getType().equals(vacancy.getType()) && observer.getExperience() >= vacancy.getExperience())
					|| observer.getType().equals(TypeOfVacancy.Junior_developer)) {
				observer.receiveOffer(vacancy.getCompanyname(), vacancy.getExperience(), vacancy.getType(),
						vacancy.getSalary());
			}
		}
	}

}
