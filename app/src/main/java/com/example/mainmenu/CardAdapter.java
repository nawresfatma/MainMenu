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

import com.squareup.picasso.Picasso;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private List<ListClassement> ListClassement;
    private Context context;


    public CardAdapter(List<com.example.mainmenu.ListClassement> listClassement, Context context) {
        ListClassement = listClassement;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.ViewHolder holder, int position) {
        ListClassement listClassement=ListClassement.get(position);
        holder.rank.setText(String.valueOf(listClassement.getRank()));
        holder.name.setText(listClassement.getName());
        holder.points.setText(String.valueOf(listClassement.getPoints()));
        holder.coin.setImageResource(listClassement.getCoin());
        holder.profile.setImageResource(listClassement.getProfile());



    }



    @Override
    public int getItemCount() {
        return ListClassement.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView rank;
        public TextView name;
        public TextView points ;
        public ImageView coin;
        public ImageView profile;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rank=(TextView) itemView.findViewById(R.id.rank);
            points=(TextView) itemView.findViewById(R.id.points);
            name=(TextView) itemView.findViewById(R.id.namee);
            profile=(ImageView) itemView.findViewById(R.id.profilee);
            coin=(ImageView) itemView.findViewById(R.id.coin);

        }
    }

}
