package com.example.calculadorasencilla;

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
        val btnsuma(findViewById(R.id.button_suma);


        btnsuma = findViewById(R.id.button_suma)
        btnresta = findViewById(R.id.button_resta)

        btnmultiplicacion = findViewById(R.id.button_multiplicacion)
        btndivicion = findViewById(R.id.button_divicion)


        text_respuesta = findViewById(R.id.respuesta);

        text_editnumero_uno = findViewById(R.id.n1);
        text_editnumero_dos = findViewById(R.id.n2);


    }

    public int suma(int a, int b) {

        return a+b;
    public int resta (int a, int b ){
        return a-b;
            public int multiplicacion (int a, int b ){
                return a*b;
                public int divicion (int a, int b ){
                    return a/b;



}