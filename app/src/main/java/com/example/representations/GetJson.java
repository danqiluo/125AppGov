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
public class GetJson extends AsyncTask<Void, Void, Void> {
    String data = "";

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            String inputurl = "https://www.googleapis.com/civicinfo/v2/voterinfo?key=AIzaSyA1pusB6RwqzjSwPubteMCnfP-pfjQ6Ea0&address=%20%20City%20" + SearchActivity.input + "&electionId=2000";
            URL url = new URL(inputurl);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = " ";
            while(line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        SearchActivity.data = this.data;
    }
}
