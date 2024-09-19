package org.example.networking;

import java.net.URL;

public class URLExample {
    public static void main(String[] args) throws Exception {
        // https:
        //https://beta-console.spotrack.in/
        URL url = new URL("https://www.nischal.ccccc:80/index.html?&&"); //https://www.example.com:8080/index.html
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("File: " + url.getFile());
    }
}

