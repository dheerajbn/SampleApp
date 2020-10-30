package com.example.sampleapp;

import android.content.Context;
import android.os.Build;

import androidx.annotation.RequiresApi;

/**
 * Created by Dheeraj Beliya on 29-Oct-2020.
 */
public class ClassOne {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void uploadDataAndGenerate(Context context) {

        // TODO: UPLOAD SOME RANDOM DATA TO CLOUD DATABASE OF YOUR CHOICE. RUN THAT AND BITMAP GENERATION CODE PARALLEL

        ClassThree.generateBitmap(context);
    }
}
