package info.hijoyprogmob.Home.Kategori.Tripod;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;

public class AdapterTripod extends RecyclerView.Adapter<AdapterTripod.ViewHolderTripod> {

    String tripod1[], tripod2[], tripod3[];
    int gambarTripod[];
    Context contTripod;

    public AdapterTripod(Context ctTripod, String t1[], String t2[], String t3[], int gmrTripod[]){
        contTripod= ctTripod;
        tripod1= t1;
        tripod2= t2;
        tripod3= t3;
        gambarTripod= gmrTripod;
    }

    @NonNull
    @Override
    public ViewHolderTripod onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contTripod);
        View view = inflater.inflate(R.layout.tampil_tripod, parent, false);

        return new ViewHolderTripod(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTripod holder, final int position) {
        holder.mytextTripod.setText(tripod1[position]);
        holder.mytextRingkasTripod.setText(tripod2[position]);
        holder.gambarTripod.setImageResource(gambarTripod[position]);

        holder.tripodLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contTripod, ActivityTripod2.class);
                intent.putExtra("tripod1", tripod1[position]);
                intent.putExtra("tripod3", tripod3[position]);
                intent.putExtra("gambarTripod", gambarTripod[position]);
                contTripod.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return gambarTripod.length;
    }

    public class ViewHolderTripod extends RecyclerView.ViewHolder{

        TextView mytextTripod, mytextRingkasTripod;
        ImageView gambarTripod;
        RelativeLayout tripodLayout;

        public ViewHolderTripod(@NonNull View itemView) {
            super(itemView);
            mytextTripod= itemView.findViewById(R.id.namaTripod);
            mytextRingkasTripod = itemView.findViewById((R.id.ringkasTripod));
            gambarTripod= itemView.findViewById(R.id.imageTripod);
            tripodLayout = itemView.findViewById(R.id.tripodLayout);
        }
    }
}
