package com.example.odlingino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.lang.annotation.Target;
import java.util.Collections;

import wse.generated.GetSensorData;
import wse.generated.definitions.GetSensorDataSchema;
import wse.utils.HttpCall;

public class TableActivity extends AppCompatActivity {
    LinearLayout rootLayout;
    TextView counterField;
    FloatingActionButton gotoChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        rootLayout = findViewById(R.id.rootLayout);
        counterField = findViewById(R.id.counterField);
        gotoChart = findViewById(R.id.gotoChartFloating);

        gotoChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(TableActivity.this, ChartActivity.class);
                startActivity(i);
            }
        });


        GetSensorDataSchema.GetSensorDataRequestType request = new GetSensorDataSchema.GetSensorDataRequestType();
        request.sensorID = 1;
        GetSensorData get = new GetSensorData();
        Utils.setTarget(get);
        get.callAsync(request, new HttpCall.AsyncCallback<GetSensorDataSchema.GetSensorDataResponseType>() {
            @Override
            public void onSuccess(GetSensorDataSchema.GetSensorDataResponseType response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        int counter = 0;
                        Collections.reverse(response.data);
                        for (GetSensorDataSchema.Data data :response.data){
                            DataLayout dataLayout = new DataLayout(getApplicationContext());
                            dataLayout.timeField.setText("TimeStamp: " + data.timeStamp);
                            dataLayout.valueField.setText("Value: " + data.value.toString());
                            dataLayout.typeField.setText("SensorType: " + data.sensorType.toString());
                            rootLayout.addView(dataLayout);
                            counter++;
                        }
                        counterField.setText("Values: " + counter);
                    }
                });
            }
        });
    }
}