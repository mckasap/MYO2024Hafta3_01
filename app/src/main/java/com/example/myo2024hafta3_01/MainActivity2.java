package com.example.myo2024hafta3_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv=(TextView)findViewById(R.id.textView);
        Intent thisIntent= getIntent();

             String Str=  thisIntent.getExtras().getString("Hamsi");
            tv.setText(Str);
    }
}