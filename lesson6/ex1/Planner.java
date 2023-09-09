package lesson6.ex1;

import java.util.ArrayList;
import java.util.List;

public class Planner {
	List<String> entries = new ArrayList<>();

	public void addEntry(String text) {
		entries.add(text);
	}

	public void removeEntry(int index) {
		entries.remove(index);
	}

	@Override
	public String toString() {
		return String.join("\n", entries);
	}

}
