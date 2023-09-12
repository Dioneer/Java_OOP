package seminar5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel {
	public Collection<Table> tables;

	public Collection<Table> loadTables() {
		if (tables == null) {
			tables = new ArrayList<Table>();
			tables.add(new Table());
			tables.add(new Table());
			tables.add(new Table());
			tables.add(new Table());
			tables.add(new Table());
			tables.add(new Table());
		}
		return tables;
	}

	/**
	 * 
	 * @param reservationDate дата брони
	 * @param tableNumber     номер столика из Table
	 * @param name            имя бронирующего
	 * @return номер брони
	 */

	public int reservationTable(Date reservationDate, int tableNumber, String name) {
		for (Table table : tables) {
			if (table.getNumber() == tableNumber) {
				Reservation reservation = new Reservation(reservationDate, name);
				table.getReservation().add(reservation);
				return reservation.getReservId();
			}
		}
		return -1;
	}
}
