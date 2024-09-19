package org.example.networking;


import java.net.HttpURLConnection;
import java.net.URL;
public class HttpUrlInfo
{
    public static void main(String[] args)
    {
        try
        {
            ////https://beta-console.spotrack.in/
            URL url=new URL("https://www.google.com/"); ////https://www.google.com/
            HttpURLConnection huc=(HttpURLConnection)url.openConnection();
            System.out.println(huc.getContentLength());
            for(int i=1;i<=20;i++)
            {
                System.out.println(i);
                if(null != huc.getHeaderFieldKey(i) && null != huc.getHeaderField(i))
                {
                    System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
                }
            }
            huc.disconnect();
        }catch(Exception e){System.out.println(e);}
    }
}
