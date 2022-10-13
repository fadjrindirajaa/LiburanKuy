package com.mobileprogramming.liburankuy.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mobileprogramming.liburankuy.R;

public class DetailListPenginapan extends AppCompatActivity {

    public static final String EXTRA_PENGINAPAN_NAME = "extra_penginapan_name";
    public static final String EXTRA_PENGINAPAN_DESC = "extra_penginapan_desc";
    public static final String EXTRA_PENGINAPAN_LOCATION = "extra_penginapan_location";
    public static final String EXTRA_PENGINAPAN_HARGA = "extra_penginapan_harga";
    public static final String EXTRA_PENGINAPAN_FASILITAS ="extra_penginapan_fasilitas";
    public static final String EXTRA_PENGINAPAN_IMGPOSTER = "extra_penginapan_imgposter";

    private TextView tvNamaPenginapan, tvDescPenginapan, tvAlamatPenginapan, tvHarga, tvFasilitas;
    ImageView imgPosterPenginapan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_list_penginapan);

        tvNamaPenginapan = findViewById(R.id.tv_nama_penginapan);
        tvDescPenginapan =  findViewById(R.id.tv_deskripsi_penginapan);
        tvAlamatPenginapan =  findViewById(R.id.tv_lokasi_penginapan);
        tvHarga = findViewById(R.id.tv_htm_penginapan);
        tvFasilitas = findViewById(R.id.tv_fasilitas_penginapan);
        imgPosterPenginapan = findViewById(R.id.img_penginapan_poster);

        String nama = getIntent().getStringExtra(EXTRA_PENGINAPAN_NAME);
        String desc = getIntent().getStringExtra(EXTRA_PENGINAPAN_DESC);
        String lokasi = getIntent().getStringExtra(EXTRA_PENGINAPAN_LOCATION);
        String htm = getIntent().getStringExtra(EXTRA_PENGINAPAN_HARGA);
        String fasilitas = getIntent().getStringExtra(EXTRA_PENGINAPAN_FASILITAS);
        int imgPosterFile = getIntent().getIntExtra(EXTRA_PENGINAPAN_IMGPOSTER, 0);

        tvNamaPenginapan.setText(nama);
        tvDescPenginapan.setText(desc);
        tvAlamatPenginapan.setText(lokasi);
        tvHarga.setText(htm);
        tvFasilitas.setText(fasilitas);
        Glide.with(DetailListPenginapan.this)
                .load(imgPosterFile)
                .apply(new RequestOptions().placeholder(R.color.design_default_color_on_primary))
                .into(imgPosterPenginapan);

    }
}