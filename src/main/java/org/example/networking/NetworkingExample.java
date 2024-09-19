package org.example.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*

1. URL (Uniform Resource Locator)

Represents a reference to a resource on the internet.
Classes: URL, URLConnection.

2. Sockets

Used for communication between a client and server.
Classes: Socket (for clients), ServerSocket (for servers).

3. Datagrams (UDP)

For connectionless communication.
Classes: DatagramPacket, DatagramSocket.

4. Multithreading

Often used in server applications to handle multiple clients simultaneously.

IP Address
Protocol
Port Number
MAC Address
Connection-oriented and connection-less protocol
Socket

Socket API Image

Classes in java.net:
InetAddress
URL: https://beta-console.spotrack.in/
URLConnection
HttpURLConnection: CRUD (GET, POST, PUT, DELETE)
Socket: client
ServerSocket: server
DatagramSocket: UDP
DatagramPacket: UDP
*/

public class NetworkingExample
{
    public static void main(String[] args) {

        try{
            System.out.println("at Networking Example");
            ServerSocket ss=new ServerSocket(1234);
            System.out.println("after ServerSocket");
            callToClient();
            Socket s=ss.accept();//establishes connection
            System.out.println("connection accepted");
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String  str = dis.readUTF();
            System.out.println("message from client as:  "+str);
            ss.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void callToClient()
    {
        try
        {
            System.out.println("at callToClient");
            Socket s=new Socket("localhost",1234);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Message to server Hello Server");
            dout.flush();
            dout.close();
            s.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
