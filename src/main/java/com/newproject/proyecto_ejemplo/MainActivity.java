package com.newproject.proyecto_ejemplo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.newproject.proyecto_ejemplo.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    EditText nombre, apellidos, edad, correo;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.editNombre);
        apellidos = (EditText) findViewById(R.id.editApellido);
        edad = (EditText) findViewById(R.id.editEdad);
        correo = (EditText) findViewById(R.id.editCorreo);
        aceptar = (Button) findViewById(R.id.btnAceptar);

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