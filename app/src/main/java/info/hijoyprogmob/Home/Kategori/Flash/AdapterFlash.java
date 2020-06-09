package info.hijoyprogmob.Home.Kategori.Flash;

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

public class AdapterFlash extends RecyclerView.Adapter<AdapterFlash.ViewHolderFlash> {
    String flash1[], flash2[], flash3[];
    int gambarFlash[];
    Context contFlash;

    public AdapterFlash(Context ctFlash, String f1[], String f2[], String f3[], int gmrFlash[]) {
        contFlash = ctFlash;
        flash1 = f1;
        flash2 = f2;
        flash3 = f3;
        gambarFlash = gmrFlash;
    }

    @NonNull
    @Override
    public ViewHolderFlash onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contFlash);
        View view = inflater.inflate(R.layout.tampil_flash, parent, false);

        return new ViewHolderFlash(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFlash holder, final int position) {
        holder.mytextFlash.setText(flash1[position]);
        holder.mytextRingkasFlash.setText(flash2[position]);
        holder.gambarFlash.setImageResource(gambarFlash[position]);

        holder.flashLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contFlash, ActivityFlash2.class);
                intent.putExtra("flash1", flash1[position]);
                intent.putExtra("flash3", flash3[position]);
                intent.putExtra("gambarFlash", gambarFlash[position]);
                contFlash.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambarFlash.length;
    }

    public class ViewHolderFlash extends RecyclerView.ViewHolder {
        TextView mytextFlash, mytextRingkasFlash;
        ImageView gambarFlash;
        RelativeLayout flashLayout;

        public ViewHolderFlash(@NonNull View itemView) {
            super(itemView);
            mytextFlash= itemView.findViewById(R.id.namaFlash);
            mytextRingkasFlash= itemView.findViewById((R.id.ringkasFlash));
            gambarFlash= itemView.findViewById(R.id.imageFlash);
            flashLayout= itemView.findViewById(R.id.flashLayout);
        }
    }
}