package info.hijoyprogmob.Favorite;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import info.hijoyprogmob.Account.Account;
import info.hijoyprogmob.Home.Home;
import info.hijoyprogmob.News.News;
import info.hijoyprogmob.R;
import info.hijoyprogmob.Search.Search;


public class Favorite extends AppCompatActivity {

    private ArrayList<CardListItemFav> mcardListItemFavs;

    private RecyclerView mRecyclerViewFav;
    private FavoriteAdapter mAdapterFav;
    private RecyclerView.LayoutManager mLayoutManagerFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        createCardListItemFav();
        buildRecyclerViewFav();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.favorit);

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
                        return true;
                    case R.id.news:
                        startActivity(new Intent(getApplicationContext(), News.class));
                        overridePendingTransition(0,0);
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

    public void removeItem(int position){
        mcardListItemFavs.remove(position);
        mAdapterFav.notifyItemRemoved(position);
    }

    public void createCardListItemFav(){
        mcardListItemFavs = new ArrayList<>();
        mcardListItemFavs.add(new CardListItemFav(
                R.drawable.kamera5,
                "Kamera Canon EOS M6",
                "Kamera Canon dengan sistem 9 Poin AF, LCD Touchsreen, Full HD video recording"));
        mcardListItemFavs.add(new CardListItemFav(
                R.drawable.kamera12,
                "Canon EOS 5DS R Body Only",
                "Product details of Canon EOS 5DS R Body Only - 50.6 MP - Hitam"));
        mcardListItemFavs.add(new CardListItemFav(
                R.drawable.lens4,
                "Lensa Canon EF 75-300mm F/4-5.6 III ",
                "Lensa tele zoom yang didesain untuk kamera DSLR"));
        mcardListItemFavs.add(new CardListItemFav(
                R.drawable.tripod4,
                "Lensa Canon EF 50mm F/1.8 STM",
                "Lensa yang dipasangkan dengan perangkat tambahan untuk sistem AF"));
        mcardListItemFavs.add(new CardListItemFav(
                R.drawable.baterai13,
                "Baterai Kamera Canon LP-E4 LP-E4N",
                "Baterai Kamera Canon LP-E4 LP-E4N (Replika 1:1) - Black"));
        mcardListItemFavs.add(new CardListItemFav(
                R.drawable.memory3,
                "Lexar SDHC UHS-I 633x (95Mbps) 16GB",
                "Kecepatan tinggi Lexar Professional 633x SDHC/SDXC UHS-I card secara dramatis mempercepat alur kerja"));
    }

    public void buildRecyclerViewFav() {
        mRecyclerViewFav = findViewById(R.id.recyclerview_fav);
        mRecyclerViewFav.setHasFixedSize(true);
        mLayoutManagerFav = new LinearLayoutManager(this);
        mAdapterFav = new FavoriteAdapter(mcardListItemFavs);

        mRecyclerViewFav.setLayoutManager(mLayoutManagerFav);
        mRecyclerViewFav.setAdapter(mAdapterFav);

        mAdapterFav.setOnItemClickListener(new FavoriteAdapter.OnItemClickListener(){
            @Override
            public void onDeleteClick(int position) {
                removeItem(position);
            }
        });
    }
}
