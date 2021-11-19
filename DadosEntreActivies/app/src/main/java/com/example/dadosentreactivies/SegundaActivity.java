package com.example.dadosentreactivies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome, textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        //Recuperar dados

        Bundle dados = getIntent().getExtras();
        String nome = dados.getString( "nome" );
        int idade = dados.getInt("idade");

        //Configurando valores recuperados

        textNome.setText(nome);
        textIdade.setText(String.valueOf(idade));

    }
}