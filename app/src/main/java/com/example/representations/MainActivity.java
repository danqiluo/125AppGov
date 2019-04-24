package com.example.representations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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

        PeopleList = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PeopleList.add(
                new Official(
                        "John Saltman",
                        "something@gmail.com",
                        "2178888888",
                        "Treasurer",
                        "d",
                        R.drawable.macbook));

        PeopleList.add(
                new Official(
                        "Sarah Pepper",
                        "somethingthig@gmail.com",
                        "2178855588",
                        "Senator",
                        "r",
                        R.drawable.surface));
        adapter = new RepreAdapter(PeopleList, this);

        /**
         * this is work in progress code.
        for (Representatives rep: PeopleList) {
            recyclerView.addOnItemTouchListener();
            setContentView(R.layout.rep_profile);
            ((ImageView) findViewById(R.id.propic)).setImageDrawable(rep.getImage());
        }
         **/

        recyclerView.setAdapter(adapter);

    }

}

