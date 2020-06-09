package info.hijoyprogmob.News;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import info.hijoyprogmob.Account.Account;
import info.hijoyprogmob.Favorite.Favorite;
import info.hijoyprogmob.Home.Home;
import info.hijoyprogmob.R;
import info.hijoyprogmob.Search.Search;


public class News extends AppCompatActivity {
    RecyclerView recyclerViewNews;
    String n1 [], n2[], n3[];
    int imageNews[] = {R.drawable.news1,R.drawable.news2,R.drawable.news3, R.drawable.news4, R.drawable.news5, R.drawable.news6, R.drawable.news7, R.drawable.news8, R.drawable.news9, R.drawable.news10, R.drawable.news11, R.drawable.news12, R.drawable.news13, R.drawable.news14, R.drawable.news15, R.drawable.news16, R.drawable.news17, R.drawable.news18, R.drawable.news19, R.drawable.news20, R.drawable.news21};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        recyclerViewNews = findViewById(R.id.recyclerviewNews);

        n1 = getResources().getStringArray(R.array.titleNews);
        n2 = getResources().getStringArray(R.array.tglNews);
        n3 = getResources().getStringArray(R.array.descNews);

        AdapterNews adapterNews = new AdapterNews(this, n1, n2, n3, imageNews);
        recyclerViewNews.setAdapter(adapterNews);
        recyclerViewNews.setLayoutManager(new LinearLayoutManager(this));

        //Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.news);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(), Search.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favorit:
                        startActivity(new Intent(getApplicationContext(), Favorite.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.news:
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(), Account.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
