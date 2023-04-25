package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Mostrar extends AppCompatActivity {

    TextView verNombre;
    TextView verContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        verNombre = findViewById(R.id.textView);
        verContraseña = findViewById(R.id.textView2);
        Bundle recivedatos = getIntent().getExtras();
        String mostrar1 = recivedatos.getString("KeyNombre");
        String mostrar2 = recivedatos.getString("KeyContraseña");

        verNombre.setText(mostrar1);
        verContraseña.setText(mostrar2);
    }
}