package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Spoon3Activity extends AppCompatActivity {

    Button PaymentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spoon3);

        PaymentBtn =findViewById(R.id.btn_spoon3);

        PaymentBtn.setOnClickListener(view -> {
            Intent intent=new Intent(Spoon3Activity.this,PaymentActivity.class);
            startActivity(intent);
        });
    }
}
