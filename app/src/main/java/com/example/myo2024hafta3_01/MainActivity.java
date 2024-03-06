package com.example.myo2024hafta3_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  public void  MyClick(View v){
      Intent myInt = new Intent(MainActivity.this, MainActivity2.class);
      String str= "TEST";
      myInt.putExtra("Hamsi",str);


      startActivity(myInt);

  }

}