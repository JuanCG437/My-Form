package com.newproject.proyecto_ejemplo;

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

    EditText ingresarUsuario;
    TextView Usuario;
    Button Btn_hola, Btn_mundo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresarUsuario = (EditText) findViewById(R.id.ingresar_user);
        Usuario = (TextView) findViewById(R.id.usuario);
        Btn_hola = findViewById(R.id.btn_hola);
        Btn_mundo = findViewById(R.id.btn_mundo);

        Btn_hola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Usuario.setText("Presionaste el botón hola");
                ingresarUsuario.getText();
            }
        });

        Btn_mundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}