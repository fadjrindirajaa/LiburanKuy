package com.mobileprogramming.liburankuy.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mobileprogramming.liburankuy.Adapter.ListKulinerAdapter;
import com.mobileprogramming.liburankuy.Model.Kuliner;
import com.mobileprogramming.liburankuy.Model.KulinerData;
import com.mobileprogramming.liburankuy.R;

import java.util.ArrayList;

public class ListKuliner extends AppCompatActivity {

    private RecyclerView rvKuliner;
    private ArrayList<Kuliner> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_kuliner);

        rvKuliner = findViewById(R.id.gv_list_kuliner);
        rvKuliner.setHasFixedSize(true);

        list.addAll(KulinerData.getListDataKuliner());
        showData();

    }

    private void showData() {
        rvKuliner.setLayoutManager(new GridLayoutManager(this, 2));
        ListKulinerAdapter kulinerAdapter = new ListKulinerAdapter(list);
        rvKuliner.setAdapter(kulinerAdapter);

        kulinerAdapter.setOnItemClickCallback(new ListKulinerAdapter.OnItemKulinerClickCallback() {
            @Override
            public void onItemClicked(Kuliner data) {
                showSelectedKuliner(data);
            }
        });
    }

    private void showSelectedKuliner(Kuliner kuliner) {
        Intent mIntent = new Intent(ListKuliner.this, DetailListKuliner.class);
        mIntent.putExtra(DetailKulinerActivity.EXTRA_KULINER_NAME, kuliner.getNama_kuliner());
        mIntent.putExtra(DetailKulinerActivity.EXTRA_KULINER_DESC, kuliner.getDeskripsi());
        mIntent.putExtra(DetailKulinerActivity.EXTRA_KULINER_LOCATION, kuliner.getAlamat());
        mIntent.putExtra(DetailKulinerActivity.EXTRA_KULINER_MENU, kuliner.getMenu());
        mIntent.putExtra(DetailKulinerActivity.EXTRA_KULINER_GMAPS, kuliner.getGmaps());
        mIntent.putExtra(DetailKulinerActivity.EXTRA_KULINER_IMGPOSTER, kuliner.getFotoPoster());
        startActivity(mIntent);
    }
}
