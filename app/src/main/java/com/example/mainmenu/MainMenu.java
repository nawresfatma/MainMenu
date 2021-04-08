package com.example.mainmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity {

    RecyclerView recycler3;
    private SnapHelper snapHelper;
    List<event> eventList1=new ArrayList<>();


    event e=new event("festival des arts des lumieres","Medina","free",R.drawable.eventone);
    event e1=new event("Launch Bassamet","ElMrabet","15dt",R.drawable.mrabett);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        recycler3=findViewById(R.id.recyclerView);

       eventList1.add(e);
       eventList1.add(e1);

        myAdapter myAdapt=new myAdapter(eventList1,this);
        recycler3.setAdapter(myAdapt);
        snapHelper = new LinearSnapHelper();
        ScaleCenterItemManager scaleCenterItemManager= new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL,false);
        recycler3.setLayoutManager(new LinearLayoutManager(this));
        recycler3.setLayoutManager(scaleCenterItemManager);
        snapHelper.attachToRecyclerView(recycler3);
}}