package com.example.representations;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class BillProfile extends AppCompatActivity {
    Bill bill;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bill_detailview);

        context = getApplicationContext();

        Intent intent = getIntent();
        bill = intent.getParcelableExtra("bill");

        TextView title = (TextView) findViewById(R.id.info_title);
        title.setText(bill.getTitle());
        TextView billid = (TextView) findViewById(R.id.info_id);
        billid.setText(bill.getBillID());
        TextView sponsor = (TextView) findViewById(R.id.info_sponsor);
        sponsor.setText(bill.getSponsorName());
        TextView active = (TextView) findViewById(R.id.info_active);
        active.setText(bill.getActive());
        TextView date = (TextView) findViewById(R.id.info_date);
        date.setText(bill.getIntroduceDate());
        TextView committee = (TextView) findViewById(R.id.info_committee);
        committee.setText(bill.getCommittees());
        TextView summary = (TextView) findViewById(R.id.info_summary);
        summary.setText(bill.getSummary());
        TextView topic = (TextView) findViewById(R.id.info_topic);
        topic.setText(bill.getTopic());
        TextView url = (TextView) findViewById(R.id.info_url);
        url.setText(bill.getUrl());
        url.setMovementMethod(LinkMovementMethod.getInstance());


    }
}