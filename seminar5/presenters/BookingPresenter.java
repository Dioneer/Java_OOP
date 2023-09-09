package seminar5.presenters;

import java.util.Collection;

public class BookingPresenter {
	private final Modal model;
	private final View view;

	public BookingPresenter(Modal model, View view) {
		this.model = model;
		this.view = view;
	}

	public Collection<Table> loadTables() {
		return model.loadTables();
	}
}
