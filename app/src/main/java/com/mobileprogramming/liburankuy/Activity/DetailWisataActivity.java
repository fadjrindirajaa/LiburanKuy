package com.mobileprogramming.liburankuy.Activity;

import static com.mobileprogramming.liburankuy.Db.DatabaseContract.PerjalananColumns.DESKRIPSI;
import static com.mobileprogramming.liburankuy.Db.DatabaseContract.PerjalananColumns.HARGA;
import static com.mobileprogramming.liburankuy.Db.DatabaseContract.PerjalananColumns.JAM;
import static com.mobileprogramming.liburankuy.Db.DatabaseContract.PerjalananColumns.LOKASI;
import static com.mobileprogramming.liburankuy.Db.DatabaseContract.PerjalananColumns.NAMA;
import static com.mobileprogramming.liburankuy.Db.DatabaseContract.PerjalananColumns.PHOTOPOSTER;
import static com.mobileprogramming.liburankuy.Db.DatabaseContract.PerjalananColumns.PHOTOTHUMBNAIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mobileprogramming.liburankuy.Db.Helper;
import com.mobileprogramming.liburankuy.MapsActivity;
import com.mobileprogramming.liburankuy.Model.Perjalanan;
import com.mobileprogramming.liburankuy.R;

public class DetailWisataActivity extends AppCompatActivity implements View.OnClickListener {

    private Helper perjalananHelper;
    private Perjalanan perjalanan;

    public static final String EXTRA_WISATA_NAME = "extra_wisata_name";
    public static final String EXTRA_WISATA_DESC = "extra_wisata_desc";
    public static final String EXTRA_WISATA_LOCATION = "extra_wisata_location";
    public static final String EXTRA_WISATA_HTM = "extra_wisata_htm";
    public static final String EXTRA_WISATA_IMGPOSTER = "extra_wisata_imgposter";
    public static final String EXTRA_WISATA_JAMBUKA = "extra_wisata_jam";
    public static final String EXTRA_WISATA_IMGTHUMBNAIL = "extra_wisata_imgthumbnail";
    private TextView tvNamaWisata, tvDescWisata, tvLocation, tvHtm, tvJamBuka;
    ImageView imgPoster;
    Button btnToRekomendasiPenginapan, btnMaps;
    String nama, desc, lokasi, htm, jamBuka;
    int imgPosterFile, imgThumbnailFile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_wisata);

        tvNamaWisata = findViewById(R.id.tv_nama_wisata);
        tvDescWisata = findViewById(R.id.tv_desc_wisata);
        tvLocation =  findViewById(R.id.tv_lokasi_wisata);
        tvHtm = findViewById(R.id.tv_htm_wisata);
        tvJamBuka = findViewById(R.id.tv_jambuka_wisata);
        imgPoster = findViewById(R.id.img_wisata_poster);
        btnToRekomendasiPenginapan = findViewById(R.id.btn_to_rekomendasi_penginapan);
        btnMaps = findViewById(R.id.btn_lokasi);

        btnToRekomendasiPenginapan.setOnClickListener(this);
        btnMaps.setOnClickListener(this);

        nama = getIntent().getStringExtra(EXTRA_WISATA_NAME);
        desc = getIntent().getStringExtra(EXTRA_WISATA_DESC);
        lokasi = getIntent().getStringExtra(EXTRA_WISATA_LOCATION);
        htm = getIntent().getStringExtra(EXTRA_WISATA_HTM);
        jamBuka = getIntent().getStringExtra(EXTRA_WISATA_JAMBUKA);
        imgPosterFile = getIntent().getIntExtra(EXTRA_WISATA_IMGPOSTER, 0);
        imgThumbnailFile = getIntent().getIntExtra(EXTRA_WISATA_IMGTHUMBNAIL, 0);

        tvNamaWisata.setText(nama);
        tvDescWisata.setText(desc);
        tvLocation.setText(lokasi);
        tvHtm.setText(htm);
        tvJamBuka.setText(jamBuka);
        Glide.with(DetailWisataActivity.this)
                .load(imgPosterFile)
                .apply(new RequestOptions().placeholder(R.color.design_default_color_on_primary))
                .into(imgPoster);

    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_to_rekomendasi_penginapan){
            // pindah ke rekomendasi
            Intent moveIntent = new Intent(DetailWisataActivity.this, PenginapanActivity.class);
            startActivity(moveIntent);
        }

        else if (v.getId()==R.id.btn_lokasi){
            Intent moveIntent = new Intent(DetailWisataActivity.this, MapsActivity.class);
            startActivity(moveIntent);
        }
    }
}