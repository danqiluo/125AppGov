package com.example.representations;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.json.JsonParser;
import com.google.api.services.civicinfo.CivicInfo;
import com.google.api.services.civicinfo.CivicInfoRequest;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.apache.http.protocol.HTTP;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    static String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_repre);
        Button next = (Button) findViewById(R.id.Get_Location);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetJson process = new GetJson();
                process.execute();
                TextView textView = (TextView) findViewById(R.id.text);
                textView.setText(data);
                textView.setVisibility(View.VISIBLE);
            }
        });
        /**
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        //ExTLJ72PRRHGi61jD8GZ4p6zaazuJfyRujQ3snOY Bill api key
        //AIzaSyA1pusB6RwqzjSwPubteMCnfP-pfjQ6Ea0  Civic api key
        String url = "http://myjson.com/8la30";
        String url2 = "https://api.propublica.org/congress/v1/members/L000287/bills/introduced.json";
        final TextView textView = (TextView) findViewById(R.id.text);
        //
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        textView.setText(response.substring(0, 500));
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("no");
            }
        });
        requestQueue.add(stringRequest);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url2,
                null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                textView.setText(response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("nope");
            }
        });
        requestQueue.add(jsonObjectRequest);

        */
    }
}

