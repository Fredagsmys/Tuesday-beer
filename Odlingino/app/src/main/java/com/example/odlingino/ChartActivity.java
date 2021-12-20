package com.example.odlingino;

import android.content.res.Resources;
import android.graphics.DashPathEffect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.nambimobile.widgets.efab.FabOption;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import wse.generated.GetSensorData;
import wse.generated.SendWaterCommand;
import wse.generated.definitions.GetSensorDataSchema;
import wse.generated.definitions.SendWaterCommandSchema;
import wse.utils.HttpCall;

public class ChartActivity extends AppCompatActivity {
    LineChart chart;
    MaterialSpinner daySpinner;
    MaterialSpinner IDSpinner;
    List<GetSensorDataSchema.Data> DBdataList = new ArrayList<>();
    List<GetSensorDataSchema.Data> currentDataList = new ArrayList<>();
    String TAG = "TAG";
    Resources res;
    FabOption refreshButton;
    FabOption waterButton;
    String selDate;
    int selID = 1;

    HashMap<String, Integer> sensorMap = new HashMap<>();
    List<String> sensorList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

        Date date = new Date();
        selDate = formatter.format(date);

        sensorList = new ArrayList<>(Arrays.asList("Ljus 1", "Temp 1", "Fukt 1", "Temp 2", "Fukt 2", "Fukt allt"));
        sensorMap.put(sensorList.get(0), 1);
        sensorMap.put(sensorList.get(1), 2);
        sensorMap.put(sensorList.get(2), 3);
        sensorMap.put(sensorList.get(3), 4);
        sensorMap.put(sensorList.get(4), 5);

        res = getResources();

        chart = findViewById(R.id.chart);
        daySpinner = findViewById(R.id.daySpinner);
        IDSpinner = findViewById(R.id.IDSpinner);
        refreshButton = findViewById(R.id.refreshFAB);
        waterButton = findViewById(R.id.waterFAB);

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadData();
            }
        });
        waterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendWaterCommandSchema.SendWaterCommandRequestType request = new SendWaterCommandSchema.SendWaterCommandRequestType();
                SendWaterCommand send = new SendWaterCommand();
                Utils.setTarget(send);
                send.callAsync(request, new HttpCall.AsyncCallback<SendWaterCommandSchema.SendWaterCommandResponseType>() {
                    @Override
                    public void onSuccess(SendWaterCommandSchema.SendWaterCommandResponseType response) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (response.status == 0) {
                                    Toast.makeText(ChartActivity.this, "Garden Watered", Toast.LENGTH_SHORT).show();
                                }
                                else{
                                    Toast.makeText(ChartActivity.this, "Watering Failed", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                });

            }
        });


//==========================Set dates to spinner==========================

        Date endDate = new Date(System.currentTimeMillis() + 24 * 3600 * 1000L);
        Date anotherDate = new Date(endDate.getTime() - 5*61 * 24 * 60 * 60 * 1000L); //
        List<Date> listOfDates = Utils.getDaysBetweenDates(anotherDate, endDate);
        Collections.reverse(listOfDates);


        List<String> displayDates = new ArrayList<>();
        for (Date formatDate : listOfDates) { //formatDate:
            String displayDate = formatter.format(formatDate); //yyyy-MM-dd
            displayDates.add(displayDate);

        }


        daySpinner.setItems(displayDates);
        daySpinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                selDate = item;
                loadData();

            }
        });


        //====================================================

        //==========================Set IDs to spinner==========================
//        GetSensorIDsSchema.GetSensorIDsRequestType requestType = new GetSensorIDsSchema.GetSensorIDsRequestType();
//        GetSensorIDs getID = new GetSensorIDs();
//        Utils.setTarget(getID);
//        getID.callAsync(requestType, new HttpCall.AsyncCallback<GetSensorIDsSchema.GetSensorIDsResponseType>() {
//            @Override
//            public void onSuccess(GetSensorIDsSchema.GetSensorIDsResponseType response) {
//                IDSpinner.setItems(response.IDs);
//                IDSpinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<Integer>() {
//                    @Override
//                    public void onItemSelected(MaterialSpinner view, int position, long id, Integer item) {
//                        selID = item;
//
//                    }
//                });
//            }
//        });
        IDSpinner.setItems(sensorList);
        IDSpinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {

                selID = sensorMap.get(item);
                loadData();

            }
        });


        //====================================================


        loadData();
    }


    public void loadData() {
        GetSensorDataSchema.GetSensorDataRequestType request = new GetSensorDataSchema.GetSensorDataRequestType();
        request.sensorID = selID;
        request.date = selDate;
        GetSensorData get = new GetSensorData();
        Utils.setTarget(get);
        get.callAsync(request, new HttpCall.AsyncCallback<GetSensorDataSchema.GetSensorDataResponseType>() {
            @Override
            public void onSuccess(GetSensorDataSchema.GetSensorDataResponseType response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        currentDataList = response.data;
                        plotData(); //bara chart.invalidate?? nya entries då?
                    }
                });
            }
        });
    }

    public Chart plotData() {
        List<Entry> entries = new ArrayList<Entry>();

        for (GetSensorDataSchema.Data data : currentDataList) {
            entries.add(new Entry(Utils.DateFormat.of(data.timeStamp).millisOfDay(), data.value.floatValue()));
            //date format from sql: 2021-06-06 22:00:00

        }
        LineDataSet dataSet = new LineDataSet(entries, null); // add entries to dataset

        Description description = chart.getDescription();
        description.setEnabled(false);

//        dataSet.setDrawHighlightIndicators(false);
        chart.setGridBackgroundColor(res.getColor(R.color.darkgray));


        Legend l = chart.getLegend();
        l.setEnabled(false);

        initSet(dataSet, res.getColor(R.color.lineColor), LineDataSet.Mode.CUBIC_BEZIER);

        LineData lineData = new LineData(dataSet);

        chart.setData(lineData);


        chart.setHighlightPerDragEnabled(false);
        chart.setHighlightPerTapEnabled(false);

        //=============Axis=============
        XAxis xAxis = chart.getXAxis();
        YAxis leftAxis = chart.getAxisLeft();
        YAxis rightAxis = chart.getAxisRight();

        initAxis(xAxis, rightAxis, leftAxis, res.getColor(R.color.white));

        //==========================

        chart.animateX(2000, Easing.EaseOutBack);

        chart.invalidate(); // refresh
        return chart;
    }

    //antar att date är på formen
    private List<GetSensorDataSchema.Data> getValuesFromDate(String reqDate) {//DENNA FUNKAR. ger lista av data om man skickar in datum på formen
        List<GetSensorDataSchema.Data> returnList = new ArrayList<>();
        for (GetSensorDataSchema.Data data : DBdataList) {//problem att data.timestamp ges med 2 timmar fel

            String dateOnly = Utils.getDateOnly(data.timeStamp); //denna får formen yyyy-mm-dd
            if (dateOnly.contains(reqDate)) {
                returnList.add(data);
            }
        }
        return returnList;
    }

    public void initAxis(XAxis xAxis, YAxis rightAxis, YAxis leftAxis, int color) {

        ValueFormatter valueFormatter = new ValueFormatter() {
            @Override
            public String getFormattedValue(float value) {
//                value/=1000*60;
                int hour = ((int) value / 1000 / 60 / 60) % 24;
                int min = ((int) value / 1000 / 60) % 60;
                if (hour == 0) return "";
                return String.format("%02d:%02d", hour, min);
            }
        };

        xAxis.setValueFormatter(valueFormatter);
        xAxis.setAxisMinimum(0);
        xAxis.setAxisMaximum(24 * 60 * 60 * 1000);
        xAxis.setLabelCount(9, true);
        xAxis.setTextColor(color);
        xAxis.enableGridDashedLine(10f, 10f, 0f);
        xAxis.setDrawAxisLine(false);
        //=============YAxis=============

        leftAxis.setDrawAxisLine(false);
        rightAxis.setDrawAxisLine(false);

        rightAxis.setLabelCount(9, true);
        leftAxis.setLabelCount(9, true);

        leftAxis.setAxisMinimum(0);
        rightAxis.setAxisMinimum(0);

        leftAxis.setTextColor(color);
        rightAxis.setTextColor(color);

        rightAxis.enableGridDashedLine(10f, 10f, 0f);
        leftAxis.enableGridDashedLine(10f, 10f, 0f);

    }


    public void initSet(LineDataSet set, int color, LineDataSet.Mode mode) {

        set.setDrawIcons(false);
        set.setColor(color); // Color.rgb(30, 200, 100)
        set.setLineWidth(3f);
        set.setDrawCircles(false);

        set.setDrawValues(false);

        set.setFormLineWidth(1f);
        set.setFormLineDashEffect(new DashPathEffect(new float[]{10f, 5f}, 0f));
        set.setFormSize(15f);

        set.setValueTextSize(9f);
        set.enableDashedHighlightLine(10f, 5f, 0f);
        set.setDrawFilled(false);

        set.setMode(mode); // LineDataSet.Mode.CUBIC_BEZIER
    }
}
