package info.hijoyprogmob.Home.Kategori.Lensa;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;

public class ActivityLensa extends AppCompatActivity {
    RecyclerView recyclerViewLens;
    String L1 [], L2 [], L3[];
    int imageLens[] ={R.drawable.lens1, R.drawable.lens2, R.drawable.lens3, R.drawable.lens5, R.drawable.lens6, R.drawable.lens7, R.drawable.lensa8, R.drawable.lensa9, R.drawable.lensa10, R.drawable.lensa11, R.drawable.lensa12, R.drawable.lensa13, R.drawable.lensa14, R.drawable.lensa15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lensa);
        recyclerViewLens = findViewById(R.id.recyclerViewLens);

        L1 = getResources().getStringArray(R.array.Lensa);
        L2 = getResources() .getStringArray(R.array.ringkasLensa);
        L3 = getResources().getStringArray(R.array.desLensa);

        AdapterLensa adapterLensa = new AdapterLensa(this, L1, L2, L3, imageLens);
        recyclerViewLens.setAdapter(adapterLensa);
        recyclerViewLens.setLayoutManager(new LinearLayoutManager(this));

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
