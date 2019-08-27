package com.example.calcularmdia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNota1;
    private EditText editTextNota2;
    private EditText editTextNota3;
    private EditText editTextMedia;
    private EditText editTextMaior;
    private EditText editTextMenor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNota1 = findViewById(R.id.edit_text_nota1);
        editTextNota2 = findViewById(R.id.edit_text_nota2);
        editTextNota3 = findViewById(R.id.edit_text_nota3);
        editTextMedia = findViewById(R.id.edit_text_media);
        editTextMaior = findViewById(R.id.edit_text_maior);
        editTextMenor = findViewById(R.id.edit_text_menor);
    }

    public void calcularMedia(View v){

        Double nota1 = Double.parseDouble(editTextNota1.getText()
                .toString()
                .replace(",","."));
        Double nota2 = Double.parseDouble(editTextNota2.getText()
                .toString()
                .replace(",","."));
        Double nota3 = Double.parseDouble(editTextNota3.getText()
                .toString()
                .replace(",","."));
        Double calcular = (nota1+nota2+nota3)/3;
        editTextMedia.setText(calcular.toString());

        if (nota1>nota2 && nota1>nota3) {

            editTextMaior.setText(nota1.toString());

        }

        else if (nota2>nota1 && nota2>nota3) {

            editTextMaior.setText(nota2.toString());
        }

        else {

            editTextMaior.setText(nota3.toString());
        }

        if (nota1<nota2 && nota1<nota3) {

            editTextMenor.setText(nota1.toString());
        }

        else if (nota2<nota1 && nota2<nota3) {

            editTextMenor.setText(nota2.toString());
        }

        else {

            editTextMenor.setText(nota3.toString());
        }
    }
}
