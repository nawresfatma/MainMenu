package com.example.mainmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity {

    RecyclerView recycler3;
    adapterEvent adapterevent;
    private SnapHelper snapHelper;
    List<event> eventList1;
    //Firebase
    DatabaseReference eventReference;
    //intents
    TextView missionBut , rankingbut,storebut;

eee
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //Recycler event
        recycler3=findViewById(R.id.recyclerEvent);

        snapHelper = new LinearSnapHelper();
        ScaleCenterItemManager scaleCenterItemManager= new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL,false);
        recycler3.setLayoutManager(new LinearLayoutManager(this));
        recycler3.setLayoutManager(scaleCenterItemManager);
        snapHelper.attachToRecyclerView(recycler3);

        //firebase
        eventReference = FirebaseDatabase.getInstance().getReference().child("Events");
        eventReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                eventList1 = new ArrayList<event>();
                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren())
                {
                    event e = dataSnapshot1.getValue(event.class);
                    eventList1.add(e);
                }
                adapterevent = new adapterEvent(eventList1,MainMenu.this);
                recycler3.setAdapter(adapterevent);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(MainMenu.this, "Opsss.... Something is wrong", Toast.LENGTH_SHORT).show();
            }
        });

        //INTENTS
        missionBut=findViewById(R.id.missionBut);
        rankingbut=findViewById(R.id.RankingBut);
        storebut=findViewById(R.id.Store);
        missionBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainMenu.this, missionf.class);
                startActivity(intentLoadNewActivity);
            }
        });
        storebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainMenu.this, Store.class);
                startActivity(intentLoadNewActivity);
            }
        });
        rankingbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainMenu.this, Ranking.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }}