package com.example.ngchunhon.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        Date currentTime = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



        TextView textDateNow = (TextView) findViewById(R.id.dateNow);
        String strCurrentTime = dateFormat.format(currentTime);
        textDateNow.setText(strCurrentTime);

        TextView textHourNow = (TextView) findViewById(R.id.hourNow);
        String strCurrentHour = strCurrentTime.substring(11,13);
        textHourNow.setText(strCurrentHour);



        Date currentTimeMinus1 = new Date(currentTime.getTime() - 1*1000*60*60);
        TextView textDateNowMinus1 = (TextView) findViewById(R.id.dateNowMinus1);
        String strCurrentTimeMinus1 = dateFormat.format(currentTimeMinus1);
        textDateNowMinus1.setText(strCurrentTimeMinus1);

        TextView textHourNowMinus1 = (TextView) findViewById(R.id.hourNowMinus1);
        String strHourNowMinus1 = strCurrentTimeMinus1.substring(11,13);
        textHourNowMinus1.setText(strHourNowMinus1);



        //currentTime.get
        //before 7


        //after 7



    }
}
