package com.example.tpdm_u1_ejercicio1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {
EditText usuario,contrasena;
String mensaje ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        usuario=findViewById(R.id.usu);
        contrasena=findViewById(R.id.contrasena);
    }
    public void validar (View galletas){
        mensaje="Usuario / Contraseña no valido";
        if(usuario.getText().toString().equals("Juan") && contrasena.getText().toString().equals("12345")){
           mensaje="EXITO!";

        }
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle("¡ATENCION!");
        alerta.setMessage(mensaje);
        alerta.setPositiveButton("Yeah", null);
        alerta.show();


    }
}
