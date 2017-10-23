package com.example.harshavardhan.a2z;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {
    Button but1,but2,but3,but4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        but1=(Button)findViewById(R.id.but1);
        but2=(Button)findViewById(R.id.but2);
        but3=(Button)findViewById(R.id.but3);
        but4=(Button)findViewById(R.id.but4);
        final Intent i=new Intent(getApplicationContext(),common.class);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("select","1");
                startActivity(i);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("select","2");
                startActivity(i);

            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("select","3");
                startActivity(i);

            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("select","4");
                startActivity(i);

            }
        });

    }
}
