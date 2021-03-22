package com.example.mainmenu;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class missionf extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<ListMissions> listMissions= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missionf);




        recyclerView=findViewById(R.id.recyclerView4);
        listMissions.add(new ListMissions("1000 lila ou lila ","we are more than happy",R.drawable.man,"DISCOVER"));
        listMissions.add(new ListMissions("torbet el bey","we are more than happy",R.drawable.cube,"DISCOVER"));
        listMissions.add(new ListMissions("dar ben gacem ","we are more than happy",R.drawable.man,"DISCOVER"));
        listMissions.add(new ListMissions("title 3","we are more than happy",R.drawable.cube,"DISCOVER"));
        MissionAdapter adapter =new MissionAdapter(listMissions, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
}