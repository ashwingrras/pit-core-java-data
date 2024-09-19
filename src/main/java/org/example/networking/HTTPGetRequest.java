package org.example.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPGetRequest {
    public static void main(String[] args) {
        try {
            // api/users :GET, POST, PUT, DELETE
            URL url = new URL("https://fakestoreapi.com/products");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            //More Headers
            /*
            conn.setRequestProperty("Authorization", "Bearer YOUR_TOKEN_HERE");
            conn.setConnectTimeout(10000); // 10 seconds
            conn.setReadTimeout(10000); // 10 seconds
            */

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
            {
                content.append(inputLine);
            }
            in.close();
            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

