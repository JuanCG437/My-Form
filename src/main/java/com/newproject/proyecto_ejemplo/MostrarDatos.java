package com.newproject.proyecto_ejemplo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MostrarDatos extends AppCompatActivity {

    TextView tvnombre, tvapellido, tvedad, tvcorreo;
    Button confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mostrar_datos);

        tvnombre = findViewById(R.id.tvNombre);
        tvapellido = findViewById(R.id.tvApellido);
        tvedad = findViewById(R.id.tvEdad);
        tvcorreo = findViewById(R.id.tvCorreo);
        confirmar = findViewById(R.id.btnConfirmar);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MostrarDatos.this, MainActivity.class);
                startActivity(intent);
            }
        });
        mostrarDatos();
    }

    private void mostrarDatos() {
        Bundle datos = this.getIntent().getExtras();

        String nombre = datos.getString("name");
        String apellido = datos.getString("surname");
        String edad = datos.getString("age");
        String correo = datos.getString("email");

        tvnombre.setText(nombre);
        tvapellido.setText(apellido);
        tvedad.setText(edad);
        tvcorreo.setText(correo);
    }
}