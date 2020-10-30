package com.example.sampleapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: HAVE A BUTTON. ON CLICK OF THE BUTTON A TIMER STARTS AND THAT TIMER IS SHOWN ON THE SCREEN.
        //TODO: IN BACKGROUND CALL uploadDataAndGenerate Function of ClassOne.
        //TODO: ONCE THE REPORT IS GENERATED STOP THE TIMER AND OPEN THAT REPORT.
    }
}