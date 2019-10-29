package com.example.soal3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images = {R.drawable.batman, R.drawable.flash,R.drawable.gundala,R.drawable.joker,
            R.drawable.robin,R.drawable.spiderman,R.drawable.venom,R.drawable.aquaman};
    private RecylerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recylerView);
        layoutManager = new GridLayoutManager(this, 2 );
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecylerAdapter(images);
        recyclerView.setAdapter(adapter);
    }
}
