package seminar5;

import javax.swing.table.TableModel;

import seminar5.presenters.BookingPresenter;
import seminar5.views.BookingView;

public class Programm {

	public static void main(String[] args) {
		TableModel model = new TableModel();
		BookingView view = new BookingView();
		BookingPresenter bookingPresenter = new BookingPresenter(model, view);
	}
}
