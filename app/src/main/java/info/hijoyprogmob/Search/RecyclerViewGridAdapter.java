package info.hijoyprogmob.Search;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import info.hijoyprogmob.R;

public class RecyclerViewGridAdapter extends RecyclerView.Adapter<RecyclerViewGridAdapter.MyViewHolder>{

    private Context nContext;
    private List<Produk> nData;

    public RecyclerViewGridAdapter(Context nContext, List<Produk> nData) {
        this.nContext = nContext;
        this.nData = nData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater nInflater = LayoutInflater.from(nContext);
        view = nInflater.inflate(R.layout.cardview_item_menu_search, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_title.setText(nData.get(position).getTitle());
        holder.tv_description.setText(nData.get(position).getDescription());
        holder.iv_images.setImageResource(nData.get(position).getImages());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(nContext, DetailSearchActivity.class);

                intent.putExtra("Title",nData.get(position).getTitle());
                intent.putExtra("Description",nData.get(position).getDescription());
                intent.putExtra("Images",nData.get(position).getImages());
                nContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return nData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_title;
        TextView tv_description;
        ImageView iv_images;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title = (TextView) itemView.findViewById(R.id.title_product);
            tv_description = (TextView) itemView.findViewById(R.id.description_product);
            iv_images = (ImageView) itemView.findViewById(R.id.images_product);
            cardView = (CardView) itemView.findViewById(R.id.cardview);
        }
    }
}