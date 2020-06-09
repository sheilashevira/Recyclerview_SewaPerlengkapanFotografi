package info.hijoyprogmob.Search;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import info.hijoyprogmob.R;
import info.hijoyprogmob.Rent.RentSearch;

public class DetailSearchActivity extends AppCompatActivity {

    private TextView tvtitle,tvdescription;
    private ImageView img;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_search);

        button2 = (Button)findViewById(R.id.button_rent_now);

        tvtitle = (TextView) findViewById(R.id.produk_title);
        tvdescription = (TextView) findViewById(R.id.produk_description);
        img = (ImageView) findViewById(R.id.produk_image);

        Intent intent = getIntent();
        String title = intent.getExtras().getString("Title");
        String description = intent.getExtras().getString("Description");
        int images = intent.getExtras().getInt("Images");

        tvtitle.setText(title);
        tvdescription.setText(description);
        img.setImageResource(images);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailSearchActivity.this, RentSearch.class);
                startActivity(intent);
            }

        });

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
