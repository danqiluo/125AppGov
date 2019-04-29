package com.example.representations;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        bill = intent.getParcelableExtra("official");

        TextView textView = (TextView) findViewById(R.id.info_title);
        textView.setText(bill.getTitle());


        /**
        if (bill.getParty().equals("D")) {
            name.setTextColor(context.getResources().getColor(R.color.democrat));
        } else if (bill.getParty().equals("R")) {
            name.setTextColor(context.getResources().getColor(R.color.republican));
        }*/

    }
}