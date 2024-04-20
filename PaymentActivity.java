package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PaymentActivity extends AppCompatActivity {
    Button payBtn;
    Button CashOnDeliveryBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        payBtn = findViewById(R.id.btn_pay);
        CashOnDeliveryBtn = findViewById(R.id.btn_CashOnDelivery);
        payBtn.setOnClickListener(view -> {

            Intent intent = new Intent(PaymentActivity.this,OrderplacedActivity.class);
            startActivity(intent);

            Toast.makeText(this,"PAYMENT SUCCESSFUL", Toast.LENGTH_SHORT).show();
        });

        CashOnDeliveryBtn.setOnClickListener(view -> {

            Intent intent = new Intent(PaymentActivity.this,OrderplacedActivity.class);
            startActivity(intent);

            Toast.makeText(this,"PAYMENT SUCCESSFUL",Toast.LENGTH_SHORT).show();
        });
    }
}
