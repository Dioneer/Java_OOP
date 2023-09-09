package seminar5.modules;

import java.util.Date;

public class Reservation {
	private static int counter = 100;
	private static int reservCounter;
	private Date date;
	private String name;
	{
		this.reservCounter = ++counter;
	}

	public Reservation(Date date, String name) {
		this.date = date;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public int getReservCounter() {
		return reservCounter;
	}

}
