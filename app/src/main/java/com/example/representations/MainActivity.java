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

    List<Representatives> PeopleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PeopleList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PeopleList.add(
                new Representatives(
                        "John",
                        "something@gmail.com",
                        "2178888888",
                        R.drawable.macbook));

        PeopleList.add(
                new Representatives(
                        "Sarah",
                        "somethingthig@gmail.com",
                        "2178855588",
                        R.drawable.surface));
        adapter = new RepreAdapter(PeopleList, this);

        recyclerView.setAdapter(adapter);

    }

}

