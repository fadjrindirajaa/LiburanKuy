package com.mobileprogramming.liburankuy.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mobileprogramming.liburankuy.Model.Perjalanan;
import com.mobileprogramming.liburankuy.R;

import java.util.ArrayList;

public class PerjalananAdapter extends RecyclerView.Adapter<PerjalananAdapter.MyViewHolder> {
    private final ArrayList<Perjalanan> listPerjalanan = new ArrayList<>();
    private final Activity activity;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public PerjalananAdapter(Activity activity){
        this.activity = activity;
    }

    public ArrayList<Perjalanan> getListPerjalanan(){
        return listPerjalanan;
    }

    public void setListPerjalanan(ArrayList<Perjalanan> listPerjalanan){
        if(listPerjalanan.size() > 0){
            this.listPerjalanan.clear();
        }
        this.listPerjalanan.addAll(listPerjalanan);
        notifyDataSetChanged();
    }

    public void addItem(Perjalanan perjalanan){
        this.listPerjalanan.add(perjalanan);
        notifyItemInserted(listPerjalanan.size() - 1);
    }

    public void removeItem(int position){
        this.listPerjalanan.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, listPerjalanan.size());
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_perjalananku, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Perjalanan perjalanan = listPerjalanan.get(position);

        Glide.with((holder.itemView.getContext()))
                .load(perjalanan.getPhotoThumbnail())
                .apply(new RequestOptions().override(160, 200))
                .into(holder.imgThumb);
        holder.tvNamaTempat.setText(listPerjalanan.get(position).getNama());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPerjalanan.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPerjalanan.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        final TextView tvNamaTempat;
        final ImageView imgThumb;
        final CardView cvPerjalanan;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaTempat = itemView.findViewById(R.id.tv_nama_tempat);
            imgThumb = itemView.findViewById(R.id.img_item_thumb);
            cvPerjalanan = itemView.findViewById(R.id.cv_row_item);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Perjalanan data);
    }
}
