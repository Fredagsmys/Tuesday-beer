package com.example.composemessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("List of customers");
    }


    public void composeMessage(View v){
        Intent intent = new Intent(this,ComposeMessageActivity.class);
        String name = ((Button)v).getText().toString();
        if (!(name.equals("New Message"))){
            intent.putExtra("NAME",name);
        }
        startActivity(intent);

    }
}