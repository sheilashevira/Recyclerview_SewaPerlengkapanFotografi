package info.hijoyprogmob.Home.Kategori.Tripod;

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
import info.hijoyprogmob.Rent.RentTripod;

public class ActivityTripod2 extends AppCompatActivity {

    ImageView tripodImageView;
    TextView namaTripod, desTripod;
    String tripod1, tripod3;
    int tripodImage;

    private Button sewaTripod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tripod2);

        tripodImageView= findViewById(R.id.tripodImageView);
        namaTripod= findViewById(R.id.namaTripod);
        desTripod=findViewById(R.id.desTripod);

        sewaTripod = (Button)findViewById(R.id.sewaTripod);

        sewaTripod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTripod2.this, RentTripod.class);
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
        if(getIntent().hasExtra("gambarTripod") && getIntent().hasExtra("tripod1") && getIntent().hasExtra("tripod3")){
            tripod1 = getIntent().getStringExtra("tripod1");
            tripod3= getIntent().getStringExtra("tripod3");
            tripodImage = getIntent().getIntExtra("gambarTripod", 1);

        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        namaTripod.setText(tripod1);
        desTripod.setText(tripod3);
        tripodImageView.setImageResource(tripodImage);
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
