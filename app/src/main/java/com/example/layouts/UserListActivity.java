package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class UserListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_container);

        if (fragment == null)
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new UserListFragment())
                    .commit();

    }
}