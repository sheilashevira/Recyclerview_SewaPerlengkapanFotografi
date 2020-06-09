package info.hijoyprogmob.Favorite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import info.hijoyprogmob.R;

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.FavoriteViewHolder> {
    private ArrayList<CardListItemFav> mcardListItemFav;
    private OnItemClickListener mListener;

    public interface  OnItemClickListener{
        void onDeleteClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public static class FavoriteViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageViewFav;
        public TextView mProdukFav;
        public TextView mDescFav;
        public ImageView mDelete;

        public FavoriteViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageViewFav = itemView.findViewById(R.id.image_fav);
            mProdukFav = itemView.findViewById(R.id.produk_fav);
            mDescFav = itemView.findViewById(R.id.desproduk_fav);
            mDelete = itemView.findViewById(R.id.delete);

            mDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onDeleteClick(position);
                        }
                    }
                }
            });
        }
    }

    public FavoriteAdapter(ArrayList<CardListItemFav> cardListItemFav) {
        mcardListItemFav = cardListItemFav;
    }


    @NonNull
    @Override
    public FavoriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_list_item_fav,parent,false);
        FavoriteViewHolder fvh = new FavoriteViewHolder(v, mListener);
        return fvh;
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteViewHolder holder, int position){
        CardListItemFav currentItem = mcardListItemFav.get(position);

        holder.mImageViewFav.setImageResource(currentItem.getImageResource());
        holder.mProdukFav.setText(currentItem.getmProdukFav());
        holder.mDescFav.setText(currentItem.getmDesFav());
    }

    @Override
    public int getItemCount() {
        return mcardListItemFav.size();
    }
}
