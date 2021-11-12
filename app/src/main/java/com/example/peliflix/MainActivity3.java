package com.example.peliflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void onClick(View view){

        Intent miIntent=null;

        switch (view.getId()){
            case R.id.bottomregresar:
                miIntent=new Intent(MainActivity3.this,MainActivity2.class);
                break;
/*
            case R.id.bottomsiguiente:
                miIntent=new Intent(MainActivity3.this,MainActivity4.class);
                break;
*/
        }

        startActivity(miIntent);
    }



}