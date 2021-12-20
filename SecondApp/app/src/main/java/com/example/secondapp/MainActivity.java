package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //open another activity
        Button secondActivityBtn = (Button)findViewById(R.id.secondActivityBtn);

        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("com.example.secondapp.SOMETHING", "HELLO THIS NEW PAGE");
                startActivity(startIntent);
            }
        });
        //launch an activity that is outside of app (NOT WORKING)
        Button googleActivityBtn = (Button)findViewById(R.id.GoogleBtn);
        googleActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "http://www.yahoo.com";
                Uri webaddress = Uri.parse(google);  //universal resource identifier

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);

                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);
                }


            }
        });

    }
}