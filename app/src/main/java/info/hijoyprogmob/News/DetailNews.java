package info.hijoyprogmob.News;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import info.hijoyprogmob.R;

public class DetailNews extends AppCompatActivity {
    ImageView newsImageView;
    TextView titleNews, tglNews, descNews;
    String news1, news2, news3;
    int newsImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);
        newsImageView = findViewById(R.id.newsImageView);
        titleNews = findViewById(R.id.titleNews);
        tglNews = findViewById(R.id.tglNews);
        descNews = findViewById(R.id.descNews);

        getData();
        setData();

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void getData() {
        if(
                getIntent().hasExtra("newsImageView")&&
                        getIntent().hasExtra("news1")&&
                        getIntent().hasExtra("news2")&&
                        getIntent().hasExtra("news3")){
            news1 = getIntent().getStringExtra("news1");
            news2 = getIntent().getStringExtra("news2");
            news3 = getIntent().getStringExtra("news3");
            newsImage = getIntent().getIntExtra("newsImageView",1);
        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        titleNews.setText(news1);
        tglNews.setText(news2);
        descNews.setText(news3);
        newsImageView.setImageResource(newsImage);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}