package lesson6.ex1;

public class FileManager extends DataManager {
	private boolean check(String fileNameOfConnect) {
		return true;
	}

	public void saveAllText(Planner planner, String path) {
		if (check(path)) {
		}
	}

	public void LoadFomFile(Planner planner, String path) {
		if (check(path)) {
		}
	}

	private void saveDB(Planner planner, String url, String username, String password) {
		if (check(url)) {
		}
		save(planner, new ConnectProvider(url, username, password).getPath());
	}
}
