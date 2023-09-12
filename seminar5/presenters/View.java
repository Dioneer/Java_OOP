package seminar5.presenters;

import java.util.Collection;

import seminar5.models.Table;

public interface View {
	public void showTables(Collection<Table> tables);

	public void showReservationsAll(Collection<Table> reservaitons);

	public void setObserver(ViewObserver observer);

	public void showReservationResultUI(int reservationNo);

	public void showChangeReservationTableUI(int oldReservationNo, int reservationNo, boolean result);
}
