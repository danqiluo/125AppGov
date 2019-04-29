package com.example.representations;

public class Bill {
    private String billID;
    private String party;
    private String topic;
    private String active;
    private String sponsorName;

    public Bill(String billID, String party, String topic, String active, String sponsorName) {
        this.billID = billID;
        this.party = party;
        this.topic = topic;
        this.active = active;
        this.sponsorName = sponsorName;
    }

    public String getBillID() {
        return billID;
    }

    public String getParty() {
        return party;
    }

    public String getTopic() {
        return topic;
    }

    public String getActive() {
        return active;
    }

    public String getSponsorName() {
        return sponsorName;
    }
}
