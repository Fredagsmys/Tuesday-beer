package com.example.betygsttalkoholen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FriendsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_menu);
        ActionBar bar = this.getSupportActionBar();
        bar.setDisplayShowCustomEnabled(true);
        bar.setCustomView(R.layout.toolbar_layout);
    }
}