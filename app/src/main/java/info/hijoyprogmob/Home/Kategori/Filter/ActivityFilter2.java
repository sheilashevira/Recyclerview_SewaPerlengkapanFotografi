package info.hijoyprogmob.Home.Kategori.Filter;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import info.hijoyprogmob.R;
import info.hijoyprogmob.Rent.RentFilter;

public class ActivityFilter2 extends AppCompatActivity {
    ImageView filterImageView;
    TextView namaFilter, desFilter;
    String filter1, filter3;
    int filterImage;

    private Button sewaFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter2);
        filterImageView= findViewById(R.id.filterImageView);
        namaFilter = findViewById(R.id.namaFilter);
        desFilter = findViewById(R.id.desFilter);

        sewaFilter = (Button)findViewById(R.id.sewaFilter);

        sewaFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFilter2.this, RentFilter.class);
                startActivity(intent);
            }
        });


        getData();
        setData();

        //nampilin tombol back di toolbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void getData(){
        if(getIntent().hasExtra("gambarFilter") && getIntent().hasExtra("filter1") && getIntent().hasExtra("filter3")){
            filter1 = getIntent().getStringExtra("filter1");
            filter3= getIntent().getStringExtra("filter3");
            filterImage = getIntent().getIntExtra("gambarFilter", 1);

        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        namaFilter.setText(filter1);
        desFilter.setText(filter3);
        filterImageView.setImageResource(filterImage);
    }

    //buat kembali ke activity parent
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
