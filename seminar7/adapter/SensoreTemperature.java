package seminar7.adapter;

import java.time.LocalDateTime;

public interface SensoreTemperature {
	int getId();

	double getTemperature();

	LocalDateTime getDateTime();
}
