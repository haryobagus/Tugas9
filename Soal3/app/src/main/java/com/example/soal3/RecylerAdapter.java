package com.example.soal3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.ImageViewHolder> {
    private int[] images;

    public RecylerAdapter(int[] images){
        this.images = images;
    }
    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_layout,parent,false);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view);

        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        int image_id = images[position];
        holder.Album.setImageResource(image_id);
        holder.AlbumtTitle.setText("Image :"+position);


    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ImageViewHolder extends  RecyclerView.ViewHolder {
        ImageView Album;
        TextView AlbumtTitle;

        public ImageViewHolder(View itemView) {
            super(itemView);
            Album = itemView.findViewById(R.id.album);
            AlbumtTitle = itemView.findViewById(R.id.album_title);
        }
    }
}
