package com.example.harshavardhan.a2z;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class popup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        DisplayMetrics d=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(d);
        int width=(int)(0.8*d.widthPixels);
        int height=(int)(0.5*d.heightPixels);
        getWindow().setLayout(width,height);


    }
}
