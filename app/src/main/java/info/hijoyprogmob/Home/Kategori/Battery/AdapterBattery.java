package info.hijoyprogmob.Home.Kategori.Battery;

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

public class AdapterBattery extends RecyclerView.Adapter<AdapterBattery.ViewHolderBaterai>{
    String baterai1[], baterai2[], baterai3[];
    int gambarBaterai[];
    Context contBaterai;
    public AdapterBattery(Context ctBaterai, String b1[], String b2[], String b3[], int gmrBaterai[]){
        contBaterai= ctBaterai;
        baterai1= b1;
        baterai2= b2;
        baterai3= b3;
        gambarBaterai= gmrBaterai;
    }


    @NonNull
    @Override
    public AdapterBattery.ViewHolderBaterai onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contBaterai);
        View view = inflater.inflate(R.layout.tampil_battery, parent, false);

        return new ViewHolderBaterai(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBattery.ViewHolderBaterai holder, final int position) {
        holder.mytextBaterai.setText(baterai1[position]);
        holder.mytextRingkasBaterai.setText(baterai2[position]);
        holder.gambarBaterai.setImageResource(gambarBaterai[position]);

        holder.bateraiLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contBaterai, ActivityBattery2.class);
                intent.putExtra("baterai1", baterai1[position]);
                intent.putExtra("baterai3", baterai3[position]);
                intent.putExtra("gambarBaterai", gambarBaterai[position]);
                contBaterai.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambarBaterai.length;
    }

    public class ViewHolderBaterai extends RecyclerView.ViewHolder {
        TextView mytextBaterai, mytextRingkasBaterai;
        ImageView gambarBaterai;
        RelativeLayout bateraiLayout;

        public ViewHolderBaterai(@NonNull View itemView) {
            super(itemView);
            mytextBaterai= itemView.findViewById(R.id.namaBaterai);
            mytextRingkasBaterai= itemView.findViewById((R.id.ringkasBaterai));
            gambarBaterai= itemView.findViewById(R.id.imageBaterai);
            bateraiLayout = itemView.findViewById(R.id.bateraiLayout);

        }
    }
}
