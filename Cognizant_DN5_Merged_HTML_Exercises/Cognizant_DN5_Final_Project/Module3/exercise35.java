import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket server =
                new ServerSocket(5000);

        System.out.println("Server Started");

        Socket socket =
                server.accept();

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()));

        System.out.println(
                "Client : " + br.readLine());

        socket.close();
        server.close();
    }
}
//TCP Client
import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws Exception {

        Socket socket =
                new Socket("localhost",5000);

        PrintWriter pw =
                new PrintWriter(
                        socket.getOutputStream(),
                        true);

        pw.println("Hello Server");

        socket.close();
    }
}