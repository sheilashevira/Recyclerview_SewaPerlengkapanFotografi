package info.hijoyprogmob.Home.Kategori.Bag;

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

public class AdapterBag extends RecyclerView.Adapter<AdapterBag.ViewHolderBag> {
    String tas1[], tas2[], tas3[];
    int gambarTas[];
    Context contTas;

    public AdapterBag(Context ctTas, String t1[], String t2[], String t3[], int gmrTas[]){
        contTas= ctTas;
        tas1= t1;
        tas2= t2;
        tas3= t3;
        gambarTas= gmrTas;
    }

    @NonNull
    @Override
    public ViewHolderBag onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contTas);
        View view = inflater.inflate(R.layout.tampil_bag, parent, false);

        return new ViewHolderBag(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderBag holder, final int position) {
        holder.mytextTas.setText(tas1[position]);
        holder.mytextRingkasTas.setText(tas2[position]);
        holder.gambarTas.setImageResource(gambarTas[position]);

        holder.tasLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contTas, ActivityBag2.class);
                intent.putExtra("tas1", tas1[position]);
                intent.putExtra("tas3", tas3[position]);
                intent.putExtra("gambarTas", gambarTas[position]);
                contTas.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambarTas.length;
    }

    public class ViewHolderBag extends RecyclerView.ViewHolder{
        TextView mytextTas, mytextRingkasTas;
        ImageView gambarTas;
        RelativeLayout tasLayout;

        public ViewHolderBag(@NonNull View itemView) {
            super(itemView);
            mytextTas= itemView.findViewById(R.id.namaTas);
            mytextRingkasTas= itemView.findViewById((R.id.ringkasTas));
            gambarTas= itemView.findViewById(R.id.imageTas);
            tasLayout= itemView.findViewById(R.id.bagLayout);

        }
    }
}