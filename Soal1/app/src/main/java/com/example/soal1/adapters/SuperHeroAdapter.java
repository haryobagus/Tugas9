package com.example.soal1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.soal1.R;
import com.example.soal1.models.SuperHero;

import java.util.List;

public class SuperHeroAdapter extends RecyclerView.Adapter<SuperHeroAdapter.MyViewHolder> {
    List<SuperHero> heroList;

    public SuperHeroAdapter(List<SuperHero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public SuperHeroAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View superHeroView = layoutInflater.inflate(R.layout.item_super_hero,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(superHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SuperHeroAdapter.MyViewHolder holder, int position) {
        //ambil satu item hero
        SuperHero hero = heroList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.Nama.setText(hero.getHeroName());
    }

    @Override
    public int getItemCount()    {
        return (heroList != null) ? heroList.size() : 0;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView Nama;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Nama = itemView.findViewById(R.id.nama);
        }
    }
}
