package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PlatesActivity extends AppCompatActivity {
    Button btn_plate1, btn_plate2, btn_plate3, btn_plate4, btn_plate5, btn_plate6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plates);

        btn_plate1 = findViewById(R.id.btn_plate1);
        btn_plate2 = findViewById(R.id.btn_plate2);
        btn_plate3 = findViewById(R.id.btn_plate3);
        btn_plate4 = findViewById(R.id.btn_plate4);
        btn_plate5 = findViewById(R.id.btn_plate5);
        btn_plate6 = findViewById(R.id.btn_plate6);

        btn_plate1.setOnClickListener(view -> {
            Intent intent = new Intent(PlatesActivity.this, Plate1Activity.class);
            startActivity(intent);
        });

        btn_plate2.setOnClickListener(view -> {
            Intent intent = new Intent(PlatesActivity.this, Plate2Activity.class);
            startActivity(intent);
        });

        btn_plate3.setOnClickListener(view -> {
            Intent intent = new Intent(PlatesActivity.this, Plate3Activity.class);
            startActivity(intent);
        });

        btn_plate4.setOnClickListener(view -> {
            Intent intent = new Intent(PlatesActivity.this, Plate4Activity.class);
            startActivity(intent);
        });

        btn_plate5.setOnClickListener(view -> {
            Intent intent = new Intent(PlatesActivity.this, Plate5Activity.class);
            startActivity(intent);
        });

        btn_plate6.setOnClickListener(view -> {
            Intent intent = new Intent(PlatesActivity.this, Plate6Activity.class);
            startActivity(intent);
        });
    }
}
