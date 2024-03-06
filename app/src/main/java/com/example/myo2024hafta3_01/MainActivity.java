package com.example.myo2024hafta3_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et =(EditText) findViewById(R.id.editTextText);

    }

  public void  MyClick(View v){
        DataHolder dh= new DataHolder("İstanbul","Ticaret Ünivesitesi","https//www.ticaret.edu.tr");
      Intent myInt = new Intent(MainActivity.this, MainActivity2.class);
      String str= et.getText().toString();

      myInt.putExtra("MyData",dh);
      myInt.putExtra("Hamsi",str);


      startActivity(myInt);

  }

}