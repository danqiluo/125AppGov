package com.example.representations;

public class Representatives {
    private String name;
    private String email;
    private String phoneNumber;
    private char party;
    private String title;
    private int image;

    public Representatives(String name, String email, String phoneNumber, String title, char party, int image) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.title = title;
        this.party = party;
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

    public int getImage() {
        return image;
    }

    public char getParty() { return party; }

    public String getTitle() { return title; }
}
