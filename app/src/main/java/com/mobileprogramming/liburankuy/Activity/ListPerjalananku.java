package com.mobileprogramming.liburankuy.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mobileprogramming.liburankuy.Adapter.PerjalananAdapter;
import com.mobileprogramming.liburankuy.Model.Perjalanan;
import com.mobileprogramming.liburankuy.R;

import java.util.ArrayList;

public class ListPerjalananku extends AppCompatActivity {

    private RecyclerView rvPerjalanan;
    private ArrayList<Perjalanan> list = new ArrayList<>();
    private PerjalananAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_perjalananku);

        rvPerjalanan = findViewById(R.id.rv_list_perjalanan);
        rvPerjalanan.setLayoutManager(new LinearLayoutManager(this));
        rvPerjalanan.setHasFixedSize(true);
        adapter = new PerjalananAdapter(this);
        rvPerjalanan.setAdapter(adapter);
    }
}