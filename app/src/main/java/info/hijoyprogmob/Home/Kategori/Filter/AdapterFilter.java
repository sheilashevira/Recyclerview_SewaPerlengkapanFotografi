package info.hijoyprogmob.Home.Kategori.Filter;

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

public class AdapterFilter extends RecyclerView.Adapter<AdapterFilter.ViewHolderFilter> {
    int gambarFilter[];
    String filter1[], filter2[], filter3[];
    Context contFilter;

    public AdapterFilter(Context ctFilter, String ft1[], String ft2[], String ft3[], int gmrFilter[]){
        contFilter= ctFilter;
        filter1= ft1;
        filter2= ft2;
        filter3= ft3;
        gambarFilter= gmrFilter;
    }

    @NonNull
    @Override
    public ViewHolderFilter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contFilter);
        View view = inflater.inflate(R.layout.tampil_filter, parent, false);

        return new ViewHolderFilter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFilter holder, final int position) {
        holder.mytextFilter.setText(filter1[position]);
        holder.mytextRingkasFilter.setText(filter2[position]);
        holder.gambarFilter.setImageResource(gambarFilter[position]);

        holder.filterLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contFilter, ActivityFilter2.class);
                intent.putExtra("filter1", filter1[position]);
                intent.putExtra("filter3", filter3[position]);
                intent.putExtra("gambarFilter", gambarFilter[position]);
                contFilter.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambarFilter.length;
    }

    public class ViewHolderFilter extends RecyclerView.ViewHolder {
        TextView mytextFilter, mytextRingkasFilter;
        ImageView gambarFilter;
        RelativeLayout filterLayout;

        public ViewHolderFilter(@NonNull View itemView) {
            super(itemView);
            mytextFilter= itemView.findViewById(R.id.namaFilter);
            mytextRingkasFilter= itemView.findViewById((R.id.ringkasFilter));
            gambarFilter= itemView.findViewById(R.id.imageFilter);
            filterLayout = itemView.findViewById(R.id.filterLayout);
        }
    }
}
