package com.example.listagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listNomes;
    private String[] nomes = {
        "Anderson", "Alex", "Aline", "Paulo",
        "Sebastião", "Vanilda"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listNomes = findViewById(R.id.listagem_Nomes);

        //Cria um adaptador para a Lista de nomes.
        ArrayAdapter<String> familia = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                nomes
        );

        //Adiciona adaptador para a lista de nomes
        listNomes.setAdapter( familia );

        //Adiciona clique na lista
        listNomes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorSelecionado = listNomes.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),
                        valorSelecionado,
                        Toast.LENGTH_LONG
                        ).show();
            }
        });

    }
}