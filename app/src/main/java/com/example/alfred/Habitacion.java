package com.example.alfred;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Habitacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.habitacion);

        final Button btniluminacion = findViewById(R.id.btniluminacion);
        final Button btnpuertas = findViewById(R.id.btnpuertas);
        final Button btntemperatura = findViewById(R.id.btntemperatura);
        final Button btnelectrodomesticos = findViewById(R.id.btnelectrodomesticos);
        final Button btnatras = findViewById(R.id.btnatras2);

        btniluminacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Habitacion.this, EncenderLuz.class);

                startActivity(i);

            }
        });

        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Habitacion.this, Ambientes.class);

                startActivity(i);

            }
        });



    }
}
