package com.example.idioten;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class Card extends LinearLayout {

    TextView value;
    TextView color;
    CardCouple cardCouple;

    public Card(Board board, String col, String val) {
        super(board.getApplicationContext());

        LayoutInflater inflater = LayoutInflater.from(board.getApplicationContext());
        inflater.inflate(R.layout.activity_card,this,true);
        value = findViewById(R.id.valueView);
        color = findViewById(R.id.colorView);
        color.setText(col);
        value.setText(val);
        switch (col.toLowerCase()){
            case "diamonds":
                this.setBackgroundColor(getResources().getColor(R.color.darkRed));
                break;

            case "spades":
                this.setBackgroundColor(getResources().getColor(R.color.red));
                break;

            case "clubs":
                this.setBackgroundColor(getResources().getColor(R.color.darkgray));
                break;
            case "hearts":
                this.setBackgroundColor(getResources().getColor(R.color.black));
                break;
            default:
                this.setBackgroundColor(getResources().getColor(R.color.darkYellow));
        }
        Card.this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//                cardCouple.board.removeView(v);
                v.setVisibility(View.INVISIBLE);

            }
        });
    }
    public void setCouple(CardCouple couple){
        this.cardCouple = couple;
    }

}