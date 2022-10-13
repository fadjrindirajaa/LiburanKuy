package com.mobileprogramming.liburankuy.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mobileprogramming.liburankuy.Adapter.ListPenginapanAdapter;
import com.mobileprogramming.liburankuy.Model.Penginapan;
import com.mobileprogramming.liburankuy.Model.PenginapanData;
import com.mobileprogramming.liburankuy.R;

import java.util.ArrayList;

public class ListPenginapan extends AppCompatActivity {

    private RecyclerView rvPenginapan;
    private ArrayList<Penginapan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_penginapan);

        rvPenginapan = findViewById(R.id.rv_listpenginapan);
        rvPenginapan.setHasFixedSize(true);

        list.addAll(PenginapanData.getListDataPenginapan());
        showData();
    }

    private void showData(){
        rvPenginapan.setLayoutManager(new GridLayoutManager(this, 2));
        ListPenginapanAdapter penginapanAdapter = new ListPenginapanAdapter(list);
        rvPenginapan.setAdapter(penginapanAdapter);

        penginapanAdapter.setOnItemClickCallback(new ListPenginapanAdapter.OnItemPenginapanClickCallback() {
            @Override
            public void onItemClicked(Penginapan data) {
                showSelectedPenginapan(data);
            }
        });
    }

    private void showSelectedPenginapan(Penginapan penginapan){
        Intent mIntent = new Intent(ListPenginapan.this, DetailListPenginapan.class);
        mIntent.putExtra(DetailPenginapanActivity.EXTRA_PENGINAPAN_NAME, penginapan.getNama());
        mIntent.putExtra(DetailPenginapanActivity.EXTRA_PENGINAPAN_DESC, penginapan.getDeskripsi());
        mIntent.putExtra(DetailPenginapanActivity.EXTRA_PENGINAPAN_FASILITAS, penginapan.getFasilitas());
        mIntent.putExtra(DetailPenginapanActivity.EXTRA_PENGINAPAN_LOCATION, penginapan.getAlamat());
        mIntent.putExtra(DetailPenginapanActivity.EXTRA_PENGINAPAN_HARGA, penginapan.getHarga());
        mIntent.putExtra(DetailPenginapanActivity.EXTRA_PENGINAPAN_JARAK, penginapan.getJarak());
        mIntent.putExtra(DetailPenginapanActivity.EXTRA_PENGINAPAN_KEY, penginapan.getKey());
        mIntent.putExtra(DetailPenginapanActivity.EXTRA_PENGINAPAN_GMAPS, penginapan.getGmaps());
        mIntent.putExtra(DetailPenginapanActivity.EXTRA_PENGINAPAN_IMGPOSTER, penginapan.getPhoto_poster());
        startActivity(mIntent);
    }
}