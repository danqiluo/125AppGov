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
                String number = null;
                if (b.get("number") != null) {
                    number = b.get("number").getAsString();
                }
                String uri = null;
                if (b.get("bill_uri") != null) {
                    uri = b.get("bill_uri").getAsString();
                }
                String shortTitle = null;
                if (b.get("short_title") != null) {
                    shortTitle = b.get("short_title").getAsString();
                }
                String sponsorName = null;
                if (b.get("sponsor_name") != null) {
                    sponsorName = b.get("sponsor_name").getAsString();
                }
                ArrayList<Bill> list = new ArrayList<>();
                Bill newbill = new Bill(id, number, uri, shortTitle, sponsorName);
                list.add(newbill);

            }

        }
        return null;
    }
}
