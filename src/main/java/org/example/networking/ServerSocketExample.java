package org.example.networking;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExample {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(6789);

        while (true)
        {
            Socket clientSocket = serverSocket.accept();
            InputStream input = clientSocket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = input.read(buffer);
            System.out.println("Received: " + new String(buffer, 0, bytesRead));

            OutputStream output = clientSocket.getOutputStream();
            output.write("Hello Client".getBytes());

            clientSocket.close();
        }
    }
}

