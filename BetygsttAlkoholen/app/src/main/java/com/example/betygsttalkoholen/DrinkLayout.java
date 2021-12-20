package com.example.betygsttalkoholen;

import android.os.VibrationEffect;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DrinkLayout extends LinearLayout {
    TextView name;
    TextView rating;
    TextView alcohol;

    DrinkLayout(DrinkList context, String name, float alcohol, int rating) {
        super(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.drink_layout, this, true);
        this.rating = findViewById(R.id.rating);
        this.name = findViewById(R.id.name);
        this.alcohol = findViewById(R.id.alcohol);
        this.alcohol.setText(alcohol + "");
        this.rating.setText(rating + "");
        this.name.setText(name);
        DrinkLayout.this.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                context.removeDrink(name, DrinkLayout.this);
                return false;
            }
        });
    }

}