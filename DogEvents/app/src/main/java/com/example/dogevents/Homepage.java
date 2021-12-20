package com.example.dogevents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import wse.generated.CreateDogAccount;
import wse.generated.GetDogAccounts;
import wse.generated.definitions.CreateDogAccountSchema;
import wse.generated.definitions.GetDogAccountsSchema;
import wse.generated.definitions.Turbo_DBSchema;
import wse.utils.HttpCall;

public class Homepage extends AppCompatActivity {
    EditText dogAccountNameView;
    EditText user2;
    EditText user3;
    EditText user4;
    EditText user5;
    Button createDogAccountButton;
    List<String> usernameList = new LinkedList<>();
    LinearLayout myDogList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_layout);

        ActionBar bar = this.getSupportActionBar();
        bar.setDisplayShowCustomEnabled(true);
        bar.setCustomView(R.layout.toolbar_layout);


        myDogList = findViewById(R.id.myDogList);

        dogAccountNameView = findViewById(R.id.dogAccountNameView);
        createDogAccountButton = findViewById(R.id.createDogAccountButton);
        user2 = findViewById(R.id.user2);
        user3 = findViewById(R.id.user3);
        user4 = findViewById(R.id.user4);
        user5 = findViewById(R.id.user5);
        List<EditText> userList = new LinkedList<>();
        userList.addAll(Arrays.asList(user2, user3, user4, user5));

        createDogAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Turbo_DBSchema.DogAccount myDog = new Turbo_DBSchema.DogAccount();
                myDog.groupName = dogAccountNameView.getText().toString();

                for (EditText user : userList) { //filter the list
                    if (!user.getText().toString().equals("")) {
                        usernameList.add(user.getText().toString());
                    }
                }
                usernameList.add(Session.getUsername());
                myDog.users = usernameList;
                //mydog.events.add("created");
                CreateDogAccountSchema.CreateDogAccountRequestType request = new CreateDogAccountSchema.CreateDogAccountRequestType();
                request.dogAccount = myDog;
                CreateDogAccount create = new CreateDogAccount();
                Utils.setTarget(create);
                create.callAsync(request, new HttpCall.AsyncCallback<CreateDogAccountSchema.CreateDogAccountResponseType>() {
                    @Override
                    public void onSuccess(CreateDogAccountSchema.CreateDogAccountResponseType response) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (response.status == 0) {
                                    Toast.makeText(getApplicationContext(), "hundteam skapat", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

                    }
                });


            }
        });
        GetDogAccountsSchema.GetDogAccountsRequestType request = new GetDogAccountsSchema.GetDogAccountsRequestType();
        request.username = Session.getUsername();

        GetDogAccounts get = new GetDogAccounts();
        Utils.setTarget(get);
        get.callAsync(request, new HttpCall.AsyncCallback<GetDogAccountsSchema.GetDogAccountsResponseType>() {
            @Override
            public void onSuccess(GetDogAccountsSchema.GetDogAccountsResponseType response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (response.status == 0) {
                            //lägg till så att man kan ha en lista med alla dogaccounts...
                            Intent i = new Intent(Homepage.this, EventViewer.class);
                            if (response.dogAccounts.size() == 1) {
                                i.putExtra("dogAccount", response.dogAccounts.get(0)); //öppna första kontot automatiskt
                                startActivity(i);
                            } else {
                            }

                        }
                    }
                });
            }
        });

    }
    //fixa så att man kan skapa rum till exempel att jag kan skapa ett dogAccount med namn ozzy då kan jag bjuda in andra till det rummet. sedan ska man automatiskt skickas in i sitt dogaccount så fort man loggat in på sitt konto.
//    Man kommer ju aldrig ha fler en 1 hund men jag ska fixa så att det går att ha flera dogaccount att välja mellan i Homepage.java
}