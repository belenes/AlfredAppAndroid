package com.example.alfred;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuprincipal);

        final Button btnconsumo = findViewById(R.id.btnconsumo);
        final Button btnmascotas = findViewById(R.id.btnmascotas);
        final Button btnambientes = findViewById(R.id.btnambientes);
        final Button btnvivienda = findViewById(R.id.btnvivienda);
        final Button btnhistorico = findViewById(R.id.btnhistorico);

        btnambientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MenuPrincipal.this, Ambientes.class);

                startActivity(i);
            }
        });
    }
}
