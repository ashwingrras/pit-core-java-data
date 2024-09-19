package org.example.networking;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class MyServer {
    public static void main(String[] args){
        try
        {
            System.out.println("at MyServer");
            ServerSocket serverSocket = new ServerSocket(3000); // for server
            Socket socket = serverSocket.accept();//establishes connection
            DataInputStream dis=new DataInputStream(socket.getInputStream());
            String  str=(String)dis.readUTF();
            System.out.println("message= "+str);
            serverSocket.close();
        }catch(Exception e){System.out.println(e);}
    }
}
