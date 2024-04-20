package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Plate6Activity extends AppCompatActivity {


    Button PaymentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plate6);

        PaymentBtn =findViewById(R.id.btn_plate6);

        PaymentBtn.setOnClickListener(view -> {
            Intent intent=new Intent(Plate6Activity.this,PaymentActivity.class);
            startActivity(intent);
        });
    }
}
