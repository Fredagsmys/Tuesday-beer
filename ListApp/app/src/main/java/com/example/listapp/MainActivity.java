package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Button> btns = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btns.add((Button) findViewById(R.id.speed));
        btns.add((Button) findViewById(R.id.kong));
        btns.add((Button) findViewById(R.id.backflip));
    }
    public void unlock(View v){
        Button btn = (Button) v;
        btn.setBackgroundColor(Color.parseColor("#1F7818"));
    }
    public void reset(View v){
        for(Button btn:btns){
            btn.setBackgroundColor(Color.parseColor("#5C0B0B"));
        }

    }
}