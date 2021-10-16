package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagens;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagens> listaPostagens = new ArrayList<>();


    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Listagem de postagens

        this.criarPostagens();

        //Configurar adapter
        PostagemAdapter adapter = new PostagemAdapter( listaPostagens );

        //Configurar Recylerview



        //LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager( layoutManager );
        recyclerPostagem.setHasFixedSize(true);
        recyclerPostagem.addItemDecoration( new DividerItemDecoration( this, LinearLayout.VERTICAL));


        recyclerPostagem.setAdapter( adapter );

    }

    public void criarPostagens(){

        Postagens p = new Postagens(" Anderson Silva Brino ", " Viagem legal! ", R.drawable.imagem1);
        this.listaPostagens.add( p );

        p = new Postagens(" Alex Silva Brino ", " Boa viajem ", R.drawable.imagem2);
        this.listaPostagens.add( p );

        p = new Postagens(" Paulo Silva Brino ", " Viagem com segurança. ", R.drawable.imagem3);
        this.listaPostagens.add( p );

        p = new Postagens(" Aline Silva Brino ", " Viagem muito divertida. ", R.drawable.imagem4);
        this.listaPostagens.add( p );

    }
}