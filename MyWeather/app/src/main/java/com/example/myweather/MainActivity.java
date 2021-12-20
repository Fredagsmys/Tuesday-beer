package com.example.myweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import wse.generated.GetTemp;
import wse.generated.definitions.GetTempSchema;
import wse.utils.HttpCall;

public class MainActivity extends AppCompatActivity {

    LinearLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootLayout = findViewById(R.id.rootLayout);
        GetTempSchema.GetTempRequestType request = new GetTempSchema.GetTempRequestType();
        request.city = "uppsala";
        GetTemp get = new GetTemp();
        Utils.setTarget(get);
        get.callAsync(request, new HttpCall.AsyncCallback<GetTempSchema.GetTempResponseType>() {
            @Override
            public void onSuccess(GetTempSchema.GetTempResponseType response) {
                Toast.makeText(MainActivity.this, response.maxTemp.temp.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}