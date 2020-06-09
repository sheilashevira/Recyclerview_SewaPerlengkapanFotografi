package info.hijoyprogmob.Home.Kategori.Flash;

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
import info.hijoyprogmob.Rent.RentFlash;

public class ActivityFlash2 extends AppCompatActivity {
    ImageView flashImageView;
    TextView namaFlash, desFlash;
    String flash1, flash3;
    int flashImage;

    private Button sewaFlash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash2);
        flashImageView= findViewById(R.id.flashImageView);
        namaFlash= findViewById(R.id.namaFlash);
        desFlash=findViewById(R.id.desFlash);

        sewaFlash= (Button)findViewById(R.id.sewaFlash);

        sewaFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFlash2.this, RentFlash.class);
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
        if(getIntent().hasExtra("gambarFlash") && getIntent().hasExtra("flash1") && getIntent().hasExtra("flash3")){
            flash1 = getIntent().getStringExtra("flash1");
            flash3= getIntent().getStringExtra("flash3");
            flashImage = getIntent().getIntExtra("gambarFlash", 1);

        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        namaFlash.setText(flash1);
        desFlash.setText(flash3);
        flashImageView.setImageResource(flashImage);
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
