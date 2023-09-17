package seminar7.adapter;

import java.time.LocalDateTime;

public class MS200 implements MeteoSensor {

	private int id;

	public MS200(int id) {
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
	public double getHumidity() {
		return 48;
	}

	@Override
	public double getPressure() {
		return 764;
	}

	@Override
	public LocalDateTime getDateTime() {
		return LocalDateTime.now();
	}

}
