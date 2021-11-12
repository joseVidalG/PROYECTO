package com.example.peliflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void onClick(View view){

        Intent miIntent=null;

        switch (view.getId()){
            case R.id.bottomatras:
                miIntent=new Intent(MainActivity2.this,MainActivity.class);
                break;
            case R.id.bottomsiguiente:
                miIntent=new Intent(MainActivity2.this,MainActivity3.class);
                break;


            case R.id.pelicula2:
                miIntent=new Intent(MainActivity2.this, MainActivityP1.class);
                break;
            case R.id.imageView2:
                miIntent=new Intent(MainActivity2.this, MainActivityP1.class);
                break;
            case R.id.pelicula1:
                miIntent=new Intent(MainActivity2.this, MainActivityP2.class);
                break;
            case R.id.imageView:
                miIntent=new Intent(MainActivity2.this, MainActivityP2.class);
                break;

        }
        startActivity(miIntent);
    }


}