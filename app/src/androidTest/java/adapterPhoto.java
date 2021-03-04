import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mainmenu.R;

import static android.content.ContentValues.TAG;

public class adapterPhoto extends RecyclerView.Adapter<adapterPhoto.MyViewHolder> {
    int images[];
    Context context;

    public adapterPhoto(int img[], Context context) {
        images = img;
        this.context = context;
    }

    @NonNull
    @Override
    public adapterPhoto.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_menu, parent, false);
        return new adapterPhoto.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterPhoto.MyViewHolder holder, int position) {
        try {

            holder.myImage3.setImageResource(images[position]);
        } catch (NullPointerException e) {
            Log.e(TAG, "onBindViewHolder: Null Pointer: " + e.getMessage());
        }
    }

    @Override
    public int getItemCount() {
        {
            return images.length;
        }

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView myImage3;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myImage3 = itemView.findViewById(R.id.photo);
        }
    }
}