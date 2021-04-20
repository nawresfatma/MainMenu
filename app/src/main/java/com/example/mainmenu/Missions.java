package com.example.mainmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Missions extends AppCompatActivity {
    TextView Store ,missionsbut,Ranking ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missions);
        Store=findViewById(R.id.Store);
        missionsbut=findViewById(R.id.missionsbut);
        Ranking=findViewById(R.id.Rankingbut);




        Store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Missions.this, Store.class);
                startActivity(intentLoadNewActivity);
            }
        });
         missionsbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Missions.this, missionf.class);
                startActivity(intentLoadNewActivity);
            }
        });

         Ranking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Missions.this, Ranking.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }

}