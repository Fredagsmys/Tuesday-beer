package com.example.idioten;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import java.util.List;

public class CardCouple extends LinearLayout {
LinearLayout board;
   CardCouple(List<Card> cardCouple, Context context){
       super(context);
       LayoutInflater inflater = LayoutInflater.from(context);
       inflater.inflate(R.layout.activity_card_couple,this,true);
       board = findViewById(R.id.board);
       for (Card card : cardCouple){
           card.setCouple(CardCouple.this);
           board.addView(card);
       }



   }
}