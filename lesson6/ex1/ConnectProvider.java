package lesson6.ex1;

public class ConnectProvider {
	String uri;
	String username;
	String password;

	public ConnectProvider(String uri, String username, String password) {
		this.uri = uri;
		this.username = username;
		this.password = password;
	}

	public String getPath() {
		return "path";
	}
}
