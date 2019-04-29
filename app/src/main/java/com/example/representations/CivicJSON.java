package com.example.representations;

import com.google.api.services.civicinfo.CivicInfo;
import com.google.api.services.civicinfo.CivicInfoRequest;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import java.util.ArrayList;

public class CivicJSON {

    public static ArrayList<Official> getOfficials(final String json) {
        if (json != null) {
            JsonParser parser = new JsonParser();
            JsonObject result = parser.parse(json).getAsJsonObject();
            JsonArray offices = result.getAsJsonArray("offices");
            JsonArray officials = result.getAsJsonArray("officials");
            ArrayList<Official> list = new ArrayList<>();
            for (JsonElement office : offices) {
                JsonObject o = office.getAsJsonObject();
                String title = o.get("name").getAsString();
                String level = o.get("level").getAsString();
                JsonArray arr = o.getAsJsonArray("officialIndices");
                for (JsonElement index : arr) {
                    int i = index.getAsInt();
                    JsonObject official = officials.get(i).getAsJsonObject();
                    String name = official.get("name").getAsString();
                    String party = null;
                    if (official.get("party") != null) {
                        party = official.get("party").getAsString();
                    }
                    String phone = null;
                    if (official.get("phones") != null) {
                        phone = official.get("phones").getAsJsonArray().get(0).getAsString();
                    }
                    String email = null;
                    if (official.get("emails") != null) {
                        email = official.get("emails").getAsJsonArray().get(0).getAsString();
                    }
                    String image = null;
                    if (official.get("photoUrl") != null) {
                        image = official.get("photoUrl").getAsString();
                    }
                    Official person = new Official(name, email, phone, title, party, level, image);
                    list.add(person);
                }
            }
            return list;
        }
        return null;
    }
}
