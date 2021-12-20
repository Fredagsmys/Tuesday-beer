package com.example.composemessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ComposeMessageActivity extends AppCompatActivity {


    Button sendbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_message);
        setTitle("Send E-mail");

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        TextView textView = (TextView)findViewById(R.id.nameBar);

        if (name == null){
            textView.setVisibility(View.INVISIBLE);
            findViewById(R.id.et_email).setVisibility(View.VISIBLE);

        }else{

            textView.setText(name);
        }




    }
    public void sendMessage(View v){
        sendbtn = findViewById(R.id.sendbutton);
        Toast.makeText(ComposeMessageActivity.this,"Message sent",Toast.LENGTH_SHORT).show();

    }
}