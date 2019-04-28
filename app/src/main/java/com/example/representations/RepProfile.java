package com.example.representations;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;

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

        ImageView picture = findViewById(R.id.propic);
        picture.setImageDrawable(official.getDrawable(context));
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
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {official.getEmail()});
                intent.putExtra(Intent.EXTRA_SUBJECT, "[subject]");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
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
