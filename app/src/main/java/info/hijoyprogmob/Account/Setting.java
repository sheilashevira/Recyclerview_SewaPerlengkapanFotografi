package info.hijoyprogmob.Account;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import info.hijoyprogmob.R;


public class Setting extends AppCompatActivity {
    LinearLayout notif,chat,privasi,bhs;
    String[] listitem;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        notif = (LinearLayout) findViewById(R.id.notif);
        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Setting.this,"Notif", Toast.LENGTH_SHORT);
                Intent intent = new Intent(Setting.this, SettingNotif.class);
                startActivity(intent);
            }
        });

        chat = (LinearLayout) findViewById(R.id.chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Setting.this,"Chat", Toast.LENGTH_SHORT);
                Intent intent = new Intent(Setting.this, SettingChat.class);
                startActivity(intent);
            }
        });

        privasi = (LinearLayout) findViewById(R.id.privasi);
        privasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Setting.this,"Privasi", Toast.LENGTH_SHORT);
                Intent intent = new Intent(Setting.this, SettingPrivasi.class);
                startActivity(intent);
            }
        });

        bhs = (LinearLayout) findViewById(R.id.bhs);
        mTextView = findViewById(R.id.bhspilihan);
        bhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listitem = new String[]{"Bahasa Indonesia", "English", "Thai", "Malay"};
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Setting.this);
                mBuilder.setTitle("Choose An Language");
                mBuilder.setIcon(R.drawable.iconlist);
                mBuilder.setSingleChoiceItems(listitem, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        mTextView.setText(listitem[i]);
                        dialogInterface.dismiss();

                    }
                });
                mBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
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
