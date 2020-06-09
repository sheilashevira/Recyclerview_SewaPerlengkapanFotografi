package info.hijoyprogmob.Home.Kategori.Memory;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;

public class ActivityMemory extends AppCompatActivity {
    RecyclerView recyclerviewMemo;
    String m1 [], m2 [], m3[];
    int imageFlash[] ={R.drawable.memory1, R.drawable.memory2, R.drawable.memory3, R.drawable.memory4, R.drawable.memory5, R.drawable.memory6, R.drawable.memory7, R.drawable.memory8, R.drawable.memory9, R.drawable.memory10, R.drawable.memory11, R.drawable.memory12, R.drawable.memory13, R.drawable.memory14, R.drawable.memory15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
        recyclerviewMemo= findViewById(R.id.recyclerviewMemori);

        m1 = getResources().getStringArray(R.array.Memo);
        m2 = getResources() .getStringArray(R.array.ringkasMemo);
        m3 = getResources().getStringArray(R.array.desMemo);

        AdapterMemory adapterMemory= new AdapterMemory(this, m1, m2, m3, imageFlash);
        recyclerviewMemo.setAdapter(adapterMemory);
        recyclerviewMemo.setLayoutManager(new LinearLayoutManager(this));

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
