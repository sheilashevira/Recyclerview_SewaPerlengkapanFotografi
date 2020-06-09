package info.hijoyprogmob.Home.Kategori.Memory;

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
import info.hijoyprogmob.Rent.RentMemory;

public class ActivityMemory2 extends AppCompatActivity {
    ImageView memoImageView;
    TextView namaMemo, desMemo;
    String memo1, memo3;
    int memoImage;

    private Button sewaMemory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory2);
        memoImageView= findViewById(R.id.memoImageView);
        namaMemo= findViewById(R.id.namaMemo);
        desMemo=findViewById(R.id.desMemo);

        sewaMemory= (Button)findViewById(R.id.sewaMemo);

        sewaMemory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMemory2.this, RentMemory.class);
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
        if(getIntent().hasExtra("gambarMemo") && getIntent().hasExtra("memo1") && getIntent().hasExtra("memo3")){
            memo1 = getIntent().getStringExtra("memo1");
            memo3= getIntent().getStringExtra("memo3");
            memoImage = getIntent().getIntExtra("gambarMemo", 1);

        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        namaMemo.setText(memo1);
        desMemo.setText(memo3);
        memoImageView.setImageResource(memoImage);
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
