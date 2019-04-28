package com.example.representations;

import android.os.Parcel;
import android.os.Parcelable;

public class Official implements Parcelable {
    private String name;
    private String email;
    private String phoneNumber;
    private String party;
    private String title;
    private String level;
    private String imageURL;

    public Official(String name, String email, String phoneNumber, String title, String party, String level, String url) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.title = title;
        this.party = party;
        this.level = level;
        this.imageURL = url;
    }

    private Official(Parcel in) {
        this.name = in.readString();
        this.email = in.readString();
        this.phoneNumber = in.readString();
        this.title = in.readString();
        this.party = in.readString();
        this.level = in.readString();
    }

    public static final Parcelable.Creator<Official> CREATOR = new Parcelable.Creator<Official>(){

        @Override
        public Official createFromParcel(Parcel parcel) {
            return new Official(parcel);
        }

        @Override
        public Official[] newArray(int size) {
            return new Official[0];
        }
    };

    public int describeContents() {
        return hashCode();
    }

    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(name);
        dest.writeString(email);
        dest.writeString(phoneNumber);
        dest.writeString(title);
        dest.writeString(party);
        dest.writeString(level);
        dest.writeString(imageURL);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getParty() { return party; }

    public String getTitle() { return title; }
}
