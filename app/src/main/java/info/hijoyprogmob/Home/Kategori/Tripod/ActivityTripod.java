package info.hijoyprogmob.Home.Kategori.Tripod;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;

public class ActivityTripod extends AppCompatActivity {

    RecyclerView recyclerViewTripod;
    String t1 [], t2 [], t3[];
    int imageTripod[] ={R.drawable.tripod1, R.drawable.tripod2, R.drawable.tripod3, R.drawable.tripod4, R.drawable.tripod5, R.drawable.tripod6, R.drawable.tripod7, R.drawable.tripod8, R.drawable.tripod9, R.drawable.tripod10, R.drawable.tripod11, R.drawable.tripod12, R.drawable.tripod13, R.drawable.tripod14, R.drawable.tripod15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tripod);

        recyclerViewTripod= findViewById(R.id.recyclerViewTripod);

        t1 = getResources().getStringArray(R.array.Tripod);
        t2 = getResources() .getStringArray(R.array.ringkasTripod);
        t3 = getResources().getStringArray(R.array.desTripod);

        AdapterTripod adapterLens = new AdapterTripod(this, t1, t2, t3, imageTripod);
        recyclerViewTripod.setAdapter(adapterLens);
        recyclerViewTripod.setLayoutManager(new LinearLayoutManager(this));

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
