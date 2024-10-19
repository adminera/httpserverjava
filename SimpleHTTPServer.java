// imports
import java.net.ServerSocket; // allows for a server to be created
import java.net.Socket; // allows for a client to connect to the server
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SimpleHTTPServer {
    public static void main(String[] args) throws Exception{
        // creates a socket so a client can connect to it on port 8080
        final ServerSocket server = new ServerSocket(8080);
        // msg to confirm that it is listening for a connection on port 8080
        System.out.println("Listening for a connection on port 8080.....");
        // this is a loop so that the server can keep on listening for a connection
        while (true) {
            // this will allow for a client to connect as long as the server is running which is (true)
            final Socket client = server.accept();
            

        }


    }


}



