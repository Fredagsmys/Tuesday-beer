package com.example.draganddrop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class DropTarget extends LinearLayout {
LinearLayout dropTarget;


        public DropTarget(MainActivity context){
            super(context);
            LayoutInflater inflater = LayoutInflater.from(context);
            inflater.inflate(R.layout.activity_drop_target, this, true);

            dropTarget = findViewById(R.id.dropLayout);


    }
}