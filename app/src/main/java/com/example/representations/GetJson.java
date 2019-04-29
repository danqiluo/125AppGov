package com.example.representations;

import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.TextView;

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

    protected String doInBackground(String... strings) {
        HttpsURLConnection con;
        try {
            String inputurl = "https://www.googleapis.com/civicinfo/v2/representatives?key=AIzaSyA1pusB6RwqzjSwPubteMCnfP-pfjQ6Ea0&address=1263%20Pacific%20Ave.%20Kansas%20City%20KS";
            URL u = new URL(inputurl);
            con = (HttpsURLConnection) u.openConnection();

            con.connect();


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

    /**@Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        SearchActivity.data = this.data;
    }**/
}
