package com.example.representations;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
        //BillList = BillJSON.getBills(intent.getStringExtra("json"));
        BillList.add(new Bill("hr2739-113","Efficient Use of Government Spectrum Act of 2013","2013-07-18","Science, Technology, Communications","false","Doris Matsui","House Armed Services Committee","sdfs","sdfsd"));
        recyclerView = findViewById(R.id.bill_recycler);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new BillAdapter(BillList, this);
        recyclerView.setAdapter(adapter);

    }
}
