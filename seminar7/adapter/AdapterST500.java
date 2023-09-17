package seminar7.adapter;

import java.time.LocalDateTime;

public class AdapterST500 implements MeteoSensor {

	private SensoreTemperature sensore;

	public AdapterST500(SensoreTemperature sensore) {
		this.sensore = sensore;
	}

	@Override
	public int getId() {
		return sensore.getId();
	}

	@Override
	public double getTemperature() {
		return sensore.getTemperature();
	}

	@Override
	public double getHumidity() {
		return 0;
	}

	@Override
	public double getPressure() {
		return 0;
	}

	@Override
	public LocalDateTime getDateTime() {
		return LocalDateTime.now();
	}

}
