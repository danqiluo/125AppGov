package com.example.representations;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
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

        TextView title = findViewById(R.id.info_title);
        title.setText(bill.getCommittees());
        TextView billid = findViewById(R.id.info_id);
        billid.setText(bill.getBillID());
        TextView sponsor = findViewById(R.id.info_sponsor);
        sponsor.setText(bill.getSponsorName());
        TextView active = findViewById(R.id.info_active);
        active.setText(bill.getActive());
        TextView date = findViewById(R.id.info_date);
        date.setText("Introduction Date: " + bill.getIntroduceDate());
        TextView summary = findViewById(R.id.info_title_full);
        summary.setText("Full Title: " + bill.getTitle());
        TextView topic = findViewById(R.id.info_topic);
        topic.setText(bill.getTopic());
        Button url = findViewById(R.id.congress_url);
        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent URLIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(bill.getUrl()));
                startActivity(URLIntent);
            }
        });


    }
}