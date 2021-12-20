package com.example.odlingino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import wse.generated.GetSensorData;
import wse.generated.definitions.GetSensorDataSchema;
import wse.utils.HttpCall;

public class MainActivity extends AppCompatActivity {
Button gotoChart;
Button gotoTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gotoTable = findViewById(R.id.gotoTable);
        gotoChart = findViewById(R.id.gotoChart);

        gotoChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ChartActivity.class);
                startActivity(i);
            }
        });

        gotoTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TableActivity.class);
                startActivity(i);
            }
        });


    }
}