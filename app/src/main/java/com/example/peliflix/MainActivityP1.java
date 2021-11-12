package com.example.peliflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivityP1 extends AppCompatActivity {


    EditText edtCodigo,editPrecio;
    Button btncomprar;




    // private TextView textmensaje;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p1);

        editPrecio= (EditText) findViewById(R.id.text_precio);
        btncomprar=(Button) findViewById(R.id.button_compra);

        final BaseDatos baseDatos = new BaseDatos(getApplicationContext());

        btncomprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseDatos.agregarCompra(editPrecio.getText().toString(),editPrecio.getText());
                Toast.makeText(getApplicationContext(),"SE AGREGO CORRECTAMENTE", Toast.LENGTH_SHORT).show();

            }
        });

    }


}