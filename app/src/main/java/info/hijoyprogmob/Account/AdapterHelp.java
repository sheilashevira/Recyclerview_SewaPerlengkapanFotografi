package info.hijoyprogmob.Account;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;

public class AdapterHelp extends RecyclerView.Adapter<AdapterHelp.ViewHolderHelp> {
    String help1[], help2[];
    Context contHelp;

    public AdapterHelp(Context ctH, String h1[], String h2[]){
        contHelp = ctH;
        help1 = h1;
        help2 = h2;
    }

    @NonNull
    @Override
    public ViewHolderHelp onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contHelp);
        View view = inflater.inflate(R.layout.tampil_help, parent, false);

        return new ViewHolderHelp(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHelp holder, final int position) {
        holder.mytextHelp.setText(help1[position]);
        holder.helpLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contHelp, Help1.class);
                intent.putExtra("help1", help1[position]);
                intent.putExtra("help2", help2[position]);
                contHelp.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return help1.length;
    }

    public class ViewHolderHelp extends RecyclerView.ViewHolder{
        TextView mytextHelp, myJudulHelp;
        ConstraintLayout helpLayout;

        public ViewHolderHelp(@NonNull View itemView) {
            super(itemView);
            mytextHelp = itemView.findViewById(R.id.texttanya);
            myJudulHelp = itemView.findViewById(R.id.pertanyaantext);
            helpLayout = itemView.findViewById(R.id.helplay);
        }
    }
}
