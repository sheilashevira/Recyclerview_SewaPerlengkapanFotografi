package info.hijoyprogmob.Home.Kategori.Battery;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;

public class ActivityBattery extends AppCompatActivity {
    RecyclerView recyclerViewBaterai;
    String b1 [], b2 [], b3[];
    int imageBaterai[] ={R.drawable.baterai1, R.drawable.baterai2, R.drawable.baterai3, R.drawable.baterai4, R.drawable.baterai5, R.drawable.baterai6, R.drawable.baterai7, R.drawable.baterai8, R.drawable.baterai9, R.drawable.baterai10, R.drawable.baterai11, R.drawable.baterai12, R.drawable.baterai13, R.drawable.baterai14, R.drawable.baterai15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);
        recyclerViewBaterai= findViewById(R.id.recyclerViewBaterai);

        b1 = getResources().getStringArray(R.array.Baterai);
        b2 = getResources() .getStringArray(R.array.ringkasBaterai);
        b3 = getResources().getStringArray(R.array.desBaterai);

        AdapterBattery adapterBattery= new AdapterBattery(this, b1, b2, b3, imageBaterai);
        recyclerViewBaterai.setAdapter(adapterBattery);
        recyclerViewBaterai.setLayoutManager(new LinearLayoutManager(this));

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
