package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SpoonsActivity extends AppCompatActivity {
    Button btn_spoon1,btn_spoon2,btn_spoon3,btn_spoon4,btn_spoon5,btn_spoon6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spoons);

        btn_spoon1 = findViewById(R.id.btn_spoon1);
        btn_spoon2 = findViewById(R.id.btn_spoon2);
        btn_spoon3 = findViewById(R.id.btn_spoon3);
        btn_spoon4 = findViewById(R.id.btn_spoon4);
        btn_spoon5 = findViewById(R.id.btn_spoon5);
        btn_spoon6 = findViewById(R.id.btn_spoon6);

        btn_spoon1.setOnClickListener(view -> {
            Intent intent = new Intent(SpoonsActivity.this, Spoon1Activity.class);
            startActivity(intent);
        });

        btn_spoon2.setOnClickListener(view -> {
            Intent intent = new Intent(SpoonsActivity.this, Spoon2Activity.class);
            startActivity(intent);
        });

        btn_spoon3.setOnClickListener(view -> {
            Intent intent = new Intent(SpoonsActivity.this, Spoon3Activity.class);
            startActivity(intent);
        });

        btn_spoon4.setOnClickListener(view -> {
            Intent intent = new Intent(SpoonsActivity.this, Spoon4Activity.class);
            startActivity(intent);
        });

        btn_spoon5.setOnClickListener(view -> {
            Intent intent = new Intent(SpoonsActivity.this, Spoon5Activity.class);
            startActivity(intent);
        });

        btn_spoon6.setOnClickListener(view -> {
            Intent intent = new Intent(SpoonsActivity.this, Spoon6Activity.class);
            startActivity(intent);
        });
    }
}
