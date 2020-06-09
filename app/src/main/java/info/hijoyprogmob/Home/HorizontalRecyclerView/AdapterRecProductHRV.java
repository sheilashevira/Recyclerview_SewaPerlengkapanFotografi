package info.hijoyprogmob.Home.HorizontalRecyclerView;

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


public class AdapterRecProductHRV extends RecyclerView.Adapter<AdapterRecProductHRV.ViewHolderRP> {
    String rec1[], rec2[], rec3[];
    int gambarRP[];
    Context contRP;

    public AdapterRecProductHRV(Context ctRP, String rp1[], String rp2[], String rp3[], int imageRP[]) {
        contRP = ctRP;
        rec1 = rp1;
        rec2 = rp2;
        rec3 = rp3;
        gambarRP = imageRP;
    }

    @NonNull
    @Override
    public AdapterRecProductHRV.ViewHolderRP onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contRP);
        View view = inflater.inflate(R.layout.item_rp_hrv, parent, false);

        return new ViewHolderRP(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecProductHRV.ViewHolderRP holder, final int position) {
        holder.mytextRP.setText(rec1[position]);
        holder.myringkasRP.setText(rec2[position]);
        holder.gambarRP.setImageResource(gambarRP[position]);

        holder.rpLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contRP, DetailRecProductHRV.class);
                intent.putExtra("rec1", rec1[position]);
                intent.putExtra("rec3", rec3[position]);
                intent.putExtra("gambarRP", gambarRP[position]);
                contRP.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambarRP.length;
    }

    public class ViewHolderRP extends RecyclerView.ViewHolder{
        TextView mytextRP, myringkasRP;
        ImageView gambarRP;
        RelativeLayout rpLayout;

        public ViewHolderRP(@NonNull View itemView) {
            super(itemView);
            mytextRP = itemView.findViewById(R.id.namaProduk);
            myringkasRP = itemView.findViewById(R.id.ringkasProduk);
            gambarRP = itemView.findViewById(R.id.imageProduk);
            rpLayout = itemView.findViewById(R.id.rpLayout);
        }
    }
}
