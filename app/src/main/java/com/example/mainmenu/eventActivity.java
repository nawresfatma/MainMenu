package com.example.mainmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class eventActivity extends AppCompatActivity {

    RecyclerView recyclerPh,recyclerProgram;
    private SnapHelper snapHelper ,snapHelperProgram;

    List<programClass> programList=new ArrayList<>();
    List<Integer> photos = new ArrayList<Integer>();
    programClass p=new programClass(R.drawable.youssef,"Opening speech","Ministre des affaires culturelles Mohamed Zinelabidine","Expert à l'Unesco et auteur de nombreuses publications scientifiques, il a dirigé les Instituts supérieurs de musique de Tunis et de Sousse","8:00");
    programClass p1=new programClass(R.drawable.youssef,"Opening speech","Ministre des affaires culturelles Mohamed Zinelabidine","Expert à l'Unesco et auteur de nombreuses publications scientifiques, il a dirigé les Instituts supérieurs de musique de Tunis et de Sousse","10:00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        recyclerPh=findViewById(R.id.recyclerPhoto);
        recyclerProgram=findViewById(R.id.recyclerProgram);

        programList.add(p);
        programList.add(p1);

        photos.add(R.drawable.photoone);
        photos.add(R.drawable.phototwo);
        photos.add(R.drawable.photothree);


       adapterPhoto myAdapt2=new adapterPhoto(photos,this);
        recyclerPh.setAdapter(myAdapt2);
        snapHelper = new LinearSnapHelper();
        ScaleCenterItemManager scaleCenterItemManager= new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerPh.setLayoutManager(new LinearLayoutManager(this));
        recyclerPh.setLayoutManager(scaleCenterItemManager);
        snapHelper.attachToRecyclerView(recyclerPh);


        adapterProgram myAdapt3=new adapterProgram(programList,this);
        recyclerProgram.setAdapter(myAdapt3);
        snapHelperProgram=new LinearSnapHelper();
        ScaleCenterItemManager scaleCenterItemManagerProgram= new ScaleCenterItemManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerProgram.setLayoutManager(new LinearLayoutManager(this));
        recyclerProgram.setLayoutManager(scaleCenterItemManagerProgram);
        snapHelperProgram.attachToRecyclerView(recyclerProgram);
    }
}