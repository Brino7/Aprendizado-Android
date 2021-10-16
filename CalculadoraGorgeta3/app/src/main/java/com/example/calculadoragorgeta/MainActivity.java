package com.example.calculadoragorgeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private TextView textPorcentagem;
    private TextView textGorjeta;
    private TextView textTotal;
    private SeekBar seekBarGorjeta;

    private double porcentagem = 0;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor = findViewById(R.id.editValor);
        textGorjeta = findViewById(R.id.textGorjeta);
        textPorcentagem = findViewById(R.id.textPorcentagem);
        textTotal = findViewById(R.id.textTotal);
        seekBarGorjeta = findViewById(R.id.seekBarGorjeta);

        //Adicionando um listener no seekBar.

        seekBarGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

                porcentagem = progress;
                textPorcentagem.setText( Math.round( porcentagem ) + "% " );
                calcularGorjeta();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void calcularGorjeta(){

        //textGorjeta = editValor * (textPorcentagem / 100);
        String valorRecuperado = editValor.getText().toString();
        if ( valorRecuperado == null || valorRecuperado.equals("") ){

            Toast.makeText(getApplicationContext(),
                    "Digite um valor.",
                    Toast.LENGTH_LONG
                    ).show();


        }else {

            //Converter string para double
            double valorDigitado = Double.parseDouble( valorRecuperado );

            //calcular a gorjeta e total
            double gorjeta = valorDigitado * ( porcentagem/100 );
            double total = gorjeta + valorDigitado;

            //exibe a gorjeta e total
            textGorjeta.setText("R$ " + gorjeta);
            textTotal.setText("R$ " + total);

        }

    }

}