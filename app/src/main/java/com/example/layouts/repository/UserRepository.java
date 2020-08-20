package com.example.layouts.repository;

import com.example.layouts.R;
import com.example.layouts.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static UserRepository sInstance;
    List<User> mUsers = new ArrayList<>();

    private int[] mImages = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight,
            R.drawable.nine,
            R.drawable.ten,
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight,
            R.drawable.nine,
            R.drawable.ten
    };
    private String[] mUsernames = {
            "Sara",
            "Fateme",
            "Zahra",
            "Sana",
            "Neda",
            "Mahsa",
            "Arezo",
            "Nazanin",
            "Maryam",
            "Farideh",
            "Sara",
            "Fateme",
            "Zahra",
            "Sana",
            "Neda",
            "Mahsa",
            "Arezo",
            "Nazanin",
            "Maryam",
            "Farideh"
    };


    private UserRepository() {
        generateUsers();
    }

    public static UserRepository getInstance() {
        if (sInstance==null)
            sInstance=new UserRepository();
        return sInstance;
    }

    private void generateUsers(){
        for (int i = 0; i < mUsernames.length; i++) {
            mUsers.add(new User(mUsernames[i], mImages[i]));
        }
    }

    public List<User> getUsers() {
        return mUsers;
    }
}
