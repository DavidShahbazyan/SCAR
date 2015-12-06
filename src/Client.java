import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 12/5/15 <br/>
 * <b>Time:</b> 11:11 AM <br/>
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Integer port = (Integer) Constants.SOCKET_PORT.getValue();
        String message = String.format("Enter IP address of a machine that is running the server on port %s:", port);
        String serverAddress = JOptionPane.showInputDialog(message);
        Socket socket = new Socket(serverAddress, 12345);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String response = reader.readLine();
        JOptionPane.showMessageDialog(null, response);
        System.exit(0);
    }
}
