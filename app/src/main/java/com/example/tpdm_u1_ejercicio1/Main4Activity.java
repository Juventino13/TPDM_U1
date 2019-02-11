package com.example.tpdm_u1_ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.Toolbar;

public class Main4Activity extends AppCompatActivity {
// Aqui van los globaleeeees
    EditText campotexti;
    Button btn;
    ToggleButton btn2;
    CheckBox casi;
    Spinner edos;
    TextView etiqueta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //Enlazando XML CON AQUI!
        btn=findViewById(R.id.boton);
        campotexti=findViewById(R.id.campotexto);
        btn2=findViewById(R.id.boton2);
        casi=findViewById(R.id.casilla);
        edos=findViewById(R.id.estado);
        etiqueta=findViewById(R.id.etiqueta);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje ="Presionaste boton de estado " +btn2.isChecked()+"El campo de texto tiene "+campotexti.getText();
                Toast.makeText(Main4Activity.this, mensaje, Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void mensajeBoton(View v){
        etiqueta.setText("El estado seleccionado es: "+edos.getSelectedItem().toString());
    }
    public void nombecualqiera(View n ){
        String mensaje = "Presionaste casilla, su estado es "+casi.isChecked();
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
}
