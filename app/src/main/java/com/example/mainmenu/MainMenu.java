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
    String s5[] , s6[],s7[];
    int images[]={R.drawable.event,R.drawable.shop};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        recycler3=findViewById(R.id.recyclerView);


        s5=getResources().getStringArray(R.array.event);
        s6=getResources().getStringArray(R.array.location);
        s7=getResources().getStringArray(R.array.price);


      //  myAdapterrecy myAdapt=new myAdapterrecy(this,s5,s6,s7,images);
       // recycler3.setAdapter(myAdapt);
        snapHelper = new LinearSnapHelper();
        ScaleCenterItemManager scaleCenterItemManager= new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL,false);
        recycler3.setLayoutManager(new LinearLayoutManager(this));
        recycler3.setLayoutManager(scaleCenterItemManager);
        snapHelper.attachToRecyclerView(recycler3);
}}