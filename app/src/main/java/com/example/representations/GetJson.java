package com.example.representations;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
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

    public GetJson() throws IOException {
    }

    protected String doInBackground(String... strings) {
        HttpsURLConnection con;
        try {
            String inputurl = "https://www.googleapis.com/civicinfo/v2/representatives?key=AIzaSyA1pusB6RwqzjSwPubteMCnfP-pfjQ6Ea0&address=1263%20Pacific%20Ave.%20Kansas%20City%20KS";
            URL u = new URL(inputurl);
            con = (HttpsURLConnection) u.openConnection();

            con.connect();
            con.setRequestProperty("X-API-Key", "ExTLJ72PRRHGi61jD8GZ4p6zaazuJfyRujQ3snOY");
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            return sb.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    protected String getData() {
        return data;
    }
    /**
    protected static URL createUrl(String url) {
        URL billurl = null;
        try {
            billurl = new URL(url);
            HttpURLConnection urlConnection = (HttpURLConnection) billurl.openConnection();
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException q) {
            q.printStackTrace();
        }
        return billurl;
    }
    protected static String makeHttpRequest(URL url) throws IOException {
        String response = "";
        if (url == null) {
            return response;
        }
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        try{
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000 );
            urlConnection.setConnectTimeout(15000 );
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty ("Authorization", "ExTLJ72PRRHGi61jD8GZ4p6zaazuJfyRujQ3snOY");
            urlConnection.connect();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
        System.out.println(response);
        return response;
    }
    String response = makeHttpRequest(createUrl("https://api.propublica.org/congress/v1/{congress}/{chamber}/bills/{type}.json"));
*/
}
