package lesson6.ex1;

public class Programm {
	public static void main(String[] args) {
		Planner revengPlanner = new Planner();
		revengPlanner.addEntry("1");
		revengPlanner.addEntry("2");
		revengPlanner.removeEntry(0);
		FileManager fileManager = new FileManager();
		fileManager.LoadFomFile(revengPlanner, "path");
	}
}
