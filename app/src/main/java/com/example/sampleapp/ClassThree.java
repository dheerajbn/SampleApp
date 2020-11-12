package com.example.sampleapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Build;

import androidx.annotation.RequiresApi;

/**
 * Created by Dheeraj Beliya on 29-Oct-2020.
 */
public class ClassThree {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static void generatePdf(Context context) {

        // TODO: GENERATE A NICE A4 PDF OF 100 PAGES WITH ALL 4 IMAGES AND SOME TEXT THAT ARE PRESENT.
        // TODO: GOAL IS TO OPTIMIZE THIS FUNCTION SO THAT IN THE MAIN ACTIVITY THE TIMER IS RUNNING CONTINUOUSLY.

        for (int i = 0; i < 100; i++) {
            Bitmap p1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.p1);

            Bitmap p2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.p2);

            Bitmap p3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.p3);

            Bitmap p4 = ClassTwo.getBitmap("https://sfl-report-logos.s3.ap-south-1.amazonaws.com/p1.png");

            PdfDocument pdf = new PdfDocument();

            PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(595, 842, i).create();

            PdfDocument.Page page = pdf.startPage(pageInfo);
            Canvas canvas = page.getCanvas();

            canvas.save();

            canvas.rotate(90, canvas.getWidth() / 2, canvas.getHeight() / 2);

            Paint paint = new Paint();
            paint.setColor(Color.BLACK);
            paint.setTextSize(32);

            canvas.drawText("Name : ", 0, 700, paint);

            canvas.drawText("ID : ", 0, 750, paint);

            canvas.drawText("Age : " + " yrs", 0, 800, paint);

            canvas.drawText("DOB : ", 0, 850, paint);

            canvas.drawText("FATHER'S NAME : ", 40, 700, paint);

            canvas.drawText("HOBBIES : ", 50, 750, paint);

            canvas.drawText("Place : ", 50, 800, paint);

            canvas.drawText("Date : ", 50, 850, paint);

            canvas.drawBitmap(p1, 200, 100, null);
            canvas.drawBitmap(p2, 300, 200, null);
            canvas.drawBitmap(p3, 500, 400, null);
            canvas.drawBitmap(p4, 50, 800, null);

            canvas.restore();

            pdf.finishPage(page);
        }
    }
}
