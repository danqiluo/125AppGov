package com.example.representations;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static java.net.Proxy.Type.HTTP;

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
        TextView name = findViewById(R.id.info);
        name.setText(official.getTitle() + " " + official.getName());
        if (official.getParty().equals("d")) {
            name.setTextColor(context.getResources().getColor(R.color.democrat));
        } else if (official.getParty().equals("r")) {
            name.setTextColor(context.getResources().getColor(R.color.republican));
        }
        (findViewById(R.id.email_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                // The intent does not have a URI, so declare the "text/plain" MIME type
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {official.getEmail()}); // recipients
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "[YOUR ISSUE]");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear " + official.getName() +" ,");
            }
        });

        (findViewById(R.id.phone_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse("tel:" + official.getPhoneNumber());
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });
    }
}
