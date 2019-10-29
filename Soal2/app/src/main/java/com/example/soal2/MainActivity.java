package com.example.soal2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.soal2.adapters.SuperHeroAdapter;
import com.example.soal2.models.SuperHero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private int[] images ={R.drawable.flash, R.drawable.batman};

    List<SuperHero> listSuperHero = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        SuperHero hero = new SuperHero("Superman");
        listSuperHero.add(hero);
        hero = new SuperHero("Superman");
        listSuperHero.add(hero);
        hero = new SuperHero("Superman");
        listSuperHero.add(hero);
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        recyclerView.setAdapter(superHeroAdapter);
        recyclerView.setLayoutManager ( new LinearLayoutManager(this ,LinearLayoutManager.HORIZONTAL, false));
    }
}
