package info.hijoyprogmob.Home.Kategori.Lensa;

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
import info.hijoyprogmob.Rent.RentLensa;

public class ActivityLensa2 extends AppCompatActivity {
    ImageView lensImageView;
    TextView namaLens, desLens;
    String lens1, lens3;
    int lensImage;

    private Button sewaLens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lensa2);
        lensImageView= findViewById(R.id.lensImageView);
        namaLens= findViewById(R.id.namaLens);
        desLens=findViewById(R.id.desLens);

        sewaLens = (Button)findViewById(R.id.sewaLens);

        sewaLens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLensa2.this, RentLensa.class);
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
        if(getIntent().hasExtra("gambarLens") && getIntent().hasExtra("lens1") && getIntent().hasExtra("lens3")){
            lens1 = getIntent().getStringExtra("lens1");
            lens3 = getIntent().getStringExtra("lens3");
            lensImage = getIntent().getIntExtra("gambarLens", 1);

        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        namaLens.setText(lens1);
        desLens.setText(lens3);
        lensImageView.setImageResource(lensImage);
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
