package com.example.harshavardhan.a2z;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main3Activity extends AppCompatActivity {
    Button butto1,butto2;
    Intent ui=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        butto1=(Button)findViewById(R.id.butto1);
        butto2=(Button)findViewById(R.id.butto2);
        butto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ui=new Intent(getApplicationContext(),SendTo.class);
                startActivity(ui);

            }
        });
        butto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ui=new Intent(getApplicationContext(),balancedisplay.class);
                startActivity(ui);
            }
        });



    }
}
