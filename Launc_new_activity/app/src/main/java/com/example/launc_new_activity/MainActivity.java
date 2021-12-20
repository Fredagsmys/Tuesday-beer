package com.example.launc_new_activity;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }
    public void launchSettings(View v){
        //launch a new activity

        Intent intent  = new Intent(this,SettingsActivity.class);
        String message = ((EditText) findViewById(R.id.et_text)).getText().toString();
        intent.putExtra("firstExtra",message);

        startActivity(intent);


    }
}