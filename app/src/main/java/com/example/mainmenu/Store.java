package com.example.mainmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Store extends AppCompatActivity {

    RecyclerView storeRecycler;
    ArrayList<ListStore> listStores;
    StoreAdapter storeAdapter;
    //Firebase
    DatabaseReference storeReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        storeRecycler=findViewById(R.id.recyclerView5);
        ee

       /*listStores.add(new ListStore("chachia" , "100" ,R.drawable.chachia));
        listStores.add(new ListStore("chachia" , "100" ,R.drawable.chachia));
        listStores.add(new ListStore("chachia" , "100",R.drawable.chachia));
        listStores.add(new ListStore("chachia" , "100",R.drawable.chachia));*/

//firebase store
        storeReference= FirebaseDatabase.getInstance().getReference("Store");
        storeReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
              listStores=new ArrayList<>();
                for(DataSnapshot d1: dataSnapshot.getChildren())
                {


                    ListStore s = d1.getValue(ListStore.class);
                    listStores.add(s);


                }


                storeAdapter = new StoreAdapter(listStores,Store.this);
                storeRecycler.setLayoutManager(new GridLayoutManager(Store.this,2));
                storeRecycler.setAdapter(storeAdapter);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(Store.this, "Opsss.... Something is wrong", Toast.LENGTH_SHORT).show();
            }
        });



    }
}