import java.net.Socket;

/*
 * @author: Chhai Chivon on Jan 19, 2020
 * Senior Application Developer
 */

public interface AppCallback {

	void onLoginCompleted(boolean status, String message, Socket connection);
	
	void onFriendListRetrieved(String[] friends);
	
	void onMessageReceived(String friend, String message);
}
