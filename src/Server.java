import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 12/5/15 <br/>
 * <b>Time:</b> 11:11 AM <br/>
 */
public class Server {
    public static void main(String[] args) throws IOException {
        Integer port = (Integer) Constants.SOCKET_PORT.getValue();
        try (ServerSocket listener = new ServerSocket(port)) {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.printf("Listening port %d on %s%n", port, localHost.getHostAddress());
            while (true) {
                try (Socket socket = listener.accept()) {
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    pw.println(processUserCommand(socket.getInputStream()).getRespMsg());
                }
            }
        }
    }

    private static Response processUserCommand(InputStream socketInputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socketInputStream));
        return Response.OK;
    }
}
