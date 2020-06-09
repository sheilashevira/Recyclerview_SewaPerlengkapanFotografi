package info.hijoyprogmob.Home.Kategori.Filter;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;

public class ActivityFilter extends AppCompatActivity {
    RecyclerView recyclerViewFilter;
    String ft1 [], ft2 [], ft3[];
    int imageFilter[] ={R.drawable.filter1, R.drawable.filter2, R.drawable.filter3, R.drawable.filter4, R.drawable.filter5, R.drawable.filter6, R.drawable.filter7, R.drawable.filter8, R.drawable.filter9, R.drawable.filter10, R.drawable.filter11, R.drawable.filter12, R.drawable.filter13, R.drawable.filter14, R.drawable.filter15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        recyclerViewFilter= findViewById(R.id.recyclerViewFilter);

        ft1 = getResources().getStringArray(R.array.Filter);
        ft2 = getResources() .getStringArray(R.array.ringkasfilter);
        ft3= getResources().getStringArray(R.array.desfilter);

        AdapterFilter adapterFilter= new AdapterFilter(this, ft1, ft2, ft3, imageFilter);
        recyclerViewFilter.setAdapter(adapterFilter);
        recyclerViewFilter.setLayoutManager(new LinearLayoutManager(this));

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
