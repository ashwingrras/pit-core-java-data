package org.example.networking;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client3 {
    public static void main(String[] args) {
        String hostname = "localhost"; //"server_public_ip";
        int port = 12345; // Server port
        try 
        {
            Socket socket = new Socket(hostname, port);
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            writer.println("Hello, Server");

            String response = reader.readLine();
            System.out.println("Server response: " + response);
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
