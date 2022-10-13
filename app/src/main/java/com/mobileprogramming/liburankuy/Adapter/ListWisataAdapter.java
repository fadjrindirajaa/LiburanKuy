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
import com.mobileprogramming.liburankuy.Model.Wisata;
import com.mobileprogramming.liburankuy.R;

import java.util.ArrayList;

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.listViewHolder> {
    private ArrayList<Wisata> listWisata;
    private OnItemWisataClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemWisataClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListWisataAdapter(ArrayList<Wisata> list){
        this.listWisata = list;
    }

    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, int position) {
        Wisata wisata = listWisata.get(position);
        Glide.with((holder.itemView.getContext()))
                .load(wisata.getPhotoThumbnail())
                .apply(new RequestOptions().override(160, 200))
                .into(holder.imgThumb);
        holder.tvNamaWisata.setText(listWisata.get(position).getNama_wisata());

        // OnClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listWisata.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class listViewHolder extends RecyclerView.ViewHolder {
        ImageView imgThumb;
        TextView tvNamaWisata;

        public listViewHolder(@NonNull View itemView) {
            super(itemView);
            imgThumb = itemView.findViewById(R.id.img_item_thumb);
            tvNamaWisata = itemView.findViewById(R.id.tv_nama_tempat);
        }
    }

    public interface OnItemWisataClickCallback {
        void onItemClicked(Wisata data);
    }
}
