package info.hijoyprogmob.Home.Kategori.Accessories;

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
import info.hijoyprogmob.Rent.RentAccessories;

public class ActivityAccessories2 extends AppCompatActivity {

    ImageView aksesorisImageView;
    TextView namaAksesoris, desAksesoris;
    String aksesoris1, aksesoris3;
    int aksesorisImage;

    private Button sewaAksesoris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories2);

        aksesorisImageView= findViewById(R.id.aksesorisImageView);
        namaAksesoris= findViewById(R.id.namaAksesoris);
        desAksesoris=findViewById(R.id.desAksesoris);

        sewaAksesoris = (Button)findViewById(R.id.sewaAksesoris);

        sewaAksesoris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAccessories2.this, RentAccessories.class);
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
        if(getIntent().hasExtra("gambarAksesoris") && getIntent().hasExtra("aksesoris1") && getIntent().hasExtra("aksesoris3")){
            aksesoris1 = getIntent().getStringExtra("aksesoris1");
            aksesoris3= getIntent().getStringExtra("aksesoris3");
            aksesorisImage = getIntent().getIntExtra("gambarAksesoris", 1);

        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        namaAksesoris.setText(aksesoris1);
        desAksesoris.setText(aksesoris3);
        aksesorisImageView.setImageResource(aksesorisImage);
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

