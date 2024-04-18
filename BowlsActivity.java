package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class BowlsActivity extends AppCompatActivity {
    Button btn_bowl1,btn_bowl2,btn_bowl3,btn_bowl4,btn_bowl5,btn_bowl6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bowls);

        btn_bowl1 = findViewById(R.id.btn_bowl1);
        btn_bowl2 = findViewById(R.id.btn_bowl2);
        btn_bowl3 = findViewById(R.id.btn_bowl3);
        btn_bowl4 = findViewById(R.id.btn_bowl4);
        btn_bowl5 = findViewById(R.id.btn_bowl5);
        btn_bowl6 = findViewById(R.id.btn_bowl6);

        btn_bowl1.setOnClickListener(view -> {
            Intent intent = new Intent(BowlsActivity.this, Bowl1Activity.class);
            startActivity(intent);
        });

        btn_bowl2.setOnClickListener(view -> {
            Intent intent = new Intent(BowlsActivity.this, bowl2Activity.class);
            startActivity(intent);
        });

        btn_bowl3.setOnClickListener(view -> {
            Intent intent = new Intent(BowlsActivity.this, Bowl3Activity.class);
            startActivity(intent);
        });

        btn_bowl4.setOnClickListener(view -> {
            Intent intent = new Intent(BowlsActivity.this, Bowl4Activity.class);
            startActivity(intent);
        });

        btn_bowl5.setOnClickListener(view -> {
            Intent intent = new Intent(BowlsActivity.this, Bowl5Activity.class);
            startActivity(intent);
        });

        btn_bowl6.setOnClickListener(view -> {
            Intent intent = new Intent(BowlsActivity.this, Bowl6Activity.class);
            startActivity(intent);
        });
    }
}
