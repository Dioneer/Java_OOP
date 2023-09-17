package seminar7.adapter;

import java.time.LocalDateTime;

public class ST500 implements SensoreTemperature {

	private int id;

	public ST500(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public double getTemperature() {
		return 24;
	}

	@Override
	public LocalDateTime getDateTime() {
		return LocalDateTime.now();
	}

}
