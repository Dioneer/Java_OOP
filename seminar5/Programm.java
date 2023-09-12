package seminar5;

import java.util.Date;

import seminar5.models.TableModel;
import seminar5.presenters.BookingPresenter;
import seminar5.views.BookingView;

public class Programm {

	public static void main(String[] args) {
		BookingView view = new BookingView();
		BookingPresenter bookingPresenter = new BookingPresenter(new TableModel(), view);
		bookingPresenter.updateTablesUI();
		view.reservationTable(new Date(), 3, "Elena");
		view.reservationTable(new Date(), 1, "Elena");
		view.reservationTable(new Date(), 2, "Elena");
		bookingPresenter.showReservationsAllUI();
		view.changeReservationTable(103, new Date(), 2, "Elena");
		bookingPresenter.showReservationsAllUI();
	}

}
