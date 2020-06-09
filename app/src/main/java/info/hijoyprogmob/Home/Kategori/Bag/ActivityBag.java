package info.hijoyprogmob.Home.Kategori.Bag;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;

public class ActivityBag extends AppCompatActivity {
    RecyclerView recyclerViewBag;
    String bg1 [], bg2 [], bg3[];
    int imageBag[] ={R.drawable.tas1, R.drawable.tas2, R.drawable.tas3, R.drawable.tas4, R.drawable.tas5, R.drawable.tas6, R.drawable.tas7, R.drawable.tas8, R.drawable.tas9, R.drawable.tas10, R.drawable.tas11, R.drawable.tas12, R.drawable.tas13, R.drawable.tas14, R.drawable.tas15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag);
        recyclerViewBag= findViewById(R.id.recyclerviewtas);

        bg1 = getResources().getStringArray(R.array.Tas);
        bg2= getResources() .getStringArray(R.array.ringkasTas);
        bg3= getResources().getStringArray(R.array.desTas);

        AdapterBag adapterBag= new AdapterBag(this, bg1, bg2, bg3, imageBag);
        recyclerViewBag.setAdapter(adapterBag);
        recyclerViewBag.setLayoutManager(new LinearLayoutManager(this));

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
