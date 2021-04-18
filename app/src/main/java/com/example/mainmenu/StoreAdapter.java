package com.example.mainmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {

    List<ListStore> listStores;
     Context context;

    public StoreAdapter(List<ListStore> listStore, Context context) {
        this.listStores = listStore;
        this.context = context;
    }

    @NonNull
    @Override
    public StoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardstore,parent,false);
        return  new StoreAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StoreAdapter.ViewHolder holder, int position) {
        ListStore l=listStores.get(position);
        holder.prName.setText(l.getPrName());
        holder.prprice.setText(l.getPrPrice());
        //holder.imageStore.setImageResource(listStore.getImage1());
        Picasso.get().load(listStores.get(position).getPrImg()).into(holder.prImg);

    }

    @Override
    public int getItemCount() {
        return listStores.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
            public TextView prName;
            public TextView prprice;
            public ImageView prImg;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            prImg= itemView.findViewById(R.id.imagestore) ;
            prName= itemView.findViewById(R.id.title2);
            prprice= itemView.findViewById(R.id.price);

        }
    }
}
