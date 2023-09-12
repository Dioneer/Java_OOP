package seminar5.presenters;

import java.util.Collection;
import java.util.Date;

import seminar5.models.Table;

public interface Model {
	public Collection<Table> loadTables();

	public int reservationTable(Date reservationDate, int tableNumber, String name);

	public boolean removeReservationTable(int oldReservationNo);

	public Collection<Table> getShowReservationsAll();
}
