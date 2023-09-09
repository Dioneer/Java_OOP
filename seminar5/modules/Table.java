package seminar5.modules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {
	private static int counter;
	private final int number;

	{
		number = ++counter;
	}

	public int getNumber() {
		return number;
	}

	private final Collection<Reservation> reservations = new ArrayList<>();

	public Collection<Reservation> getReservation() {
		return reservations;
	}

	@Override
	public String toString() {
		return String.format(Locale.getDefault(), "Столик номер #%d", number);
	}

}
