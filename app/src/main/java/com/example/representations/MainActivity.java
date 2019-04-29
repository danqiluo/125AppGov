package com.example.representations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RepreAdapter adapter;

    List<Official> PeopleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureBackButton();
        PeopleList = new ArrayList<>();

        Intent intent = getIntent();
        PeopleList = new ArrayList<>();
        PeopleList = CivicJSON.getOfficials(intent.getStringExtra("json"));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RepreAdapter(PeopleList, this);

        recyclerView.setAdapter(adapter);

    }
    private void configureBackButton() {
        Button backButton = findViewById(R.id.go_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }

}

