package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view){

        // Instanciar AlertDialog

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        // Configurar titulo e mensagem

        dialog.setTitle(" Titulo da Dialog ");
        dialog.setMessage(" Mensagem da Dialog ");

        // Configurar cancelamento, isto serve para não dexar o usuario fechar a janela
        // de dialogo.

        dialog.setCancelable(false);

        /* // configurar um icone para o titulo
        * */

        dialog.setIcon( android.R.drawable.alert_light_frame );

        // Configurar acoes para sim e nao

        dialog.setPositiveButton(" Sim ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(
                        getApplicationContext(),
                        " Executar ação ao clicar Sim. ",
                        Toast.LENGTH_SHORT
                ).show();

            }
        });

        dialog.setNegativeButton(" Não ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(
                        getApplicationContext(),
                        " Executar ação ao clicar Não. ",
                        Toast.LENGTH_SHORT
                ).show();

            }
        });

        // Criar e exibir AlertDialog

        dialog.create();
        dialog.show();

    }

}
