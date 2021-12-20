package com.example.betygsttalkoholen;

import android.content.Intent;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import wse.generated.GetMyDrinks;
import wse.generated.RemoveDrink;
import wse.generated.definitions.Drink_DBSchema;
import wse.generated.definitions.GetMyDrinksSchema;
import wse.generated.definitions.RemoveDrinkSchema;
import wse.utils.HttpCall;

public class DrinkList extends AppCompatActivity {
    LinearLayout drinkList;
    FloatingActionButton addDrinkButton;
    FloatingActionButton gotoFriends;
    String TAG = "DRINKLIST";
    ArrayList<DrinkLayout> drinkLayouts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private void loadDrinks() {
        GetMyDrinksSchema.GetMyDrinksRequest request = new GetMyDrinksSchema.GetMyDrinksRequest();
        request.sessionID = Session.getSessionID();
        GetMyDrinks get = new GetMyDrinks();
        Utils.setTarget(get);
        get.callAsync(request, new HttpCall.AsyncCallback<GetMyDrinksSchema.GetMyDrinksResponse>() {
            @Override
            public void onSuccess(GetMyDrinksSchema.GetMyDrinksResponse response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (response.status == 0) {
                            for (Drink_DBSchema.Drink drink : response.drinks) {
                                DrinkLayout drinkLayout = new DrinkLayout(DrinkList.this, drink.name, drink.alcohol, drink.rating);
                                drinkList.addView(drinkLayout);
                                drinkLayouts.add(drinkLayout);
                            }
                        }
                    }
                });
            }
        });
    }

    public void removeDrink(String name, DrinkLayout drinkLayout) {
        VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE); //NOT WORKING
        RemoveDrinkSchema.RemoveDrinkRequest request = new RemoveDrinkSchema.RemoveDrinkRequest();
        request.sessionID = Session.getSessionID();
        request.drinkName = name;
        RemoveDrink remove = new RemoveDrink();
        Utils.setTarget(remove);
        remove.callAsync(request, new HttpCall.AsyncCallback<RemoveDrinkSchema.RemoveDrinkResponse>() {
            @Override
            public void onSuccess(RemoveDrinkSchema.RemoveDrinkResponse response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (response.status == 0) {
                            Toast.makeText(DrinkList.this, "Drink removed", Toast.LENGTH_SHORT).show();
                            drinkList.removeView(drinkLayout);
                        }
                    }
                });
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_drink_list);
        ActionBar bar = this.getSupportActionBar();
        bar.setDisplayShowCustomEnabled(true);
        bar.setCustomView(R.layout.toolbar_layout);

        drinkList = findViewById(R.id.drinkList);
        gotoFriends = findViewById(R.id.gotoFriendsFAB);
        loadDrinks();


        addDrinkButton = findViewById(R.id.addDrinkFAB);
        addDrinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DrinkList.this, AddDrink.class);
                startActivity(i);
            }
        });
        gotoFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DrinkList.this, FriendsMenu.class);
                startActivity(i);
            }
        });
    }
}