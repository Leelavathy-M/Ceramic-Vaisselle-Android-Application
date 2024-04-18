package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MugsActivity extends AppCompatActivity {
    Button btn_mug1,btn_mug2,btn_mug3,btn_mug4,btn_mug5,btn_mug6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mugs);

        btn_mug1 = findViewById(R.id.btn_mug1);
        btn_mug2 = findViewById(R.id.btn_mug2);
        btn_mug3 = findViewById(R.id.btn_mug3);
        btn_mug4 = findViewById(R.id.btn_mug4);
        btn_mug5 = findViewById(R.id.btn_mug5);
        btn_mug6 = findViewById(R.id.btn_mug6);

        btn_mug1.setOnClickListener(view -> {
            Intent intent = new Intent(MugsActivity.this, Mug1Activity.class);
            startActivity(intent);
        });

        btn_mug2.setOnClickListener(view -> {
            Intent intent = new Intent(MugsActivity.this, Mug2Activity.class);
            startActivity(intent);
        });

        btn_mug3.setOnClickListener(view -> {
            Intent intent = new Intent(MugsActivity.this, Mug3Activity.class);
            startActivity(intent);
        });

        btn_mug4.setOnClickListener(view -> {
            Intent intent = new Intent(MugsActivity.this, Mug4Activity.class);
            startActivity(intent);
        });

        btn_mug5.setOnClickListener(view -> {
            Intent intent = new Intent(MugsActivity.this, Mug5Activity.class);
            startActivity(intent);
        });

        btn_mug6.setOnClickListener(view -> {
            Intent intent = new Intent(MugsActivity.this, Mug6Activity.class);
            startActivity(intent);
        });
    }
}
