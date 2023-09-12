package seminar5.presenters;

import java.util.Date;

public interface ViewObserver {
	public void onReservationTable(Date reservationDate, int tableNumber, String name);

	public void onChangeReservationTable(int oldReservationNo, Date reservationDate, int tableNumber, String name);
}
