package com.example.mainmenu;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class Ranking extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<ListClassement> listClassement = new ArrayList<>();
    CardAdapter adapter;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        recyclerView = findViewById(R.id.recyclerView3);


        listClassement.add(new ListClassement(1, "fathi", 8000, R.drawable.coin, R.drawable.cube));
        listClassement.add(new ListClassement(2, "mohssen", 1000, R.drawable.coin, R.drawable.img));
        listClassement.add(new ListClassement(3, "nawres", 7000, R.drawable.coin, R.drawable.iimg));
        listClassement.add(new ListClassement(4, "Samy", 8000, R.drawable.coin, R.drawable.iimg));
        adapter = new CardAdapter(listClassement, this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        //tableau fih les elements lkol me ghir rank baaed taaamel l add ou rank kol mara ikadem



    }


}
