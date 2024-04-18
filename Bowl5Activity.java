package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Bowl5Activity extends AppCompatActivity {
    Button PaymentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bowl5);

        PaymentBtn =findViewById(R.id.btn_bowl5);

        PaymentBtn.setOnClickListener(view -> {
            Intent intent=new Intent(Bowl5Activity.this,PaymentActivity.class);
            startActivity(intent);
        });
    }
}
