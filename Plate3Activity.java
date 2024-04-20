package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Plate3Activity extends AppCompatActivity {

    Button PaymentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plate3);

        PaymentBtn =findViewById(R.id.btn_plate3);

        PaymentBtn.setOnClickListener(view -> {
            Intent intent=new Intent(Plate3Activity.this,PaymentActivity.class);
            startActivity(intent);
        });
    }
}
