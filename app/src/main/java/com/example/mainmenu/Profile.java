package com.example.mainmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    TextView Viewmore;
    TextView Ranking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Viewmore=findViewById(R.id.Viewmore);
        Ranking=findViewById(R.id.Ranking);


        Viewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Profile.this, Missions.class);
                startActivity(intentLoadNewActivity);
            }
        });


        Ranking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Profile.this, Ranking.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}