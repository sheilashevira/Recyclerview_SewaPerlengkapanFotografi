package info.hijoyprogmob.Home.Kategori.Flash;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;

public class ActivityFlash extends AppCompatActivity {
    RecyclerView recyclerviewFlash;
    String f1 [], f2 [], f3[];
    int imageFlash[] ={R.drawable.flash1, R.drawable.flash2, R.drawable.flash3, R.drawable.flash4, R.drawable.flash5, R.drawable.flash6, R.drawable.flash7, R.drawable.flash8, R.drawable.flash9, R.drawable.flash10, R.drawable.flash11, R.drawable.flash12, R.drawable.flash13, R.drawable.flash14, R.drawable.flash15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        recyclerviewFlash= findViewById(R.id.recyclerviewFlash);

        f1 = getResources().getStringArray(R.array.Flash);
        f2 = getResources() .getStringArray(R.array.ringkasFlash);
        f3 = getResources().getStringArray(R.array.desFlash);

        AdapterFlash adapterFlash= new AdapterFlash(this, f1, f2, f3, imageFlash);
        recyclerviewFlash.setAdapter(adapterFlash);
        recyclerviewFlash.setLayoutManager(new LinearLayoutManager(this));

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
