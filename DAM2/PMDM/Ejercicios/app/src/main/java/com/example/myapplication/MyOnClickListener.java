package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyOnClickListener implements View.OnClickListener {

    private TextView texto;
    private Button boton;
    private int i = 0;
    private EditText textoEditable;

    public MyOnClickListener(TextView texto, EditText textoEditable) {
        this.texto = texto;
        this.textoEditable = textoEditable;
    }

    @Override
    public void onClick(View v) {
        //((Button)v.setText("Boton clicado"))

        //texto.setText(""+i);
        //i++;

        //((Button)v).setVisibility(View.INVISIBLE);

        boton = (Button)v;

        //boton.setVisibility(View.INVISIBLE);
        //texto.setVisibility(View.GONE);


        texto.setText(textoEditable.getText());
    }

}
