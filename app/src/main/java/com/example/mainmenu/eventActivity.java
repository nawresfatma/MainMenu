package com.example.mainmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;

public class eventActivity extends AppCompatActivity {

    RecyclerView recyclerPh;
    private SnapHelper snapHelper;

    int images[]={R.drawable.photoone,R.drawable.phototwo,R.drawable.photothree};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        recyclerPh=findViewById(R.id.recyclerPhoto);

       // myAdapterrecy myAdapt=new myAdapterrecy(images,this);
        //recyclerPh.setAdapter(myAdapt);
        snapHelper = new LinearSnapHelper();
        ScaleCenterItemManager scaleCenterItemManager= new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerPh.setLayoutManager(new LinearLayoutManager(this));
        recyclerPh.setLayoutManager(scaleCenterItemManager);
        snapHelper.attachToRecyclerView(recyclerPh);
    }
}