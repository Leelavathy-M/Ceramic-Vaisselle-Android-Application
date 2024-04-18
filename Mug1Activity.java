package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Mug1Activity extends AppCompatActivity {

    Button PaymentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mug1);

        PaymentBtn =findViewById(R.id.btn_mug1);

        PaymentBtn.setOnClickListener(view -> {
            Intent intent=new Intent(Mug1Activity.this,PaymentActivity.class);
            startActivity(intent);
        });
    }
}
