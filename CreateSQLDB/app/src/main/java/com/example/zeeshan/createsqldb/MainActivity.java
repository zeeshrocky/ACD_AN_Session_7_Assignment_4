package com.example.zeeshan.createsqldb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Sql_data sql_database;
    TextView textView;
    Sql_data db= new Sql_data(MainActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.display_textview);
        db.deleteAllItems();
        sql_database = new Sql_data(this);

        sql_database.insertName("Zeeshan","Abid");
        sql_database.insertName("Arman","Malik");
        sql_database.insertName("Arijit","Singh");
        sql_database.insertName("Udit","Narayan");
        sql_database.insertName("Shivani","Ghamire");
        sql_database.insertName("Anjali","Khokar");

        sql_database.getName(textView);
    }
}