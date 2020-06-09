package info.hijoyprogmob.Home.Kategori.Bag;

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
import info.hijoyprogmob.Rent.RentBag;

public class ActivityBag2 extends AppCompatActivity {
    ImageView tasImageView;
    TextView namaTas, desTas;
    String tas1, tas3;
    int tasImage;

    private Button sewaTas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag2);
        tasImageView= findViewById(R.id.tasImageView);
        namaTas= findViewById(R.id.namaTas);
        desTas=findViewById(R.id.desTas);

        sewaTas= (Button)findViewById(R.id.sewaTas);

        sewaTas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBag2.this, RentBag.class);
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
        if(getIntent().hasExtra("gambarTas") && getIntent().hasExtra("tas1") && getIntent().hasExtra("tas3")){
            tas1 = getIntent().getStringExtra("tas1");
            tas3 = getIntent().getStringExtra("tas3");
            tasImage = getIntent().getIntExtra("gambarTas", 1);

        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        namaTas.setText(tas1);
        desTas.setText(tas3);
        tasImageView.setImageResource(tasImage);
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
