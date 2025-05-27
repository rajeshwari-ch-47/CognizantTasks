
import java.io.*;
import java.net.*;

public class t35_tcpserver {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started, waiting for client...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String msgFromClient, msgToClient;

            // Simple chat loop
            while (true) {
                msgFromClient = in.readLine();
                if (msgFromClient == null || msgFromClient.equalsIgnoreCase("bye")) {
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Client: " + msgFromClient);

                System.out.print("Server: ");
                msgToClient = userInput.readLine();
                out.println(msgToClient);
                if (msgToClient.equalsIgnoreCase("bye")) {
                    System.out.println("Connection closed.");
                    break;
                }
            }
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
