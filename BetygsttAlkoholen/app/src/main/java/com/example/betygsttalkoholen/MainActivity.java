package com.example.betygsttalkoholen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import wse.generated.CreateAccount;
import wse.generated.Login;
import wse.generated.definitions.CreateAccountSchema;
import wse.generated.definitions.LoginSchema;
import wse.utils.HttpCall;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    Button createAccountButton;
    TextView usernameView;
    TextView passwordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar bar = this.getSupportActionBar();
        bar.setDisplayShowCustomEnabled(true);
        bar.setCustomView(R.layout.toolbar_layout);
        loginButton = findViewById(R.id.loginButton);
        createAccountButton = findViewById(R.id.createAccountButton);
        usernameView = findViewById(R.id.loginUsername);
        passwordView = findViewById(R.id.loginPassword);
        autoLogin();
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginSchema.LoginRequest request = new LoginSchema.LoginRequest();
                String username = usernameView.getText().toString();
                request.username = username;
                request.password = passwordView.getText().toString();
                Login login = new Login();
                Utils.setTarget(login);
                login.callAsync(request, new HttpCall.AsyncCallback<LoginSchema.LoginResponse>() {
                            @Override
                            public void onSuccess(LoginSchema.LoginResponse response) {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (response.status == 0) {
                                            Session.setUsername(username);
                                            Session.setSessionID(response.sessionID);
                                            Intent i = new Intent(MainActivity.this, DrinkList.class);
                                            startActivity(i);
                                        }
                                    }
                                });
                            }
                        }
                );


            }
        });
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateAccountSchema.CreateAccountRequest request = new CreateAccountSchema.CreateAccountRequest();
                request.username = usernameView.getText().toString();
                request.password = passwordView.getText().toString();
                CreateAccount create = new CreateAccount();
                Utils.setTarget(create);
                create.callAsync(request, new HttpCall.AsyncCallback<CreateAccountSchema.CreateAccountResponse>() {
                    @Override
                    public void onSuccess(CreateAccountSchema.CreateAccountResponse response) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (response.status == 0) {
                                    Toast.makeText(MainActivity.this, "Kontot skapat", Toast.LENGTH_SHORT).show();
                                    //account could be created

                                } else {
                                    Toast.makeText(MainActivity.this, "Kontot kunde inte skapas", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                });
            }
        });
    }

    private void autoLogin() {
        LoginSchema.LoginRequest request = new LoginSchema.LoginRequest();
        request.username = "max";
        request.password = "123";
        Login login = new Login();
        Utils.setTarget(login);
        login.callAsync(request, new HttpCall.AsyncCallback<LoginSchema.LoginResponse>() {
                    @Override
                    public void onSuccess(LoginSchema.LoginResponse response) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (response.status == 0) {
                                    Session.setUsername("max");
                                    Session.setSessionID(response.sessionID);
                                    Intent i = new Intent(MainActivity.this, DrinkList.class);
                                    startActivity(i);
                                }
                            }
                        });
                    }
                }
        );

    }
}