package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch switchSenha;
    private ToggleButton toggleSenha;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        textResultado = findViewById(R.id.textResultado);

        adicionarListener();

    }

        public void adicionarListener(){

            switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                    if ( isChecked ){

                        textResultado.setText(" Ligado ");

                    }else{

                        textResultado.setText(" Desligado ");

                    }

                }
            });

        }

        public void enviar(View view){

            if ( toggleSenha.isChecked() ){

                textResultado.setText(" Ligado ");

            }else {

                textResultado.setText(" Desligado ");

            }

        }

}