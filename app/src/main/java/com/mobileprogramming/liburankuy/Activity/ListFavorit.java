//package com.mobileprogramming.liburankuy.Activity;
//
//import android.content.res.Resources;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.GridView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.mobileprogramming.liburankuy.Adapter.ListFavoritAdapter;
//import com.mobileprogramming.liburankuy.R;
//
//public class ListFavorit extends AppCompatActivity {
//
//    GridView gridView;
//
//    String[] labels;
//
//    String[] numberWord = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
//
//    int[] numberImage = {R.drawable.o, R.drawable.eurad1,  R.drawable.k, R.drawable.puncak_rindu, R.drawable.e1, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j};
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        getSupportActionBar().hide();
//
//        Resources res = getResources();
//        labels = res.getStringArray(R.array.wisata);
//
//        gridView = findViewById(R.id.grid_view);
//
//        ListFavoritAdapter adapter = new ListFavoritAdapter(ListFavorit.this,numberWord,numberImage);
//        gridView.setAdapter(adapter);
//
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getApplicationContext(), "You Clicked "+numberWord[+ position], Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}