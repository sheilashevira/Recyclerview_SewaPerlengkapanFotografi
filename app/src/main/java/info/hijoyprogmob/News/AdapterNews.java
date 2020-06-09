package info.hijoyprogmob.News;

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

public class AdapterNews extends RecyclerView.Adapter<AdapterNews.ViewHolderNews> {

    String news1 [], news2[], news3[];
    int[] gambarNews;
    Context contNews;

    public AdapterNews(Context ctNews, String n1[], String n2[], String n3[], int gmrNews[]){
        contNews = ctNews;
        news1 = n1;
        news2 = n2;
        news3 = n3;
        gambarNews = gmrNews;
    }

    @NonNull
    @Override
    public AdapterNews.ViewHolderNews onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contNews);
        View view = inflater.inflate(R.layout.item_news, parent, false);

        return new ViewHolderNews(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterNews.ViewHolderNews holder, final int position) {
        holder.mytitleNews.setText(news1[position]);
        holder.mytglNews.setText(news2[position]);
        holder.gambarNews.setImageResource(gambarNews[position]);

        holder.newsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contNews, DetailNews.class);
                intent.putExtra("news1", news1[position]);
                intent.putExtra("news2", news2[position]);
                intent.putExtra("news3", news3[position]);
                intent.putExtra("newsImageView", gambarNews[position]);
                contNews.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return gambarNews.length;
    }


    public class ViewHolderNews extends RecyclerView.ViewHolder{

        TextView mytitleNews, mytglNews;
        ImageView gambarNews;
        RelativeLayout newsLayout;

        public ViewHolderNews(@NonNull View itemView) {
            super(itemView);

            mytitleNews = itemView.findViewById(R.id.titleNews);
            mytglNews = itemView.findViewById(R.id.tglNews);
            gambarNews = itemView.findViewById(R.id.imageNews);
            newsLayout = itemView.findViewById(R.id.newsLayout);
        }
    }
}
