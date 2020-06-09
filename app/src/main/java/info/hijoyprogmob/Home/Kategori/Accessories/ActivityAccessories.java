package info.hijoyprogmob.Home.Kategori.Accessories;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;


public class ActivityAccessories extends AppCompatActivity {
    RecyclerView recyclerViewAksesoris;
    String aks1 [], aks2 [], aks3[];
    int imageAksesoris[] ={R.drawable.aksesoris1, R.drawable.aksesoris2, R.drawable.aksesoris3, R.drawable.aksesoris4, R.drawable.aksesoris5, R.drawable.aksesoris6, R.drawable.aksesoris7, R.drawable.aksesoris8, R.drawable.aksesoris9, R.drawable.aksesoris10, R.drawable.aksesoris11, R.drawable.aksesoris12, R.drawable.aksesoris13, R.drawable.aksesoris14, R.drawable.aksesoris15, R.drawable.aksesoris16, R.drawable.aksesoris17, R.drawable.aksesoris18, R.drawable.aksesoris19};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories);
        recyclerViewAksesoris= findViewById(R.id.recyclerViewAksesoris);

        aks1 = getResources().getStringArray(R.array.Aksesoris);
        aks2 = getResources() .getStringArray(R.array.ringkasAksesoris);
        aks3 = getResources().getStringArray(R.array.desAksesoris);

        AdapterAccessories adapterAccessories = new AdapterAccessories(this, aks1, aks2, aks3, imageAksesoris);
        recyclerViewAksesoris.setAdapter(adapterAccessories);
        recyclerViewAksesoris.setLayoutManager(new LinearLayoutManager(this));

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
