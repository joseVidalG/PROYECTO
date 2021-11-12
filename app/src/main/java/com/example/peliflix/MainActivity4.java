package com.example.peliflix;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity4 extends AppCompatActivity {

    EditText iduser,nombreuser, emailuser, passworduser, phoneuser;
    Button bottoncrear;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
     /*
        iduser =(EditText) findViewById(R.id.iduser);
        nombreuser =(EditText) findViewById(R.id.nombreuser);
        emailuser =(EditText) findViewById(R.id.emailuser);
        passworduser =(EditText) findViewById(R.id.passworduser);
        phoneuser =(EditText) findViewById(R.id.phoneuser);
        bottoncrear =(Button) findViewById(R.id.bottomcrear);
        bottoncrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ejecutarServicio("http://192.168.1.79/web/save.php");
            }
        });*/

    } /* private void ejecutarServicio(String URL){
        StringRequest stringRequest= new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "OPERACION EXITOSA", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError{
                Map<String,String>parametros = new HashMap<String,String>();
                parametros.put("id",iduser.getText().toString());
                parametros.put("nombre",nombreuser.getText().toString());
                parametros.put("correo",emailuser.getText().toString());
                parametros.put("contraseña",passworduser.getText().toString());
                parametros.put("celular",phoneuser.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
*/
}