package info.hijoyprogmob.Rent;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import info.hijoyprogmob.Home.Kategori.Bag.ActivityBag;
import info.hijoyprogmob.R;

public class RentBag extends AppCompatActivity {

    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);

        button3 = (Button) findViewById(R.id.button_rent_fix);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(RentBag.this,"Rent Success !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RentBag.this, ActivityBag.class);
                startActivity(intent);
            }
        });
        //nampilin tombol back di toolbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
