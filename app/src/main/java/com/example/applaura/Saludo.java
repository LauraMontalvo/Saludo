package com.example.applaura;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Saludo extends AppCompatActivity {

    public TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_saludo);
        mensaje= findViewById(R.id.txtMensaje);

    }
    public void Saludar (View v){   mensaje.setText("hola xd"); }
}

