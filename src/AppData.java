import java.net.Socket;

/*
 * @author: Chhai Chivon on Jan 20, 2020
 * Senior Application Developer
 */

public class AppData {

private static AppData INSTANCE;
	
	private String username;
	private Socket connection;
	
	private AppData() {
		
	};
	
	public static AppData getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new AppData();
		}
		return INSTANCE;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Socket getConnection() {
		return connection;
	}

	public void setConnection(Socket connection) {
		this.connection = connection;
	}
}
