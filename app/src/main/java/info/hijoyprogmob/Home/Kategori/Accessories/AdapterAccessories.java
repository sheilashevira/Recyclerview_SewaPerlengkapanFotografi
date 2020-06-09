package info.hijoyprogmob.Home.Kategori.Accessories;

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

public class AdapterAccessories extends RecyclerView.Adapter<AdapterAccessories.ViewHolderAccessories> {

    String aksesoris1[], aksesoris2[], aksesoris3[];
    int gambarAksesoris[];
    Context contAksesoris;

    public AdapterAccessories(Context ctAksesrois, String aks1[], String aks2[], String aks3[], int gmrAksesoris[]){
        contAksesoris= ctAksesrois;
        aksesoris1= aks1;
        aksesoris2= aks2;
        aksesoris3= aks3;
        gambarAksesoris= gmrAksesoris;
    }

    @NonNull
    @Override
    public ViewHolderAccessories onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contAksesoris);
        View view = inflater.inflate(R.layout.tampil_accessories, parent, false);

        return new ViewHolderAccessories(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAccessories holder, final int position) {
        holder.mytextAksesoris.setText(aksesoris1[position]);
        holder.mytextRingkasAksesoris.setText(aksesoris2[position]);
        holder.gambarAksesoris.setImageResource(gambarAksesoris[position]);

        holder.aksesorisLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contAksesoris, ActivityAccessories2.class);
                intent.putExtra("aksesoris1", aksesoris1[position]);
                intent.putExtra("aksesoris3", aksesoris3[position]);
                intent.putExtra("gambarAksesoris", gambarAksesoris[position]);
                contAksesoris.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return gambarAksesoris.length;
    }

    public class ViewHolderAccessories extends RecyclerView.ViewHolder{

        TextView mytextAksesoris, mytextRingkasAksesoris;
        ImageView gambarAksesoris;
        RelativeLayout aksesorisLayout;

        public ViewHolderAccessories(@NonNull View itemView) {
            super(itemView);
            mytextAksesoris= itemView.findViewById(R.id.namaAksesoris);
            mytextRingkasAksesoris = itemView.findViewById((R.id.ringkasAksesoris));
            gambarAksesoris= itemView.findViewById(R.id.imageAksesoris);
            aksesorisLayout = itemView.findViewById(R.id.aksesorisLayout);
        }
    }
}