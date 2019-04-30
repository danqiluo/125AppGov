package com.example.representations;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.InputStream;
import java.net.URL;

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
        System.out.println(this.toString());
    }

    public String toString() {
        return "[" + name + ", " + email + ", " + phoneNumber + ", " + title + ", " + party + ", " + level + ", " + imageURL + "]";
    }
    public Drawable getDrawable(Context context) {
        if (imageURL != null) {
            try {
                Drawable d = new getPhoto().execute(imageURL).get();
                if (d != null) {
                    return d;
                }
            } catch (Exception e) {
            }
        }
        if (party != null) {
            if (party.equals("Democratic")) {
                return context.getResources().getDrawable(R.drawable.surface);
            } else if (party.equals("Republican")) {
                return context.getResources().getDrawable(R.drawable.macbook);
            }
        }
        return context.getResources().getDrawable(R.drawable.surface);
    }

    class getPhoto extends AsyncTask<String, Void, Drawable> {

        protected Drawable doInBackground(String... url) {
            try {
                InputStream is = (InputStream) new URL(url[0]).getContent();
                System.out.println("InputStream???");
                Drawable d = Drawable.createFromStream(is, null);
                is.close();
                return d;
            } catch (Exception e) {
                return null;
            }
        }
    }

    private Official(Parcel in) {
        this.name = in.readString();
        this.email = in.readString();
        this.phoneNumber = in.readString();
        this.title = in.readString();
        this.party = in.readString();
        this.level = in.readString();
        this.imageURL = in.readString();
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

    public String getLevel() {
        return level;
    }
}
