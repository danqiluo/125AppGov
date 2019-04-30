package com.example.representations;

import android.os.Parcel;
import android.os.Parcelable;

public class Bill implements Parcelable {
    private String billID;
    private String introduceDate;
    private String topic;
    private String active;
    private String sponsorName;
    private String title;
    private String committees;
    private String summary;
    private String url;

    public Bill(String billID, String title, String introduceDate, String topic, String active, String sponsorName,
                String committees, String summary, String url) {
        this.billID = billID;
        this.introduceDate = introduceDate;
        this.topic = topic;
        this.active = active;
        this.sponsorName = sponsorName;
        this.title = title;
        this.committees = committees;
        this.summary = summary;
        this.url = url;
    }

    protected Bill(Parcel in) {
        billID = in.readString();
        introduceDate = in.readString();
        topic = in.readString();
        active = in.readString();
        sponsorName = in.readString();
        title = in.readString();
        summary = in.readString();
        url = in.readString();
        committees = in.readString();
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

    public String getIntroduceDate() {
        return introduceDate;
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

    public String getTitle() {
        return title;
    }

    public String getCommittees() {
        return committees;
    }

    public String getSummary() {
        return summary;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(billID);
        dest.writeString(introduceDate);
        dest.writeString(topic);
        dest.writeString(active);
        dest.writeString(sponsorName);
        dest.writeString(summary);
        dest.writeString(url);
        dest.writeString(committees);
        dest.writeString(title);
    }
}
