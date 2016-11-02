package com.mrubel.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyPageTwo extends AppCompatActivity {


    TextView tv, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page_two);


        tv = (TextView) findViewById(R.id.showing_techer_details);
        tv2 = (TextView) findViewById(R.id.listitem_count);

        // my data
        String[] details_of_teachers = {
                "KHM details: \n Studied at NSU, University of Manitoba",
                "SM Details:\n Studied at BUET, Chairman of CSE Dept.",
                "AR Details\n Studied at AIUB, MSc at NSU"};

        // recieving data
        int i = getIntent().getIntExtra("SEUCSE", 999);

        if(i == 0) {
            // showing data from array
            tv.setText(details_of_teachers[0]);
        } else if(i == 1){

            tv.setText(details_of_teachers[1]);
        } else if (i == 2){
            tv.setText(details_of_teachers[2]);
        }




        int rec_dat_2 = getIntent().getIntExtra("MySecondKyey", 97898);
        tv2.setText("You clicked on item: "+rec_dat_2);




    }
}
