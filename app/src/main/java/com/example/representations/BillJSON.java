package com.example.representations;

import android.os.AsyncTask;

import com.example.representations.Official;
import com.google.api.services.civicinfo.CivicInfoRequest;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import java.util.ArrayList;

public class BillJSON extends AsyncTask<String, Void, String> {
    @Override
    protected String doInBackground(String... strings) {
        return null;
    }

    public static ArrayList<Official> getBills(final String json) {
        if (json != null) {
            JsonParser parser = new JsonParser();
            JsonObject result = parser.parse(json).getAsJsonObject();
            JsonArray bills = result.getAsJsonArray("results")
                                .get(0)
                                .getAsJsonObject().getAsJsonArray("bills");
            for (JsonElement bill : bills) {
                JsonObject b = bill.getAsJsonObject();
                String id = null;
                if (b.get("bill_id") != null) {
                    id = b.get("bill_id").getAsString();
                }
                String title = null;
                if (b.get("title") != null) {
                    title = b.get("title").getAsString();
                }
                String party = null;
                if (b.get("bill_type") != null) {
                    party = b.get("bill_type").getAsString();
                }
                String topic = null;
                if (b.get("summary_subject") != null) {
                    topic = b.get("summary_subject").getAsString();
                }
                String active = null;
                if (b.get("active") != null) {
                    active = b.get("active").getAsString();
                }
                String sponsorName = null;
                if (b.get("sponsor_name") != null) {
                    sponsorName = b.get("sponsor_name").getAsString();
                }
                /**
                String detail = null;
                if (b.get("sponsor_state") != null
                    && b.get("introduced_date") != null) {
                    detail = b.get("sponsor_state").getAsString() + b.get("introduced_date").getAsString();
                }*/
                ArrayList<Bill> list = new ArrayList<>();
                Bill newbill = new Bill(id, title, party, topic, active, sponsorName);
                list.add(newbill);
            }

        }
        return null;
    }
}
