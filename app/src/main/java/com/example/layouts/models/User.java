package com.example.layouts.models;

public class User {
    private String mName;
    private int mImageResId;

    public User(String name, int imageResId) {
        mName = name;
        mImageResId = imageResId;
    }

    public String getName() {
        return mName;
    }

    public int getImageResId() {
        return mImageResId;
    }
}
