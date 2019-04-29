package com.example.representations;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    private static String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_repre);
        Button next = findViewById(R.id.Get_Location);
        Button getbill = findViewById(R.id.get_bill);
        getbill.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, BillRecycler.class);
                startActivity(intent);
            }
        });
        final EditText inputLocation = findViewById(R.id.textView3);
        String[] copy = inputLocation.getText().toString().split(" ");
        for (String c : copy) {
            c.replaceAll(",", "");
        }
        final String[] input = copy;
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        System.out.println("1");
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] input = inputLocation.getText().toString().split(" ");
                for (String c : input) {
                    c.replaceAll(",", "");
                }
                GetJson process = new GetJson();
                process.execute(input);
                System.out.println("2");
                TextView textView = findViewById(R.id.text);
                try {
                    data = process.get();
                    textView.setText(data);
                    Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                    intent.putExtra("json", data);
                    startActivity(intent);
                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Invalid address", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

    }

    public static String getData() { return data; };
}

