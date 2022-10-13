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

import org.w3c.dom.Text;

public class DetailKulinerActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_KULINER_NAME = "extra_kuliner_name";
    public static final String EXTRA_KULINER_DESC = "extra_kuliner_desc";
    public static final String EXTRA_KULINER_LOCATION = "extra_kuliner_location";
    public static final String EXTRA_KULINER_MENU = "extra_kuliner_menu";
    public static final String EXTRA_KULINER_GMAPS = "extra_kuliner_gmaps";
    public static final String EXTRA_KULINER_IMGPOSTER = "extra_kuliner_imgposter";

    private TextView tvNamaKuliner, tvDescKuliner, tvAlamatKuliner;
    ImageView imgPosterKuliner, imgMenuKuliner;
    Button btnToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_rekomendasi_kuliner);

        tvNamaKuliner = findViewById(R.id.tv_nama_kuliner);
        tvDescKuliner = findViewById(R.id.tv_desc_kuliner);
        tvAlamatKuliner = findViewById(R.id.tv_lokasi_kuliner);
        imgPosterKuliner = findViewById(R.id.img_kuliner_poster);
        btnToHome = findViewById(R.id.btn_to_home);

        btnToHome.setOnClickListener(this);

        String nama = getIntent().getStringExtra(EXTRA_KULINER_NAME);
        String desc = getIntent().getStringExtra(EXTRA_KULINER_DESC);
        String lokasi = getIntent().getStringExtra(EXTRA_KULINER_LOCATION);
        int imgPosterFile = getIntent().getIntExtra(EXTRA_KULINER_IMGPOSTER, 0);
        int imgMenuFile = getIntent().getIntExtra(EXTRA_KULINER_MENU, 0);

        tvNamaKuliner.setText(nama);
        tvDescKuliner.setText(desc);
        tvAlamatKuliner.setText(lokasi);
        Glide.with(DetailKulinerActivity.this)
                .load(imgPosterFile)
                .apply(new RequestOptions().placeholder(R.color.design_default_color_on_primary))
                .into(imgPosterKuliner);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_to_home){
            /// pindah ke main activity
            Intent moveIntent = new Intent(DetailKulinerActivity.this, MainActivity.class);
            startActivity(moveIntent);
        }
    }

}