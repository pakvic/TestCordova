package com.salesforce.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import org.apache.cordova.CordovaActivity;

public class Screen_Activity extends CordovaActivity {

    private int time_max;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_);
        time_max = 5000;
        MyTimer timer = new MyTimer(time_max, 1);
        timer.start();



    } class MyTimer extends CountDownTimer
    {
        public MyTimer(long millisInFuture, long countDownInterval)
        {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish()
        {
            Intent intent = new Intent(Screen_Activity.this, MainActivity.class);
            startActivity(intent);
        }

        public void onTick(long millisUntilFinished)
        {

        }

    }
}