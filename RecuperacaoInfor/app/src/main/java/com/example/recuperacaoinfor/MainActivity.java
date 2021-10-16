package com.example.recuperacaoinfor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.FocusFinder;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    protected TextInputEditText campoNome;
    protected TextInputEditText campoEmail;
    protected TextView lbResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.textImputNome);
        campoEmail = findViewById(R.id.textImputEmail);
        lbResultado = findViewById(R.id.textResultado);

        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        sexoMasculino = findViewById(R.id.radioButtonMasculino);
        sexoFeminino = findViewById(R.id.radioButtonFeminino);
        opcaoSexo = findViewById(R.id.radioGroupSexo);
        radiobutton();

    }

    public void radiobutton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonMasculino){
                    lbResultado.setText("Masculino");
                }else if (checkedId == R.id.radioButtonFeminino){
                    lbResultado.setText("Feminino");
                }
            }
        });

        /*
        if (sexoMasculino.isChecked()){
            lbResultado.setText("Masculino");
        }else if ( sexoFeminino.isChecked()){
            lbResultado.setText("Feminino");
        }*/
    }

    public void checkbox(){

        String texto = "";
        if( checkVerde.isChecked()){

            String corSelecionada = checkVerde.getText().toString();
            texto = corSelecionada;
            //texto = "Verde selecionado.";

        }
        if (checkBranco.isChecked()){

            texto = texto + "Branco selecionado.";

        }
        if(checkVermelho.isChecked()){

            texto = texto + "Vermelho selecionado.";

        }

        lbResultado.setText(texto);

    }

    public void enviar(View view){

        //radiobutton();

        //checkbox();

        /*String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        lbResultado.setText("nome: " + nome + " email: " + email);
        */
    }

    public void limpar(View view){
        campoNome.setText("");
        campoNome.requestFocus();
        campoEmail.setText("");
        lbResultado.setText("Resultado");

    }

}
