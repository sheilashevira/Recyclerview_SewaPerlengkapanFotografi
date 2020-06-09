package info.hijoyprogmob.Account;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import info.hijoyprogmob.R;


public class Help extends AppCompatActivity {
    RecyclerView recyclerView;
    String h1 [], h2 [];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        recyclerView = findViewById(R.id.recyclerView1);

        h1 = getResources().getStringArray(R.array.Pertanyaan);
        h2 = getResources() .getStringArray(R.array.jawaban);

        AdapterHelp adapterHelp = new AdapterHelp(this, h1, h2);
        recyclerView.setAdapter(adapterHelp);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //back button toolbar
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
