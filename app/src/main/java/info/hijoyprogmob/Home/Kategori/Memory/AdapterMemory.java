package info.hijoyprogmob.Home.Kategori.Memory;

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

public class AdapterMemory extends RecyclerView.Adapter<AdapterMemory.ViewHolderMemo> {
    String Memo1[], Memo2[], Memo3[];
    int gambarMemo[];
    Context contMemo;
    public AdapterMemory(Context ctFlash, String m1[], String m2[], String m3[], int gmrMemo[]) {
        contMemo = ctFlash;
        Memo1= m1;
        Memo2 = m2;
        Memo3 = m3;
        gambarMemo= gmrMemo;
    }

    @NonNull
    @Override
    public ViewHolderMemo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contMemo);
        View view = inflater.inflate(R.layout.tampil_memory, parent, false);

        return new ViewHolderMemo(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMemo holder, final int position) {
        holder.mytextMemo.setText(Memo1[position]);
        holder.mytextRingkasMemo.setText(Memo2[position]);
        holder.gambarMemo.setImageResource(gambarMemo[position]);


        holder.memoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contMemo, ActivityMemory2.class);
                intent.putExtra("memo1", Memo1[position]);
                intent.putExtra("memo3", Memo3[position]);
                intent.putExtra("gambarMemo", gambarMemo[position]);
                contMemo.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambarMemo.length;
    }

    public class ViewHolderMemo extends RecyclerView.ViewHolder {
        TextView mytextMemo, mytextRingkasMemo;
        ImageView gambarMemo;
        RelativeLayout memoLayout;

        public ViewHolderMemo(@NonNull View itemView) {
            super(itemView);
            mytextMemo= itemView.findViewById(R.id.namaMemo);
            mytextRingkasMemo= itemView.findViewById((R.id.ringkasMemo));
            gambarMemo= itemView.findViewById(R.id.imageMemo);
            memoLayout= itemView.findViewById(R.id.memoLayout);
        }
    }
}
