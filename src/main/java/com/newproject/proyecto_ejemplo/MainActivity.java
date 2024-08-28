package com.newproject.proyecto_ejemplo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText nombre, apellidos, edad, correo;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre =  findViewById(R.id.editNombre);
        apellidos =  findViewById(R.id.editApellido);
        edad =  findViewById(R.id.editEdad);
        correo =  findViewById(R.id.editCorreo);
        aceptar =  findViewById(R.id.btnAceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = nombre.getText().toString();
                String surname = apellidos.getText().toString();
                String age = edad.getText().toString();
                String email = correo.getText().toString();

                Intent pasarDato = new Intent(MainActivity.this, MostrarDatos.class);

                pasarDato.putExtra("name", name);
                pasarDato.putExtra("surname", surname);
                pasarDato.putExtra("age", age);
                pasarDato.putExtra("email", email);


                startActivity(pasarDato);
            }
        });
    }

}