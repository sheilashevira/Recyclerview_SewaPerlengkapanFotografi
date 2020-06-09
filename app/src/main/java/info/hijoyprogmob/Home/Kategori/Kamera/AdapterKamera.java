package info.hijoyprogmob.Home.Kategori.Kamera;

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

public class AdapterKamera extends RecyclerView.Adapter<AdapterKamera.ViewHolderKam> {

    String kam1[], kam2[], kam3[];
    int gambarKam[];
    Context contKam;

    public AdapterKamera(Context ctKam, String k1[], String k2[], String k3[], int gmrKam[]){
        contKam = ctKam;
        kam1 = k1;
        kam2 = k2;
        kam3 = k3;
        gambarKam = gmrKam;
    }

    @NonNull
    @Override
    public ViewHolderKam onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contKam);
        View view = inflater.inflate(R.layout.tampil_kamera, parent, false);

        return new ViewHolderKam(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderKam holder, final int position) {
        holder.mytextKam.setText(kam1[position]);
        holder.mytextRingkas.setText(kam2[position]);
        holder.gambarKam.setImageResource(gambarKam[position]);

        holder.kamLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contKam, ActivityKamera2.class);
                intent.putExtra("kam1", kam1[position]);
                intent.putExtra("kam3", kam3[position]);
                intent.putExtra("kamImageView", gambarKam[position]);
                contKam.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return gambarKam.length;
    }

    public class ViewHolderKam extends RecyclerView.ViewHolder{

        TextView mytextKam, mytextRingkas;
        ImageView gambarKam;
        RelativeLayout kamLayout;


        public ViewHolderKam(@NonNull View itemView) {
            super(itemView);
            mytextKam = itemView.findViewById(R.id.namaKam);
            mytextRingkas = itemView.findViewById((R.id.ringkasKam));
            gambarKam = itemView.findViewById(R.id.imageKam);
            kamLayout = itemView.findViewById(R.id.kamLayout);
        }
    }
}
