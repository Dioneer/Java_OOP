package seminar5;

import seminar5.models.TableModel;
import seminar5.presenters.BookingPresenter;
import seminar5.views.BookingView;

public class Programm {

	public static void main(String[] args) {
		BookingPresenter bookingPresenter = new BookingPresenter(new TableModel(), new BookingView());
	}
}
