package info.hijoyprogmob.Account;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import info.hijoyprogmob.Favorite.Favorite;
import info.hijoyprogmob.Home.Home;
import info.hijoyprogmob.Login;
import info.hijoyprogmob.News.News;
import info.hijoyprogmob.R;
import info.hijoyprogmob.Search.Search;


public class Account extends AppCompatActivity {
    LinearLayout detail,linear1,linear2,linear3,linear4,linear5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        linear1 = (LinearLayout) findViewById(R.id.linear1);
        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Account.this,"About", Toast.LENGTH_SHORT);
                Intent intent = new Intent(Account.this, About.class);
                startActivity(intent);
            }
        });

        linear2 = (LinearLayout) findViewById(R.id.linear2);
        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Account.this,"Terms and Condition", Toast.LENGTH_SHORT);
                Intent intent = new Intent(Account.this, TermsCondition.class);
                startActivity(intent);
            }
        });

        linear3 = (LinearLayout) findViewById(R.id.linear3);
        linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Account.this,"Setting", Toast.LENGTH_SHORT);
                Intent intent = new Intent(Account.this, Setting.class);
                startActivity(intent);
            }
        });

        linear4 = (LinearLayout) findViewById(R.id.linear4);
        linear4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Account.this,"Help", Toast.LENGTH_SHORT);
                Intent intent = new Intent(Account.this, Help.class);
                startActivity(intent);
            }
        });

        linear5 = (LinearLayout) findViewById(R.id.linear5);
        linear5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Account.this,"Log Out Success !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Account.this, Login.class);
                startActivity(intent);
            }
        });

        detail = (LinearLayout) findViewById(R.id.detail);
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Account.this,"Detail Profile", Toast.LENGTH_SHORT);
                Intent intent = new Intent(Account.this, DetailProfile.class);
                startActivity(intent);
            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.account);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(), Search.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favorit:
                        startActivity(new Intent(getApplicationContext(), Favorite.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.news:
                        startActivity(new Intent(getApplicationContext(), News.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        return true;
                }
                return false;
            }
        });
    }
}
