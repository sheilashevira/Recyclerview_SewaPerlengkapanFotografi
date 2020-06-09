package info.hijoyprogmob.Home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import info.hijoyprogmob.Account.Account;
import info.hijoyprogmob.Favorite.Favorite;
import info.hijoyprogmob.Home.HorizontalRecyclerView.AdapterRecProductHRV;
import info.hijoyprogmob.Home.HorizontalRecyclerView.AdapterTopProductHRV;
import info.hijoyprogmob.Home.ImageSlider.DetailImageSlider1;
import info.hijoyprogmob.Home.ImageSlider.DetailImageSlider2;
import info.hijoyprogmob.Home.ImageSlider.DetailImageSlider3;
import info.hijoyprogmob.Home.ImageSlider.DetailImageSlider4;
import info.hijoyprogmob.Home.Kategori.Accessories.ActivityAccessories;
import info.hijoyprogmob.Home.Kategori.Bag.ActivityBag;
import info.hijoyprogmob.Home.Kategori.Battery.ActivityBattery;
import info.hijoyprogmob.Home.Kategori.Filter.ActivityFilter;
import info.hijoyprogmob.Home.Kategori.Flash.ActivityFlash;
import info.hijoyprogmob.Home.Kategori.Kamera.ActivityKamera;
import info.hijoyprogmob.Home.Kategori.Lensa.ActivityLensa;
import info.hijoyprogmob.Home.Kategori.Memory.ActivityMemory;
import info.hijoyprogmob.Home.Kategori.Tripod.ActivityTripod;
import info.hijoyprogmob.News.News;
import info.hijoyprogmob.R;
import info.hijoyprogmob.Search.Search;

public class Home extends AppCompatActivity {

    //RecyclerView Horizontal
    RecyclerView recyclerViewRP;
    String rp1[], rp2[], rp3[];
    int imageRP[] = {R.drawable.kamera3, R.drawable.lens3, R.drawable.tripod3, R.drawable.baterai3, R.drawable.memory3, R.drawable.flash3, R.drawable.filter3, R.drawable.tas3, R.drawable.aksesoris3};

    RecyclerView recyclerViewTP;
    String tp1[], tp2[], tp3[];
    int imageTP[] = {R.drawable.aksesoris2, R.drawable.baterai2, R.drawable.filter2, R.drawable.flash2, R.drawable.kamera2, R.drawable.lens2, R.drawable.memory2, R.drawable.tas2, R.drawable.tripod2};


    //Punya Image Slider
    SliderLayout sliderLayout;


    //Punya Grid Kategori
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Image Slider
        sliderLayout = findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(1);
        setSliderViews();


        //Grid Kategori
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);


        //Horizontal RecyclerView Top Product
        recyclerViewTP = findViewById(R.id.recyclerViewTP);

        tp1 = getResources().getStringArray(R.array.topProduct);
        tp2 = getResources().getStringArray(R.array.ringkastopProduct);
        tp3 = getResources().getStringArray(R.array.destopProduct);

        LinearLayoutManager linearLayoutManagerTP = new LinearLayoutManager(this);
        linearLayoutManagerTP.setOrientation(LinearLayoutManager.HORIZONTAL);

        AdapterTopProductHRV adapterTopProduct = new AdapterTopProductHRV(this, tp1, tp2, tp3, imageTP);
        recyclerViewTP.setAdapter(adapterTopProduct);
        recyclerViewTP.setLayoutManager(linearLayoutManagerTP);


        //Horizontal RecyclerView Recommended Product
        recyclerViewRP = findViewById(R.id.recyclerViewRP);

        rp1 = getResources().getStringArray(R.array.recProduct);
        rp2 = getResources().getStringArray(R.array.ringkasrecProduct);
        rp3 = getResources().getStringArray(R.array.desrecProduct);

        LinearLayoutManager linearLayoutManagerRP = new LinearLayoutManager(this);
        linearLayoutManagerRP.setOrientation(LinearLayoutManager.HORIZONTAL);

        AdapterRecProductHRV adapterRecProduct = new AdapterRecProductHRV(this, rp1, rp2, rp3, imageRP);
        recyclerViewRP.setAdapter(adapterRecProduct);
        recyclerViewRP.setLayoutManager(linearLayoutManagerRP);


        //Video View How It Works
        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);


        //Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
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


    //Punya Image Slider
    private void setSliderViews() {
        for (int i = 0; i<=3; i++){

            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i){
                case 0:
                    sliderView.setImageUrl ("https://4.bp.blogspot.com/-N7Ut-MxUwRQ/WvQQEVfh8EI/AAAAAAAABkw/jkfkGfDoTrsr96b_cDyRFQoBx-_Igd1YwCLcBGAs/s1600/Lensa%2BNikon.jpg");
                    sliderView.setDescription("Cara Mengganti Lensa DSLR Secara Aman & Cepat");
                    break;
                case 1:
                    sliderView.setImageUrl ("https://cdn.idntimes.com/content-images/post/20170123/4-15c4a6e2ba44a58fa96b82c7dcacbc66.jpg");
                    sliderView.setDescription("Cara Memperbaiki Kamera Nikon Yang Rusak Akibat Air");
                    break;
                case 2:
                    sliderView.setImageUrl ("https://content.shopback.com/id/wp-content/uploads/2017/11/03183422/Cara-menggunakan-kamera-dslr-canon.jpeg");
                    sliderView.setDescription("10 Teknik dan Cara Menggunakan Kamera DSLR Canon Bagi Newbie");
                    break;
                case 3:
                    sliderView.setImageUrl ("https://www.wikihow.com/images_en/thumb/8/8b/Attach-a-Camera-to-a-Tripod-Step-3-Version-4.jpg/550px-nowatermark-Attach-a-Camera-to-a-Tripod-Step-3-Version-4.jpg.webp");
                    sliderView.setDescription("Cara Memasang Kamera ke Tripod: 10 Langkah Mudah");
                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            final int finalI = i;
            sliderView.setOnSliderClickListener (new SliderView.OnSliderClickListener(){
                public void onSliderClick(SliderView sliderView1){
                    if (finalI == 0){
                        Intent intent = new Intent(Home.this, DetailImageSlider1.class);
                        startActivity(intent);
                    }else if(finalI == 1){
                        Intent intent = new Intent(Home.this, DetailImageSlider2.class);
                        startActivity(intent);
                    }else if(finalI == 2){
                        Intent intent = new Intent(Home.this, DetailImageSlider3.class);
                        startActivity(intent);
                    }else if(finalI == 3){
                        Intent intent = new Intent(Home.this, DetailImageSlider4.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(Home.this,"None !", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            sliderLayout.addSliderView(sliderView);
        }
    }

    //Punya Grid Kategori
    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            final int finalI1 = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Home.this,"Halo Kategori",Toast.LENGTH_SHORT).show();

                    if(finalI1 == 0){
                     Intent intent = new Intent(Home.this, ActivityKamera.class);
                     startActivity(intent);
                    }else if(finalI1 == 1){
                     Intent intent = new Intent(Home.this, ActivityLensa.class);
                     startActivity(intent);
                     }else if(finalI1 == 2){
                     Intent intent = new Intent(Home.this, ActivityTripod.class);
                     startActivity(intent);
                     }else if(finalI1 == 3){
                     Intent intent = new Intent(Home.this, ActivityBattery.class);
                     startActivity(intent);
                     }else if(finalI1 == 4){
                     Intent intent = new Intent(Home.this, ActivityMemory.class);
                     startActivity(intent);
                     }else if(finalI1 == 5){
                     Intent intent = new Intent(Home.this, ActivityFlash.class);
                     startActivity(intent);
                     }else if(finalI1 == 6){
                     Intent intent = new Intent(Home.this, ActivityFilter.class);
                     startActivity(intent);
                     }else if(finalI1 == 7){
                     Intent intent = new Intent(Home.this, ActivityBag.class);
                     startActivity(intent);
                     }else if(finalI1 == 8){
                     Intent intent = new Intent(Home.this, ActivityAccessories.class);
                     startActivity(intent);
                     }else{
                     Toast.makeText(Home.this,"Please set activity for this card item",Toast.LENGTH_SHORT).show();
                     }
                }
            });
        }
    }

}
