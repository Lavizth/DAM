package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = findViewById(R.id.button3);
        TextView texto = findViewById(R.id.textView);
        EditText textoEditable = findViewById(R.id.editText);

        boton1.setText("Hola");

        boton1.setOnClickListener(new MyOnClickListener(texto, textoEditable));
    }
}