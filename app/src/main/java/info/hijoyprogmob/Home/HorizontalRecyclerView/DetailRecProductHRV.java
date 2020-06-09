package info.hijoyprogmob.Home.HorizontalRecyclerView;

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
import info.hijoyprogmob.Rent.RentHome;

public class DetailRecProductHRV extends AppCompatActivity {
    ImageView rpImageView;
    TextView namaRP, desRP;
    String rec1, rec3;
    int rpImage;

    private Button sewaRP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rec_product_hrv);
        rpImageView = findViewById(R.id.rpImageView);
        namaRP = findViewById(R.id.namaRP);
        desRP = findViewById(R.id.desRP);

        sewaRP = (Button)findViewById(R.id.sewaRP);
        sewaRP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailRecProductHRV.this, RentHome.class);
                startActivity(intent);
            }
        });

        getData();
        setData();

        //nampilin tombol back di toolbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void getData() {
        if (
                getIntent().hasExtra("gambarRP")&&
                        getIntent().hasExtra("rec1")&&
                        getIntent().hasExtra("rec3")){
            rec1 = getIntent().getStringExtra("rec1");
            rec3 = getIntent().getStringExtra("rec3");
            rpImage = getIntent().getIntExtra("gambarRP",1);
        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        namaRP.setText(rec1);
        desRP.setText(rec3);
        rpImageView.setImageResource(rpImage);
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
