package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    EditText etEnviar,etenviar2;
    EditText alerta;
    Button btnEnviar;

    RadioButton terminosYcondiciones;




    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEnviar = findViewById(R.id.editTextText2);
        etenviar2 = findViewById(R.id.editTextTextPassword3);
        btnEnviar = findViewById(R.id.button2);
        terminosYcondiciones = findViewById(R.id.radioButton);





            btnEnviar.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Bundle enviardatos = new Bundle();
                    if (terminosYcondiciones.isChecked()==true){
                        enviardatos.putString("KeyNombre" , etEnviar.getText().toString());
                        enviardatos.putString("KeyContraseña" , etenviar2.getText().toString());
                        Intent intent = new Intent(MainActivity.this, Mostrar.class);
                        intent.putExtras(enviardatos);
                        startActivity(intent);
                    }else{
                        
                    }

                }
            });





    }


}