package com.example.representations;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.List;
import java.util.Locale;

public class SearchActivity extends AppCompatActivity
        implements ActivityCompat.OnRequestPermissionsResultCallback {

    private static String data;
    //private static String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_repre);
        final EditText inputLocation = findViewById(R.id.textView3);

        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValidLocation(inputLocation.getText().toString())) {
                    String in = "civic " + inputLocation.getText().toString();
                    String[] input = in.split(" ");
                    for (String c : input) {
                        c.replaceAll(",", "");
                    }
                    GetJson process = new GetJson();
                    process.execute(input);
                    try {
                        data = process.get();
                        if (data != null) {
                            Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                            intent.putExtra("json", data);
                            startActivity(intent);
                        }
                    } catch (Exception e) {
                    }
                }
                Toast toast = Toast.makeText(getApplicationContext(), "Invalid address", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Button bills = findViewById(R.id.get_bill);
        bills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, SearchBills.class);
                startActivity(intent);
            }
        });

    }

    private boolean isValidLocation(String address) {
        if (address.length() > 0) {
            return true;
        }
        return false;
    }

}