import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;

/**
 * Created by jienanzhang on 19/09/2017.
 */
public class ChatClient {

    private Socket socket;

    public static void main(String[] args) throws URISyntaxException {
        ChatClient c = new ChatClient();
        System.out.println("created");

    }

    public ChatClient() throws URISyntaxException {
        socket = IO.socket("https://socketio-chat-example.now.sh/");
        socket.emit("chat message", "coming");
        socket.emit("add user", "big mac");
        socket.on("login", onLogin);
        socket.on(Socket.EVENT_CONNECT, onConnect);
    }

    private Emitter.Listener onLogin = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            JSONObject data = (JSONObject) args[0];

            int numUsers;
            try {
                numUsers = data.getInt("numUsers");
                System.out.println("numbers " + numUsers);
            } catch (JSONException e) {
                return;
            }

        }
    };

    private Emitter.Listener onConnect = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            System.out.println("connected");
        }
    };
}
