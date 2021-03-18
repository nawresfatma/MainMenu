 package com.example.mainmenu;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder> {

    private List<event> eventList;
   private  Context context;



    public myAdapter(List<event> eventList, Context context) {

        this.eventList = eventList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_menu,parent,false);
        return new myAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

       event event=eventList.get(position);
       holder.myText6.setText(event.getTitle());
       holder.myText7.setText(event.getLocation());
       holder.myText8.setText(event.getPrice());
       holder.myImage1.setImageResource(event.getImg());

    }

    @Override
    public int getItemCount() {

            return eventList.size();

    }


    public static class MyViewHolder extends RecyclerView.ViewHolder  {

        TextView myText6,myText7,myText8;
        ImageView myImage1;



        public MyViewHolder(@NonNull View itemView ) {
            super(itemView);

            myText6=itemView.findViewById(R.id.eventname);
            myText7=itemView.findViewById(R.id.location);
            myText8=itemView.findViewById(R.id.price2);
            myImage1=itemView.findViewById(R.id.eventpic);


        }
    }
}
