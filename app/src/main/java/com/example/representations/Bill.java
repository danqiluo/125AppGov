package com.example.representations;

import android.os.Parcel;
import android.os.Parcelable;

public class Bill implements Parcelable {
    private String billID;
    private String party;
    private String topic;
    private String active;
    private String sponsorName;
    private String title;

    public Bill(String billID, String title, String party, String topic, String active, String sponsorName) {
        this.billID = billID;
        this.party = party;
        this.topic = topic;
        this.active = active;
        this.sponsorName = sponsorName;
        this.title = title;
    }

    protected Bill(Parcel in) {
        billID = in.readString();
        party = in.readString();
        topic = in.readString();
        active = in.readString();
        sponsorName = in.readString();
        title = in.readString();
    }

    public static final Creator<Bill> CREATOR = new Creator<Bill>() {
        @Override
        public Bill createFromParcel(Parcel in) {
            return new Bill(in);
        }

        @Override
        public Bill[] newArray(int size) {
            return new Bill[0];
        }
    };

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

    public String getTitle() { return title; };

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(billID);
        dest.writeString(party);
        dest.writeString(topic);
        dest.writeString(active);
        dest.writeString(sponsorName);
        dest.writeString(title);
    }
}
