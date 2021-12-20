package com.example.launc_new_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setTitle("Settings");
        Intent intent = getIntent();
        String message = intent.getStringExtra("firstExtra");
        TextView text = findViewById(R.id.textView);
        text.setText(message);
    }

    public void launchMain(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);


    }
}