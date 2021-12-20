package com.example.sqldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter customerArrayAdapter;
    DataBase dataBase;

    Button btn_add,btn_viewAll;
    EditText et_name,et_age;
    Switch sw_activeCustomer;
    ListView lv_customerList;
    int size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add = findViewById(R.id.btn_add);
        btn_viewAll = findViewById(R.id.btn_viewAll);
        et_name = findViewById(R.id.et_name);
        et_age = findViewById(R.id.et_age);
        sw_activeCustomer = findViewById(R.id.sw_active);
        lv_customerList =  findViewById(R.id.lv_customerlist);

        dataBase = new DataBase(MainActivity.this);
        updateList(dataBase);

        btn_add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                DataBase dataBase = new DataBase(MainActivity.this);
                CustomerModel customerModel;
                size = dataBase.getEveryone().size();
                try {
                    customerModel = new CustomerModel(size+1, et_name.getText().toString(), Integer.parseInt(et_age.getText().toString()), sw_activeCustomer.isChecked());
                    Toast.makeText(MainActivity.this, customerModel.simplePrint(), Toast.LENGTH_SHORT).show();
                    boolean success = dataBase.addOne(customerModel);
                    updateList(dataBase);
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "Error Creating Customer!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataBase dataBase = new DataBase(MainActivity.this);
                List<CustomerModel> everyone = dataBase.getEveryone();

                updateList(dataBase);

            }
        });
    lv:lv_customerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            CustomerModel clickedCustomer = (CustomerModel) parent.getItemAtPosition(position);
            dataBase.deleteOne(clickedCustomer);
            updateList(dataBase);
            Toast.makeText(MainActivity.this,"Deleted: " + clickedCustomer.simplePrint(),Toast.LENGTH_SHORT).show();

        }
    });

    }

    private void updateList(DataBase db) {
        customerArrayAdapter = new ArrayAdapter<CustomerModel>(MainActivity.this, android.R.layout.simple_list_item_1, db.getEveryone());
        lv_customerList.setAdapter(customerArrayAdapter);
    }
}