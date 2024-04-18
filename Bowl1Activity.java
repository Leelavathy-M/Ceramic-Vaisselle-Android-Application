package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Bowl1Activity extends AppCompatActivity {

    Button PaymentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bowl1);

        PaymentBtn =findViewById(R.id.btn_bowl1);

        PaymentBtn.setOnClickListener(view -> {
            Intent intent=new Intent(Bowl1Activity.this,PaymentActivity.class);
            startActivity(intent);
        });
    }
}
