package com.example.sampleapp;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void startTimer(View v) {

        //TODO: START A TIMER WITH MILLISECONDS PRECESSION AND DISPLAY IT ON TEXTVIEW.

        ClassThree.generatePdf(this);

        //TODO: ONCE THIS PDF IS GENERATED, STOP TIMER AND OPEN THE PDF.
    }
}