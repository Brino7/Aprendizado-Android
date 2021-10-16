package com.example.alcool_ou_gasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool, editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado = findViewById(R.id.textResultado);

    }

    public void calcularPreco(View view){
        //recuperar os valores digitados

        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        //Validar os campos diigitados
        Boolean camposValidados = validarCampos(precoAlcool,precoGasolina);
        if(camposValidados){
            //Convertendo string para numero
            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);

            /* Fazer cálculo de menor preço
            * Se (valorAlcool / valorGasolina) >= 0.7 é melhor utilizar gasolina
            * senão é melhor utilizar álcool.
             *  */

            Double resultado = valorAlcool / valorGasolina;
            if (resultado >= 0.7){
                textResultado.setText("Melhor utilizar Gasolina.");
            }else{
                textResultado.setText("Melhor utilizar Álcool.");
            }


        }else{
            textResultado.setText("Preencha os preços primeiro.");
        }


    }

    public Boolean validarCampos(String pAlcool, String pGasolina){
        Boolean camposValidados = true;
        String campo = "preenchido";
            if (pAlcool == null || pAlcool == ""){
                camposValidados = false;
                campo = "alcool";
            }else  if (pGasolina == null || pGasolina == ""){
                camposValidados = false;
                campo = "gosolina";
            }
            return camposValidados;
    }

}
