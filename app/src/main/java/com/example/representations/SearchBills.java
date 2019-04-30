package com.example.representations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchBills extends AppCompatActivity {
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_bills);

        Button recent = findViewById(R.id.recent);

        recent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetJson process = new GetJson();
                process.execute("recent");
                try {
                    data = process.get();
                    Intent intent = new Intent(SearchBills.this, BillRecycler.class);
                    intent.putExtra("json", data);
                    startActivity(intent);
                } catch (Exception e) {
                }
            }
        });

        Button search = findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ((EditText)findViewById(R.id.search_bar)).getText().toString();
                String[] input = {"search", text};
                GetJson process = new GetJson();
                process.execute(input);
                try {
                    data = process.get();
                    Intent intent = new Intent(SearchBills.this, BillRecycler.class);
                    intent.putExtra("json", data);
                    startActivity(intent);
                } catch (Exception e) {
                }
            }
        });
    }
}
