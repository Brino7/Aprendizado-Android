package com.example.pedrapapeletesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selecionadoPapel(View view){

        this.opcaoSelecionada("papel");

    }

    public void selecionadoPedra(View view){

        this.opcaoSelecionada("pedra");

    }


    public void selecionadoTesoura(View view){

        this.opcaoSelecionada("tesoura");

    }

    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView imagemResultado = findViewById(R.id.imagemResultado);
        TextView textResultado = findViewById(R.id.txtResultado);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
        }

        System.out.println("item clicado: " + opcaoApp);

        if(opcaoSelecionada == opcaoApp){
            textResultado.setText("EMPATE");
        }else if ((opcaoSelecionada == "pedra")&&(opcaoApp == "tesoura")){
            textResultado.setText("VOCE GANHOU!");
        }else if((opcaoSelecionada == "pedra")&& (opcaoApp == "papel")){
            textResultado.setText("VOCE PERDEU!");
        }else if ((opcaoSelecionada == "papel")&&(opcaoApp == "pedra")){
            textResultado.setText("VOCE GANHOU!");
        }else if((opcaoSelecionada == "papel")&& (opcaoApp == "tesoura")){
            textResultado.setText("VOCE PERDEU!");
        }else if ((opcaoSelecionada == "tesoura")&&(opcaoApp == "papel")){
            textResultado.setText("VOCE GANHOU!");
        }else if((opcaoSelecionada == "tesoura")&& (opcaoApp == "pedra")){
            textResultado.setText("VOCE PERDEU!");
        }
    }

}
