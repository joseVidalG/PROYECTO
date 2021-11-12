package com.example.peliflix;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.Editable;

import androidx.annotation.Nullable;

public class BaseDatos extends SQLiteOpenHelper {

    private static final String NOMBRE_BD="basedatos.db";
    private static final int VERSION_BD =1;
    private static final String TABLA_COMPRA ="CREATE TABLE PRECIO(CODIGO TEXT PRIMARY KEY, PRECIO FLOAT)";

    public BaseDatos(@Nullable Context context) {
        super(context, NOMBRE_BD, null  , VERSION_BD);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_COMPRA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLA_COMPRA);
        sqLiteDatabase.execSQL(TABLA_COMPRA);
    }

    public void  agregarCompra(String codigo, Editable precio){
      SQLiteDatabase bd=getWritableDatabase();
      if(bd!=null){
          bd.execSQL("INSERT INTO COMPRA VALUES('"+codigo+"','"+precio+"')");
          bd.close();
      }

    }


}
