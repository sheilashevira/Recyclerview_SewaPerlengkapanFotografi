package info.hijoyprogmob.Home.Kategori.Kamera;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;

public class ActivityKamera extends AppCompatActivity {
    RecyclerView recyclerViewKam;
    String k1 [], k2 [], k3[];
    int imageKam [] ={R.drawable.kamera1, R.drawable.kamera2, R.drawable.kamera3, R.drawable.kamera4, R.drawable.kamera5, R.drawable.kamera6, R.drawable.kamera7, R.drawable.kamera8, R.drawable.kamera9, R.drawable.kamera10, R.drawable.kamera11, R.drawable.kamera12, R.drawable.kamera13, R.drawable.kamera14, R.drawable.kamera15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamera);

        recyclerViewKam = findViewById(R.id.recyclerViewKam);

        k1 = getResources().getStringArray(R.array.Kamera);
        k2 = getResources() .getStringArray(R.array.ringkasKamera);
        k3 = getResources().getStringArray(R.array.desKamera);

        AdapterKamera adapterKamera = new AdapterKamera(this, k1, k2, k3, imageKam);
        recyclerViewKam.setAdapter(adapterKamera);
        recyclerViewKam.setLayoutManager(new LinearLayoutManager(this));

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
