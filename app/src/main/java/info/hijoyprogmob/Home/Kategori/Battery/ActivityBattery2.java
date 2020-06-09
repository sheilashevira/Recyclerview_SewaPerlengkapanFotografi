package info.hijoyprogmob.Home.Kategori.Battery;

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
import info.hijoyprogmob.Rent.RentBattery;

public class ActivityBattery2 extends AppCompatActivity {
    ImageView bateraiImageView;
    TextView namaBaterai, desBaterai;
    String baterai1, baterai3;
    int bateraiImage;

    private Button sewaBaterai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery2);

        bateraiImageView= findViewById(R.id.bateraiImageView);
        namaBaterai= findViewById(R.id.namaBaterai);
        desBaterai=findViewById(R.id.desBaterai);

        sewaBaterai= (Button)findViewById(R.id.sewaBaterai);

        sewaBaterai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBattery2.this, RentBattery.class);
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
        if(getIntent().hasExtra("gambarBaterai") && getIntent().hasExtra("baterai1") && getIntent().hasExtra("baterai3")){
            baterai1 = getIntent().getStringExtra("baterai1");
            baterai3= getIntent().getStringExtra("baterai3");
            bateraiImage = getIntent().getIntExtra("gambarBaterai", 1);

        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        namaBaterai.setText(baterai1);
        desBaterai.setText(baterai3);
        bateraiImageView.setImageResource(bateraiImage);
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
