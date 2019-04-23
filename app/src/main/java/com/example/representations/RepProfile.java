package com.example.representations;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class RepProfile extends AppCompatActivity {
    Official official;
    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rep_profile);

        context = getApplicationContext();

        Intent intent = getIntent();
        official = intent.getParcelableExtra("official");

        ((ImageView) findViewById(R.id.propic)).setImageDrawable(context.getResources().getDrawable(official.getImage()));
    }
}
