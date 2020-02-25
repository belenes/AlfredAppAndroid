package com.example.alfred;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Ambientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ambientes);

        final Button btnhabitacion = findViewById(R.id.btnhabitacion);
        final Button btnbanio = findViewById(R.id.btnbanio);
        final Button btnliving = findViewById(R.id.btnliving);
        final Button btnpatio = findViewById(R.id.btnpatio);
        final Button btncocina = findViewById(R.id.btncocina);
        final Button btnatras = findViewById(R.id.btnatras1);

        btnhabitacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Ambientes.this, Habitacion.class);

                startActivity(i);
            }
        });

        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ambientes.this, MenuPrincipal.class);

                startActivity(i);

            }
        });
    }
}

