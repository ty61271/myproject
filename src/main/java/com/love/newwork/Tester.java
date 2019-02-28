package com.love.newwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
            URL url=new URL("http://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f");
            HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            InputStream is=connection.getInputStream();
            BufferedReader bf=new BufferedReader(new InputStreamReader(is));
            String line=bf.readLine();
            StringBuilder json=new StringBuilder();
            while (line!=null){
//                System.out.println(line);
                json.append(line+"\n");
                line=bf.readLine();
            }
            System.out.println(json.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
