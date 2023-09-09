package seminar5.views;

import seminar5.modules.Table;
import seminar5.presenters.View;

import java.util.Collection;

public class BookingView implements View {
	public void showTables(Collection<Table> tables) {
		for (Table table : tables) {
			System.out.println(table);
		}
	}
}
