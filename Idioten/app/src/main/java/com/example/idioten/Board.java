package com.example.idioten;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board extends AppCompatActivity {
    private List<Card> cardList;
    private LinearLayout playingBoard;
    private Random rand;
    private Button continueButton;
    private int[] fourRand;
    private String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        rand = new Random();
        playingBoard = findViewById(R.id.playingBoard);
        continueButton = findViewById(R.id.continueButton);
        cardList = new ArrayList<>();

        for (cardEnum card : cardEnum.values()) {
            for (colorEnum color : colorEnum.values()) {
                Card c = new Card(Board.this, color.toString(), card.toString());
                cardList.add(c);
            }
        }

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flop();
            }
        });
//        for (Card card : cardList) {
//
//            Log.i(TAG, "onCreate: " + card.value.getText().toString() + " " + card.color.getText().toString());
//        }
        flop();
    }

    public LinearLayout getBoard() {
        return this.playingBoard;
    }

    public void flop() {
        List<Card> flopList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int randInt = rand.nextInt(cardList.size());
            Card dispCard = cardList.get(randInt);
            flopList.add(dispCard);

            cardList.remove(randInt);
        }
        CardCouple cardCouple = new CardCouple(flopList,getApplicationContext());
        playingBoard.addView(cardCouple);
        //create a list of cards to send into cardCouple() constructor
    }
}