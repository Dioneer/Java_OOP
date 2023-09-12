package seminar5.models;

import java.util.Date;

public class Reservation {
	private static int counter = 100;
	private final int reservId;
	private Date date;
	private String name;
	{
		this.reservId = ++counter;
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

	public int getReservId() {
		return reservId;
	}

}
