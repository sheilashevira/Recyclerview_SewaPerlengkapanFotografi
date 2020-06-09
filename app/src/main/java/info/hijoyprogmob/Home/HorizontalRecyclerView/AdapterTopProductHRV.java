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


public class AdapterTopProductHRV extends RecyclerView.Adapter<AdapterTopProductHRV.ViewHolderTP> {
    String top1[], top2[], top3[];
    int gambarTP[];
    Context contTP;

    public AdapterTopProductHRV(Context ctTP, String tp1[], String tp2[], String tp3[], int imageTP[]) {
        contTP = ctTP;
        top1 = tp1;
        top2 = tp2;
        top3 = tp3;
        gambarTP = imageTP;
    }

    @NonNull
    @Override
    public AdapterTopProductHRV.ViewHolderTP onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contTP);
        View view = inflater.inflate(R.layout.item_tp_hrv, parent, false);

        return new ViewHolderTP(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTopProductHRV.ViewHolderTP holder, final int position) {
        holder.mytextTP.setText(top1[position]);
        holder.myringkasTP.setText(top2[position]);
        holder.gambarTP.setImageResource(gambarTP[position]);

        holder.tpLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contTP, DetailTopProductHRV.class);
                intent.putExtra("top1", top1[position]);
                intent.putExtra("top3", top3[position]);
                intent.putExtra("gambarTP", gambarTP[position]);
                contTP.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return gambarTP.length;
    }

    public class ViewHolderTP extends RecyclerView.ViewHolder{

        TextView mytextTP, myringkasTP;
        ImageView gambarTP;
        RelativeLayout tpLayout;

        public ViewHolderTP(@NonNull View itemView) {
            super(itemView);

            mytextTP = itemView.findViewById(R.id.namaProduk);
            myringkasTP = itemView.findViewById(R.id.ringkasProduk);
            gambarTP = itemView.findViewById(R.id.imageProduk);
            tpLayout = itemView.findViewById(R.id.tpLayout);
        }
    }
}
