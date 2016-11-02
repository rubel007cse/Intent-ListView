package com.mrubel.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button _kmh, _sm, _ar;

    ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       _kmh = (Button) findViewById(R.id.kmh);
        _sm = (Button) findViewById(R.id.sm);
        _ar = (Button) findViewById(R.id.ar);


        _kmh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(getApplicationContext(), MyPageTwo.class);
                i1.putExtra("SEUCSE", 0);
                startActivity(i1);

            }
        });


        _sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(getApplicationContext(), MyPageTwo.class);
                i1.putExtra("SEUCSE", 1);
                startActivity(i1);
            }
        });


        _ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(getApplicationContext(), MyPageTwo.class);
                i1.putExtra("SEUCSE", 2);
                startActivity(i1);

            }
        });




        // starting work with listview
        ls = (ListView) findViewById(R.id.mylist);

        // my data
        String[] students = {"Rahim", "Karim", "Hafiz","Rahim", "Karim", "Hafiz","Rahim", "Karim", "Hafiz","Rahim", "Karim", "Hafiz"};


        // using adapater
        ArrayAdapter my_adapter = new ArrayAdapter(

                getApplicationContext(),
                R.layout.layoutforlistview,
                R.id.myitemtext,
                students
        );

        // shwoing data by using adapyer
        ls.setAdapter(my_adapter);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent j = new Intent(getApplicationContext(), MyPageTwo.class);
                j.putExtra("MySecondKyey", position);
                startActivity(j);

            }
        });

    }
}



