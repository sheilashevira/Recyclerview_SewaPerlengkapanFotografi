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


public class DetailTopProductHRV extends AppCompatActivity {
    ImageView tpImageView;
    TextView namaTP, desTP;
    String top1, top3;
    int tpImage;

    private Button sewaTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_top_product_hrv);
        tpImageView = findViewById(R.id.tpImageView);
        namaTP = findViewById(R.id.namaTP);
        desTP = findViewById(R.id.desTP);

        sewaTP = (Button)findViewById(R.id.sewaTP);
        sewaTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailTopProductHRV.this, RentHome.class);
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
                getIntent().hasExtra("gambarTP")&&
                        getIntent().hasExtra("top1")&&
                        getIntent().hasExtra("top3")){
            top1 = getIntent().getStringExtra("top1");
            top3 = getIntent().getStringExtra("top3");
            tpImage = getIntent().getIntExtra("gambarTP",1);
        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        namaTP.setText(top1);
        desTP.setText(top3);
        tpImageView.setImageResource(tpImage);
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
