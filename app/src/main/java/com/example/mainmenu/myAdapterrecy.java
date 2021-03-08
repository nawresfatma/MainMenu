package com.example.mainmenu;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import static android.content.ContentValues.TAG;

public class myAdapterrecy extends RecyclerView.Adapter<myAdapterrecy.MyViewHolder> {
    String data6[], data7[],data8[];
    int images2[];
    Context context;
    private OnNoteListener mOnNoteListener;
    private static final String TAG = "NotesRecyclerAdapter";
    public myAdapterrecy( String s3[], String s4[], String s5[], int img1[], OnNoteListener onNoteListener) {

        data6 = s3;
        data7 = s4;
        data8 = s5;
        images2 = img1;
        this.mOnNoteListener = onNoteListener;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_menu,parent,false);
        return new myAdapterrecy.MyViewHolder(view , mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        try{
        holder.myText6.setText(data6[position]);
        holder.myText7.setText(data7[position]);
        holder.myText8.setText(data8[position]);
        holder.myImage1.setImageResource(images2[position]);
        } catch  (NullPointerException e){
            Log.e(TAG, "onBindViewHolder: Null Pointer: " + e.getMessage() );
        }
    }

    @Override
    public int getItemCount() {
        return data8.length;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {



        OnNoteListener mOnNoteListener;
        TextView myText6,myText7,myText8;
        ImageView myImage1;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView ,OnNoteListener onNoteListener) {
            super(itemView);

            myText6=itemView.findViewById(R.id.productname2);
            myText7=itemView.findViewById(R.id.location);
            myText8=itemView.findViewById(R.id.price2);
            myImage1=itemView.findViewById(R.id.event);


            mOnNoteListener = onNoteListener;

            itemView.setOnClickListener(this);
        }




        @Override
        public void onClick(View view) {
            Log.d(TAG, "onClick: " + getAdapterPosition());
            mOnNoteListener.onNoteClick(getAdapterPosition());
        }
    }

    public interface OnNoteListener{
        void onNoteClick(int position);
    }
}
