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
import com.mobileprogramming.liburankuy.Model.Penginapan;
import com.mobileprogramming.liburankuy.R;

import java.util.ArrayList;

public class ListPenginapanAdapter extends RecyclerView.Adapter<ListPenginapanAdapter.listViewHolder> {
    private ArrayList<Penginapan> listPenginapan;
    private OnItemPenginapanClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemPenginapanClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListPenginapanAdapter(ArrayList<Penginapan> list){
        this.listPenginapan = list;
    }


    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, int position) {
        Penginapan penginapan = listPenginapan.get(position);

        // Glide
        Glide.with((holder.itemView.getContext()))
                .load(penginapan.getPhoto_thumbnail())
                .apply(new RequestOptions().override(160, 200))
                .into(holder.imgThumb);
        holder.tvNama.setText(penginapan.getNama());

        // Onclick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listPenginapan.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPenginapan.size();
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
    public interface OnItemPenginapanClickCallback {
        void onItemClicked(Penginapan data);
    }
}
