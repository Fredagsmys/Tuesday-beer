package com.example.dogevents;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import wse.generated.GetDogEvents;
import wse.generated.SaveDogEvent;
import wse.generated.definitions.GetDogEventsSchema;
import wse.generated.definitions.SaveDogEventSchema;
import wse.generated.definitions.Turbo_DBSchema;
import wse.utils.HttpCall;

public class EventViewer extends AppCompatActivity {
    LinearLayout parentLayout;
    ScrollView parentScroll;
    Button poopButton;
    Button peeButton;
    TextView lastPee;
    TextView lastPoop;
    ArrayList<Long> peeList = new ArrayList<>();
    ArrayList<Long> poopList = new ArrayList<>();
    String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_viewer);


        ActionBar bar = this.getSupportActionBar();
        bar.setDisplayShowCustomEnabled(true);
        bar.setCustomView(R.layout.toolbar_layout);


        parentLayout = findViewById(R.id.parentLayout);
        poopButton = findViewById(R.id.poopButton);
        peeButton = findViewById(R.id.peeButton);
        parentScroll = findViewById(R.id.parentScroll);
        lastPee = findViewById(R.id.lastPee);
        lastPoop = findViewById(R.id.lastPoop);

        Intent i = getIntent();
        Bundle extras = i.getExtras(); //hämta dogaccount


        //kunna ta bort event genom att hålla in på det med onlongClickListener()
        GetDogEventsSchema.GetDogEventsRequestType request = new GetDogEventsSchema.GetDogEventsRequestType();

        request.dogAccount = (Turbo_DBSchema.DogAccount) extras.get("dogAccount");


        GetDogEvents get = new GetDogEvents();
        Utils.setTarget(get);
        get.callAsync(request, new HttpCall.AsyncCallback<GetDogEventsSchema.GetDogEventsResponseType>() {
            @Override
            public void onSuccess(GetDogEventsSchema.GetDogEventsResponseType response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (response.status == 0) {
                            for (Turbo_DBSchema.DogEvent dogEvent : response.events) {
                                EventLayout eventLayout = new EventLayout(getApplicationContext(), dogEvent);
                                parentLayout.addView(eventLayout);


                                if (dogEvent.event.equals("Skit")) {
                                    poopList.add(dogEvent.time);
                                } else {
                                    peeList.add(dogEvent.time);

                                }
                            }

                            if (peeList.size() > 0 && poopList.size() > 0) {
                                long lastPeeDiff = System.currentTimeMillis() - peeList.get(peeList.size() - 1);
                                long lastPoopDiff = System.currentTimeMillis() - poopList.get(poopList.size() - 1);
                                //display the time nicely
                                SimpleDateFormat formatter = new SimpleDateFormat("HH'h' mm'm' ss's'", Locale.US);
                                SimpleDateFormat formatterShort = new SimpleDateFormat("mm'm' ss's'", Locale.US);
                                formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
                                Date pee = new Date(lastPeeDiff);
                                Date poop = new Date(lastPoopDiff);
                                String peetime = "";
                                String pooptime = "";
                                if (pee.getTime() <1000*3600){
                                    pooptime = formatterShort.format(poop);
                                    peetime = formatterShort.format(pee);
                                }else{
                                    pooptime = formatter.format(poop);
                                    peetime = formatter.format(pee);
                                }

                                lastPee.setText(peetime);
                                lastPoop.setText(pooptime);
                            }

                            new CountDownTimer(100, 1000) {//vänta lite innan den scrollar ner

                                @Override
                                public void onTick(long millisUntilFinished) {

                                }

                                @Override
                                public void onFinish() {
                                    parentScroll.fullScroll(View.FOCUS_DOWN);
                                }
                            }.start();
                        }
                    }
                });
            }
        });
        peeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveEvent("Kiss");


            }
        });

        poopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveEvent("Skit");

            }
        });
    }

    private void saveEvent(String event) {
        SaveDogEventSchema.SaveDogEventRequestType request = new SaveDogEventSchema.SaveDogEventRequestType();
        request.event = event;
//        SimpleDateFormat formatter = new SimpleDateFormat("EEE HH:mm", Locale.US);
//        Date date = new Date();
//        String time = formatter.format(date);
        long time = System.currentTimeMillis();
        String username = Session.getUsername();
        request.time = time;
        request.username = username;
        SaveDogEvent save = new SaveDogEvent();
        Utils.setTarget(save);
        save.callAsync(request, new HttpCall.AsyncCallback<SaveDogEventSchema.SaveDogEventResponseType>() {
            @Override
            public void onSuccess(SaveDogEventSchema.SaveDogEventResponseType response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (response.status == 0) {
                            Toast.makeText(getApplicationContext(), "event sparat", Toast.LENGTH_SHORT).show();
                            Turbo_DBSchema.DogEvent dogEvent = new Turbo_DBSchema.DogEvent();

                            dogEvent.event = event;
                            dogEvent.eventSetter = username;

                            dogEvent.time = time;

                            EventLayout eventLayout = new EventLayout(getApplicationContext(), dogEvent);
                            parentLayout.addView(eventLayout);
                            new CountDownTimer(50, 1000) {

                                @Override
                                public void onTick(long millisUntilFinished) {

                                }

                                @Override
                                public void onFinish() {

                                    parentScroll.fullScroll(View.FOCUS_DOWN);
                                    new CountDownTimer(400, 1000) {

                                        @Override
                                        public void onTick(long millisUntilFinished) {

                                        }

                                        @Override
                                        public void onFinish() {
                                            Animation shake = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                                            eventLayout.startAnimation(shake);
                                        }
                                    }.start();

                                }
                            }.start();
                        }

                    }
                });


            }
        });
    }
}


