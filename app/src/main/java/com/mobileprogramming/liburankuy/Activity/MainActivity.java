package com.mobileprogramming.liburankuy.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mobileprogramming.liburankuy.Adapter.ListWisataAdapter;
import com.mobileprogramming.liburankuy.Model.Penginapan;
import com.mobileprogramming.liburankuy.Model.Wisata;
import com.mobileprogramming.liburankuy.Model.WisataData;
import com.mobileprogramming.liburankuy.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvWisata;
    private ArrayList<Wisata> list = new ArrayList<>();
    Button btnListKuliner, btnListPenginapan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListKuliner = findViewById(R.id.btn_to_list_kuliner);
        btnListKuliner.setOnClickListener(this);
        btnListPenginapan = findViewById(R.id.btn_to_list_penginapan);
        btnListPenginapan.setOnClickListener(this);
        rvWisata = findViewById(R.id.rv_menu);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showData();
    }

    private void showData(){
        rvWisata.setLayoutManager(new GridLayoutManager(this, 2));
        ListWisataAdapter wisataAdapter = new ListWisataAdapter(list);
        rvWisata.setAdapter(wisataAdapter);

        wisataAdapter.setOnItemClickCallback(new ListWisataAdapter.OnItemWisataClickCallback() {

            @Override
            public void onItemClicked(Wisata data) {
                showSelectedWisata(data);
            }
        });
    }

    private void showSelectedWisata(Wisata wisata){
        Intent mIntent = new Intent(MainActivity.this, DetailWisataActivity.class);
        mIntent.putExtra(DetailWisataActivity.EXTRA_WISATA_NAME, wisata.getNama_wisata());
        mIntent.putExtra(DetailWisataActivity.EXTRA_WISATA_DESC, wisata.getDesc_wisata());
        mIntent.putExtra(DetailWisataActivity.EXTRA_WISATA_HTM, wisata.getHtm_wisata());
        mIntent.putExtra(DetailWisataActivity.EXTRA_WISATA_LOCATION, wisata.getAlamat_wisata());
        mIntent.putExtra(DetailWisataActivity.EXTRA_WISATA_JAMBUKA, wisata.getJamBuka_wisata());
        mIntent.putExtra(DetailWisataActivity.EXTRA_WISATA_IMGPOSTER, wisata.getPhotoPoster());

        startActivity(mIntent);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_to_list_kuliner){
            Intent moveActivity = new Intent(MainActivity.this, ListKuliner.class);
            startActivity(moveActivity);
        }
        if(v.getId() == R.id.btn_to_list_penginapan){
            Intent moveActivity = new Intent(MainActivity.this, ListPenginapan.class);
            startActivity(moveActivity);
        }
    }
}