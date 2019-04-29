package com.example.representations;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BillRecycler extends AppCompatActivity {
    RecyclerView recyclerView;
    BillAdapter adapter;

    List<Bill> BillList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bill_recyclerview);
        BillList = new ArrayList<>();

        Intent intent = getIntent();
        BillList = new ArrayList<>();
        //BillList = CivicJSON.getOfficials(intent.getStringExtra("json"));

        recyclerView = findViewById(R.id.bill_recycler);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        BillList.add(
         new Bill("hr3355-113", "D", "Economics and Public Finance", "active", "Brett Guthrie"));
        adapter = new BillAdapter(BillList, this);
        recyclerView.setAdapter(adapter);

    }
}
