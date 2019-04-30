package com.example.representations;

import android.os.AsyncTask;

import com.example.representations.Official;
import com.google.api.services.civicinfo.CivicInfoRequest;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import java.util.ArrayList;

public class BillJSON {
    public static ArrayList<Bill> getBills(final String json) {
        if (json != null) {
            ArrayList<Bill> list = new ArrayList<>();
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
                String date = null;
                if (b.get("introduced_date") != null) {
                    date = b.get("introduced_date").getAsString();
                }
                String committee = null;
                if (b.get("committees") != null) {
                    committee = b.get("committees").getAsString();
                }
                String summary = null;
                if (b.get("summary") != null) {
                    summary = b.get("summary").getAsString();
                }
                String url = null;
                if (b.get("congressdotgov_url") != null) {
                    url = b.get("congressdotgov_url").getAsString();
                }
                String topic = null;
                if (b.get("primary_subject") != null) {
                    topic = b.get("primary_subject").getAsString();
                }
                String active = null;
                if (b.get("active") != null) {
                    active = b.get("active").getAsString();
                }
                String sponsorName = null;
                if (b.get("sponsor_name") != null) {
                    sponsorName = b.get("sponsor_name").getAsString();
                    if (b.get("sponsor_title") != null) {
                        sponsorName = b.get("sponsor_title").getAsString() + " " + sponsorName;
                    }
                    if (b.get("sponsor_party") != null && b.get("sponsor_state") != null) {
                        sponsorName = sponsorName + " (" + b.get("sponsor_party").getAsString() + "-" + b.get("sponsor_state").getAsString() + ")";
                    }
                }
                String shortTitle = null;
                if (b.get("short_title") != null) {
                    shortTitle = b.get("short_title").getAsString();
                }
                Bill newBill = new Bill(id, title, date, topic, active, sponsorName, committee, summary, shortTitle, url);
                list.add(newBill);
            }
            return list;
        }
        return null;
    }
}
