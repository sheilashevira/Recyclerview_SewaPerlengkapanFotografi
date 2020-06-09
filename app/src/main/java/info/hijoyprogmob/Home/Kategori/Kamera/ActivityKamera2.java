package info.hijoyprogmob.Home.Kategori.Kamera;

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
import info.hijoyprogmob.Rent.RentKamera;

public class ActivityKamera2 extends AppCompatActivity {
    ImageView kamImageView;
    TextView namaKam, desKam;
    String kam1, kam3;
    int kamImage;

    private Button sewaKam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamera2);
        kamImageView = findViewById(R.id.kamImageView);
        namaKam = findViewById(R.id.namaKam);
        desKam =findViewById(R.id.desKam);

        sewaKam = (Button)findViewById(R.id.sewaKam);

        sewaKam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityKamera2.this, RentKamera.class);
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
        if(
                getIntent().hasExtra("kamImageView") &&
                getIntent().hasExtra("kam1") &&
                getIntent().hasExtra("kam3")){
            kam1 = getIntent().getStringExtra("kam1");
            kam3 = getIntent().getStringExtra("kam3");
            kamImage = getIntent().getIntExtra("kamImageView", 1);

        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        namaKam.setText(kam1);
        desKam.setText(kam3);
        kamImageView.setImageResource(kamImage);
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

