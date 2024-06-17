package com.example.prouas;

public class Contact {
    private int photoResId;
    private String name;
    private String email;
    private String phone;
    private String website;

    public Contact(int photoResId, String name, String email, String phone, String website) {
        this.photoResId = photoResId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.website = website;
    }

    public int getPhotoResId() {
        return photoResId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }
}
