package seminar5.presenters;

import java.util.Collection;
import seminar5.models.TableModel;

public class BookingPresenter {
	private final TableModel model;
	private final View view;

	public BookingPresenter(TableModel tableModel, View view) {
		this.model = tableModel;
		this.view = view;
	}

	public Collection<Table> loadTables() {
		return model.loadTables();
	}
}
