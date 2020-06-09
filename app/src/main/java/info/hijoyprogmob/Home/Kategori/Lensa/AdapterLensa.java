package info.hijoyprogmob.Home.Kategori.Lensa;

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

public class AdapterLensa extends RecyclerView.Adapter<AdapterLensa.ViewHolderLens> {

    String lens1[], lens2[], lens3[];
    int gambarLens[];
    Context contLens;

    public AdapterLensa(Context ctLens, String L1[], String L2[], String L3[], int gmrLens[]){
        contLens = ctLens;
        lens1 = L1;
        lens2 = L2;
        lens3 = L3;
        gambarLens= gmrLens;
    }

    @NonNull
    @Override
    public ViewHolderLens onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contLens);
        View view = inflater.inflate(R.layout.tampil_lensa, parent, false);

        return new ViewHolderLens(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLens holder, final int position) {
        holder.mytextLens.setText(lens1[position]);
        holder.mytextRingkasLens.setText(lens2[position]);
        holder.gambarLens.setImageResource(gambarLens[position]);

        holder.lensLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(contLens, ActivityLensa2.class);
                intent.putExtra("lens1", lens1[position]);
                intent.putExtra("lens3", lens3[position]);
                intent.putExtra("gambarLens", gambarLens[position]);
                contLens.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return gambarLens.length;
    }

    public class ViewHolderLens extends RecyclerView.ViewHolder{

        TextView mytextLens, mytextRingkasLens;
        ImageView gambarLens;
        RelativeLayout lensLayout;


        public ViewHolderLens(@NonNull View itemView) {
            super(itemView);
            mytextLens = itemView.findViewById(R.id.namaLens);
            mytextRingkasLens = itemView.findViewById((R.id.ringkasLens));
            gambarLens= itemView.findViewById(R.id.imageLens);
            lensLayout = itemView.findViewById(R.id.lensLayout);
        }
    }
}
