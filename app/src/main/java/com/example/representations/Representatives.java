package com.example.representations;

public class Representatives {
    private String name;
    private String email;
    private String phoneNumber;
    private int image;

    public Representatives(String name, String email, String phoneNumber, int image) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.image = image;
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
}
