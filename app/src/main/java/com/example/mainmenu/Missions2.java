package com.example.mainmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Missions2 extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<ListMissions> listMissions= new ArrayList<>();
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missions2);
        recyclerView=findViewById(R.id.recyclerView4);
        listMissions.add(new ListMissions("1000 lila ou lila ","we are more than happy",R.drawable.man,"DISCOVER"));
        listMissions.add(new ListMissions("torbet el bey","we are more than happy",R.drawable.cube,"DISCOVER"));
        listMissions.add(new ListMissions("dar ben gacem ","we are more than happy",R.drawable.man,"DISCOVER"));
        listMissions.add(new ListMissions("title 3","we are more than happy",R.drawable.cube,"DISCOVER"));
        adapter =new MyAdapter(listMissions, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}