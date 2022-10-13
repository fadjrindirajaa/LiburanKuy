package com.mobileprogramming.liburankuy.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mobileprogramming.liburankuy.Model.Kuliner;
import com.mobileprogramming.liburankuy.R;

import java.util.ArrayList;

public class ListKulinerAdapter extends RecyclerView.Adapter<ListKulinerAdapter.listViewHolder> {
    private ArrayList<Kuliner> listKuliner;
    private OnItemKulinerClickCallback onItemKulinerClickCallback;

    public void setOnItemClickCallback(OnItemKulinerClickCallback onItemClickCallback){
        this.onItemKulinerClickCallback = onItemClickCallback;
    }

    public ListKulinerAdapter(ArrayList<Kuliner> list){
        this.listKuliner = list;
    }

    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, int position) {
        Kuliner kuliner = listKuliner.get(position);

        // Glide
        Glide.with((holder.itemView.getContext()))
                .load(kuliner.getPhotoThumbnail())
                .apply(new RequestOptions().override(160, 200))
                .into(holder.imgThumb);
        holder.tvNama.setText(kuliner.getNama_kuliner());

        // Onclick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemKulinerClickCallback.onItemClicked(listKuliner.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listKuliner.size();
    }

    public class listViewHolder extends RecyclerView.ViewHolder {
        ImageView imgThumb;
        TextView tvNama;
        public listViewHolder(@NonNull View itemView) {
            super(itemView);
            imgThumb = itemView.findViewById(R.id.img_item_thumb);
            tvNama = itemView.findViewById(R.id.tv_nama_tempat);
        }
    }

    // Onclick Interface
    public interface OnItemKulinerClickCallback {
        void onItemClicked(Kuliner data);
    }
}
