package com.example.representations;

import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import com.google.api.services.civicinfo.CivicInfoRequest;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.net.ssl.HttpsURLConnection;

public class GetJson extends AsyncTask<String, Void, String> {
    String data = "";

    protected String doInBackground(String... strings) {
        HttpsURLConnection con;
        String civic = "https://www.googleapis.com/civicinfo/v2/representatives?key=AIzaSyA1pusB6RwqzjSwPubteMCnfP-pfjQ6Ea0&address=";
        String search = "https://api.propublica.org/congress/v1/bills/search.json?query=";
        String recent = "https://api.propublica.org/congress/v1/115/both/bills/introduced.json";

        try {
            String inputurl;
            if (strings[0].equals("civic")) {
                inputurl = civic;
                for (int i = 1; i < strings.length - 1; i++) {
                    inputurl = inputurl + strings[i] + "%20";
                }
                inputurl = inputurl + strings[strings.length - 1];
                URL u = new URL(inputurl);
                con = (HttpsURLConnection) u.openConnection();
            } else if (strings[0].equals("recent")) {
                inputurl = recent;
                URL u = new URL(inputurl);
                con = (HttpsURLConnection) u.openConnection();
                con.setRequestProperty("X-API-Key", "ExTLJ72PRRHGi61jD8GZ4p6zaazuJfyRujQ3snOY");
            } else if (strings[0].equals("search")) {
                inputurl = search + strings[1];
                URL u = new URL(inputurl);
                con = (HttpsURLConnection) u.openConnection();
                con.setRequestProperty("X-API-Key", "ExTLJ72PRRHGi61jD8GZ4p6zaazuJfyRujQ3snOY");
            } else {
                return null;
            }

            con.connect();
            StringBuilder sb;
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();
            } catch (FileNotFoundException e){
                return null;
            }
            return sb.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}