package com.example.dogevents;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import wse.generated.definitions.Turbo_DBSchema;

public class EventLayout extends LinearLayout {
TextView eventSetterView;
TextView timeView;
TextView eventView;

    public EventLayout(Context context, Turbo_DBSchema.DogEvent dogEvent) {
        super(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.event_layout, this, true);



        eventSetterView = findViewById(R.id.eventSetter);
        eventView = findViewById(R.id.event);
        timeView = findViewById(R.id.time);

        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.US);
        dateFormatSymbols.setWeekdays(new String[]{
                "Unused",
                "Söndag",
                "Måndag",
                "Tisdag",
                "Onsdag",
                "Torsdag",
                "Fredag",
                "Lördag",
        });
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE HH:mm", dateFormatSymbols);
        Date date = new Date(dogEvent.time);
        String showTime = formatter.format(date);

        setViewTexts(dogEvent.event, dogEvent.eventSetter,showTime);
        this.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {


                return false;
            }
        });
    }

    private void setViewTexts(String eventName, String eventSetter, String time){

        eventView.setText(eventName);
        eventSetterView.setText(eventSetter);
        timeView.setText(time);
        if (eventName.equals("Skit")){
            eventView.setTextColor(getResources().getColor(R.color.poopColor));
        }else{
            eventView.setTextColor(getResources().getColor(R.color.peeColor));
        }
    }
}