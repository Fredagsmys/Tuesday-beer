package com.example.dogevents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import wse.generated.CreateDogUser;
import wse.generated.GetDogAccounts;
import wse.generated.LoginDogAccount;
import wse.generated.definitions.CreateDogUserSchema;
import wse.generated.definitions.GetDogAccountsSchema;
import wse.generated.definitions.LoginDogAccountSchema;
import wse.utils.HttpCall;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    Button createButton;
    EditText usernameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar bar = this.getSupportActionBar();
        bar.setDisplayShowCustomEnabled(true);
        bar.setCustomView(R.layout.toolbar_layout);


        loginButton = findViewById(R.id.loginButton);
        usernameView = findViewById(R.id.usernameView);
        createButton = findViewById(R.id.createButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginDogAccountSchema.LoginDogAccountRequestType request = new LoginDogAccountSchema.LoginDogAccountRequestType();

                request.username = usernameView.getText().toString();

                LoginDogAccount account = new LoginDogAccount();
                Utils.setTarget(account);
                account.callAsync(request, new HttpCall.AsyncCallback<LoginDogAccountSchema.LoginDogAccountResponseType>() {
                    @Override
                    public void onSuccess(LoginDogAccountSchema.LoginDogAccountResponseType response) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (response.status == 0) {
                                    Session.setUsername(usernameView.getText().toString());
                                    loginSuccess();
                                } else {
                                    Toast.makeText(getApplicationContext(), "login lyckades!", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

                    }
                });

            }
        });
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateDogUserSchema.CreateDogUserRequestType request = new CreateDogUserSchema.CreateDogUserRequestType();
                request.username = usernameView.getText().toString();

                CreateDogUser create = new CreateDogUser();
                Utils.setTarget(create);
                create.callAsync(request, new HttpCall.AsyncCallback<CreateDogUserSchema.CreateDogUserResponseType>() {
                    @Override
                    public void onSuccess(CreateDogUserSchema.CreateDogUserResponseType response) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (response.status == 0) {
                                    Toast.makeText(MainActivity.this, "Konto skapat!", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

                    }
                });
            }
        });
    }

    public void loginSuccess() {

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
                        if (response.status == 0){
                            //lägg till så att man kan ha en lista med alla dogaccounts...
                            Intent i = new Intent(MainActivity.this, EventViewer.class);
                            if (response.dogAccounts.size() == 1){
                                i.putExtra("dogAccount", response.dogAccounts.get(0)); //öppna första kontot automatiskt
                                startActivity(i);
                            }
                            else {
                                Intent intent = new Intent(MainActivity.this, Homepage.class);
                                startActivity(intent);
                            }

                        }
                    }
                });
            }
        });


    }
}