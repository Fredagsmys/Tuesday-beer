package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Intent settingsIntet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settingsIntet = new Intent(MainActivity.this,SettingsActivity.class);
        settingsIntet.putExtra("settings", "Settings");






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.settingsItem:
                openSettings();
                return true;
            case R.id.helpItem:
                showHelp();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void openSettings(){
        Toast.makeText(this,"Settings", Toast.LENGTH_SHORT).show();
        startActivity(settingsIntet);

    }

    public void showHelp(){
        Toast.makeText(this,"Help", Toast.LENGTH_SHORT).show();
    }
}