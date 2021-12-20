package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    ListView Listview;
    String[] items;
    String[] desc;
    String[] levels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        Listview = (ListView) findViewById(R.id.myListView);
        items = res.getStringArray(R.array.Tricks);
        levels = res.getStringArray(R.array.levels);
        desc = res.getStringArray(R.array.description);

        ItemAdapter itemAdapter = new ItemAdapter(this,items,levels,desc);
        Listview.setAdapter(itemAdapter);


    }
}