package com.example.odlingino;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DataLayout extends LinearLayout {
    TextView typeField;
    TextView valueField;
    TextView timeField;
    

    DataLayout(Context context){
        super(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.data_layout,this,true);

        typeField = findViewById(R.id.typeField);
        valueField = findViewById(R.id.valueField);
        timeField = findViewById(R.id.timeField);


    }

}