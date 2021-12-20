package com.example.betygsttalkoholen;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import wse.generated.CreateDrink;
import wse.generated.definitions.CreateDrinkSchema;
import wse.generated.definitions.Drink_DBSchema;
import wse.utils.HttpCall;

public class AddDrink extends AppCompatActivity {
    FloatingActionButton saveFloatingButton;
    NumberPicker ratePicker;
    EditText nameView;
    EditText alcoholView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_drink);

        ActionBar bar = this.getSupportActionBar();
        bar.setDisplayShowCustomEnabled(true);
        bar.setCustomView(R.layout.toolbar_layout);

        saveFloatingButton = findViewById(R.id.saveFloatingButton);
        ratePicker = findViewById(R.id.ratePicker);
        nameView = findViewById(R.id.drinkName);
        alcoholView = findViewById(R.id.alcohol);

        ratePicker.setMinValue(1);
        ratePicker.setMaxValue(10);

        saveFloatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save and add drink to db

                CreateDrinkSchema.CreateDrinkRequest request = new CreateDrinkSchema.CreateDrinkRequest();
                Drink_DBSchema.Drink drink = new Drink_DBSchema.Drink();
                drink.name = Utils.stringFormatter(nameView.getText().toString());
                String alcohol = alcoholView.getText().toString();
                if (alcohol.length() < 1) {
                    drink.alcohol = 0f;
                } else {
                    drink.alcohol = Float.parseFloat(alcohol);
                }
                drink.rating = ratePicker.getValue();
                request.Drink = drink;
                request.sessionID = Session.getSessionID();

                CreateDrink create = new CreateDrink();
                Utils.setTarget(create);
                create.callAsync(request, new HttpCall.AsyncCallback<CreateDrinkSchema.CreateDrinkResponse>() {
                    @Override
                    public void onSuccess(CreateDrinkSchema.CreateDrinkResponse createDrinkResponse) {

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(AddDrink.this, "Drink added", Toast.LENGTH_SHORT).show();
                                finish();

                            }
                        });
                    }
                });
            }
        });
    }


}