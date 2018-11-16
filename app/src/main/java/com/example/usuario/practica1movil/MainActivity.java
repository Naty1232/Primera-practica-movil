package com.example.usuario.practica1movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonLogin, buttonRegistrar, buttonBuscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLogin = (Button) findViewById(R.id.Login);
        buttonRegistrar = (Button) findViewById(R.id.Guardar);
        buttonBuscar = (Button) findViewById(R.id.Buscar);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this, ActividadLogin.class);
                startActivity(intent);

            }
        });

        buttonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this,ActividadRegistrar.class);
                startActivity(intent);
            }
        });

        buttonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this,ActividadBuscar.class);
                startActivity(intent);
            }
        });


    }
}
