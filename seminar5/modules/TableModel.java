package seminar5.modules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import seminar5.presenters.Modal;

public class TableModel implements Modal {
	public Collection<Table> tables;

	public Collection<Table> loadTables() {
		if (tables == null) {
			tables = new ArrayList<>();
			tables.add(null);
		}
		return tables;
	}

	public int reservationTable(Date reservationDate, int tableNumber, String name) {
		for (Table table : tables) {
			if (table.getNumber() == tableNumber) {
				Reservation reservation = new Reservation(reservationDate, name);
				table.getReservation().add(reservation);
				return reservation.getReservCounter();
			}
		}
		return -1;
	}
}
