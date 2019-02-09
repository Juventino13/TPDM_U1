package com.example.tpdm_u1_ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {
// Aqui van los globaleeeees
    EditText campotexti;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
 //Enlazando XML CON AQUI!
        btn=findViewById(R.id.boton);
        campotexti=findViewById(R.id.campotexto);
    }
}
