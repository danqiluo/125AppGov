package com.example.representations;

import com.example.representations.Official;
import com.google.api.services.civicinfo.CivicInfoRequest;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import java.util.ArrayList;

public class BillJSON {

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
                ArrayList<Bill> list = new ArrayList<>();
                Bill newbill = new Bill(id, party, topic, active, sponsorName);
                list.add(newbill);
            }

        }
        return null;
    }
}
