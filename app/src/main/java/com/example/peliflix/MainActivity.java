package com.example.peliflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {








    ArrayList<Model> models = new ArrayList<>();

    int[] modeloimage = {R.drawable.pelicula1,
                         R.drawable.pelicula2,R.drawable.pelicula3,
                         R.drawable.pelicula4};

  //  private TextView textmensaje;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //conexion del rw
        RecyclerView recyclerView = findViewById(R.id.mRecyleView);

        PeliculaModelo();

        //crea adaptador
        Peli_Recycle adapter = new Peli_Recycle(this,models);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



      //  textmensaje = (TextView) findViewById(R.id.textmensaje);
        String dato = getIntent().getStringExtra("dato");
      //  textmensaje.setText("> " + dato);


    }

        private void PeliculaModelo() {
            String[] modelname = getResources().getStringArray(R.array.peli_list_full);
            String[] modeldescripcion = getResources().getStringArray(R.array.peli_list_name);
            String[] modelgenero = getResources().getStringArray(R.array.peli_list_name_letras);

            for (int i= 0; i < modelname.length; i++){
                 models.add(new Model (modelname[i],
                                       modeldescripcion[i],
                                       modelgenero[i],modeloimage[i]));



            }
        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity, menu);

        final MenuItem searchItem=menu.findItem(R.id.busca);
        final SearchView searchView= (SearchView) MenuItemCompat.getActionView(searchItem);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return true;
            }
        });

        return true;
    }




    @Override public boolean onOptionsItemSelected(MenuItem opcion_menu){
        int id=opcion_menu.getItemId();
        if(id==R.id.info){
            return true;
        }
        if(id==R.id.lista){
            Intent miIntent=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(miIntent);
            return true;
        }
        if(id==R.id.comenta) {
            Intent miIntent = new Intent(MainActivity.this, MainActivity4.class);
            startActivity(miIntent);
            return true;
        }



        if(id==R.id.salir){
            finishAffinity();
        }

        return super.onOptionsItemSelected(opcion_menu);
    }
    public void onClick(View view){

        Intent miIntent=null;

        switch (view.getId()){
            case R.id.imageView9_OFERTA:
                miIntent=new Intent(MainActivity.this,MainActivityP1.class);
                break;
        }
        startActivity(miIntent);
    }


}