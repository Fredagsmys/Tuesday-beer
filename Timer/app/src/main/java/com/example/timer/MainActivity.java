package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    TextView timeTextView;
    float hourTextSize;
    float textSize;

    long time = 0;
    long startTime;
    Timer timer;
    MyTimer myTimer;

    SimpleDateFormat formatHour;
    SimpleDateFormat formatMinute;

    Button stop;
    Button start;
    Button varv;
    Button reset;
    Button resume;

    LinearLayout inactiveLayout;
    LinearLayout activeLayout;
    LinearLayout stoppedLayout;
    LinearLayout textLayout;
    List<TextView> varvList = new ArrayList<>();

    public static String spaces = "      ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        formatHour = new SimpleDateFormat("HH:mm:ss.SS", Locale.UK);
        formatMinute = new SimpleDateFormat("mm:ss.SS",Locale.UK);
        formatHour.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        formatMinute.setTimeZone(TimeZone.getTimeZone("GMT+0"));

        timeTextView = findViewById(R.id.timeTextView);
        timeTextView.setText(formatMinute.format(new Date(0)));

        textSize = 65;
        hourTextSize = 50;




        start = findViewById(R.id.startButton);
        stop = findViewById(R.id.stopButton);
        varv = findViewById(R.id.varvButton);
        reset = findViewById(R.id.resetButton);
        resume = findViewById(R.id.resumeButton);

        inactiveLayout = findViewById(R.id.inactiveLayout);
        activeLayout = findViewById(R.id.activeLayout);
        stoppedLayout = findViewById(R.id.stoppedLayout);
        textLayout = findViewById(R.id.textLayout);

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    myTimer.cancelTask();
                    Log.i(TAG, "Successfully canceled Task");
                }
                catch(Exception e){
                    Log.i(TAG, "Failed to cancel Task");
                }
                v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);

                arrangeStoppedScreen();

            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
                Log.i(TAG, "onCreate: "+ timeTextView.getTextSize());
                arrangeActiveScreen();
                startTimer(0);
                timeTextView.setTextSize(textSize);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);

                arrangeInactiveScreen();
                resetTimer();

                timeTextView.setText(formatMinute.format(new Date(0)));
                timeTextView.setTextSize(textSize);
            }
        });

        resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
                startTimer(time);

                arrangeActiveScreen();
            }
        });
//FIXA BÄSTA VARVTID BLIR RÖD FÄRG PÅ SKÄRMEN
        varv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);

                TextView view = new TextView(MainActivity.this);
                view.setTextSize(20);
                view.setVisibility(View.VISIBLE);
                view.setTextColor(Color.WHITE);
                view.setPadding(0,20,0,20);
                view.setTypeface(Typeface.MONOSPACE);
                view.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

                textLayout.addView(view,0);
                String number = String.valueOf(varvList.size()+1);
                if (time <= 3600*1000) {
                    view.setText("Varv " + number + spaces.substring(number.length()) + formatMinute.format(new Date(time)));
                }else{
                    view.setText("Varv " + number + spaces.substring(number.length()) + formatHour.format(new Date(time)));
                }
                varvList.add(view);
            }
        });
    }

    public void startTimer(long time){
        if (timer !=null){
            cancelTask();
        }
        startTime = System.currentTimeMillis();
        timer = new Timer();
        myTimer = new MyTimer(timer,time);
        timer.schedule(myTimer, 0, 10);
    }

    public void arrangeActiveScreen(){
        inactiveLayout.setVisibility(View.GONE);
        activeLayout.setVisibility(View.VISIBLE);
        stoppedLayout.setVisibility(View.GONE);
    }

    public void arrangeInactiveScreen(){
        inactiveLayout.setVisibility(View.VISIBLE);
        stoppedLayout.setVisibility(View.GONE);
        activeLayout.setVisibility(View.GONE);
    }

    public void arrangeStoppedScreen(){
        activeLayout.setVisibility(View.GONE);
        stoppedLayout.setVisibility(View.VISIBLE);
        inactiveLayout.setVisibility(View.GONE);
    }

    public void displayTime(long timeToDisp){
        time = timeToDisp;

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (timeToDisp <= 3600*1000){
                    setTime(timeToDisp,formatMinute);

                }else {
                    timeTextView.setTextSize(hourTextSize);
                    setTime(timeToDisp,formatHour);


                }
            }
        });
    }

    public void setTime(long time, SimpleDateFormat format){
        timeTextView.setText(format.format(new Date(time)));

    }
    public void cancelTask()
    {

        myTimer.cancelTask();
    }
    public void resetTimer(){
        cancelTask();
        for (View view : varvList){
            textLayout.removeView(view);
        }
        varvList.clear();
    }




public class MyTimer extends TimerTask{

        Timer timer;
        long time;

    public MyTimer(Timer timer,long time) {
        this.timer = timer;
        this.time = time;
    }

    public void toDo(){
        long dispTime =  System.currentTimeMillis()-startTime + time;
        displayTime(dispTime);
    }
    public void cancelTask(){
        timer.cancel();
    }
    @Override
    public void run() {
        toDo();
    }
}


}
