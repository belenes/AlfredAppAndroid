package com.example.alfred;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        final Button btnIngresar = findViewById(R.id.btnIngresar);
        final EditText usuario = findViewById(R.id.usuario);
        final EditText password = findViewById(R.id.password);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login.this, MenuPrincipal.class);

                Toast notificacion = Toast.makeText(getApplicationContext(), "Bienvenido a Alfred" , Toast.LENGTH_LONG);
                notificacion.show();

                startActivity(i);
            }
        });
    }
}
