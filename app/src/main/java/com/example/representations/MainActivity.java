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
        System.out.println("FUCK");

        Intent intent = getIntent();
        PeopleList = new ArrayList<>();
        PeopleList = CivicJSON.getOfficials(intent.getStringExtra("json"));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        System.out.println("FUCK2");
        PeopleList.add(
                new Official(
                        "John Saltman",
                        "something@gmail.com",
                        "2178888888",
                        "Treasurer",
                        "d",
                        "county",
                        "https://thumbs-prod.si-cdn.com/c3phl1TZgQ92bLQugItmtovLZhs=/fit-in/1600x0/https://public-media.si-cdn.com/filer/54/10/5410da58-2295-4e3a-a847-fecd41cdcdd9/scarlet_tanager.jpg"));

        PeopleList.add(
                new Official(
                        "Sarah Pepper",
                        "somethingthig@gmail.com",
                        null,
                        "Senator",
                        "r",
                        "state",
                        "https://static.independent.co.uk/s3fs-public/thumbnails/image/2018/04/10/19/pinyon-jay-bird.jpg?w968h681"));
        adapter = new RepreAdapter(PeopleList, this);

        //PeopleList = CivicJSON.getOfficials(SearchActivity.data);
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

