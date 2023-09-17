package seminar7.adapter;

public class MeteoStore {
	boolean save(MeteoSensor meteoSensor) {
		System.out.format(
				"Saving data from sensore [%d] at %s%n temperature - %.1f, humidity - %.1f, pressure = %.1f\n\r",
				meteoSensor.getId(), meteoSensor.getDateTime(), meteoSensor.getTemperature(), meteoSensor.getHumidity(),
				meteoSensor.getPressure());
		return true;
	}
}
