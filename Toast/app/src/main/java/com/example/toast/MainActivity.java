package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("ResourceAsColor")
    public void abrirToast(View view){

       //Forma mais personalizada

        ImageView imagem = new ImageView( getApplicationContext() );
        imagem.setImageResource( android.R.drawable.star_big_off );

        TextView textView = new TextView( getApplicationContext() );
        textView.setBackgroundResource(R.color.colorAccent);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setText("Olá sou um toast.");

        Toast toast = new Toast( getApplicationContext() );
        toast.setDuration( Toast.LENGTH_LONG );
        //toast.setView( imagem );
        toast.setView( textView );
        toast.show();


        /* Forma mais simples
        Toast.makeText( getApplicationContext(),
                "Ação realizada com sucesso.",
                Toast.LENGTH_SHORT
        ).show();
        */
    }

}
