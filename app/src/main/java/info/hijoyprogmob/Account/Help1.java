package info.hijoyprogmob.Account;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import info.hijoyprogmob.R;

public class Help1 extends AppCompatActivity {
    TextView jawaban, judul;
    String help1, help2;

    public Help1() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help1);

        judul = findViewById(R.id.pertanyaantext);
        jawaban =findViewById(R.id.jawbantext);

        getData();
        setData();

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void getData(){
        if(getIntent().hasExtra("help1") && getIntent().hasExtra("help2")){
            help1 = getIntent().getStringExtra("help1");
            help2 = getIntent().getStringExtra("help2");

        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        judul.setText(help1);
        jawaban.setText(help2);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
