package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText nameEt,mobileNumberEt,addressEt;

    Button submitBtn;

    String strName ="abc", strMobileNumber ="1234567890", strAddress ="chennai";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nameEt =findViewById(R.id.et_Name);
        mobileNumberEt =findViewById(R.id.et_MobileNumber);
        addressEt =findViewById(R.id.et_Address);
        submitBtn =findViewById(R.id.btn_submit);

        submitBtn.setOnClickListener(view -> {

            strName = nameEt.getText().toString();
            strMobileNumber = mobileNumberEt.getText().toString();
            strAddress = addressEt.getText().toString();

            if (nameEt.equals("") && mobileNumberEt.equals("") && addressEt.equals("")) {
                nameEt.setError("please enter your name");
                mobileNumberEt.setError("please enter your mobile_number");
                addressEt.setError("please enter your name");

            } else if (nameEt.equals("")) {
                nameEt.setError("please enter your name");
                mobileNumberEt.setError("please enter your mobile_number");
                addressEt.setError("please enter your name");

            } else if (nameEt.equals("")) {
                nameEt.setError("please enter your name");
            } else if (mobileNumberEt.equals("")) {
                mobileNumberEt.setError("please enter your mobile_number");
            } else if (addressEt.equals("")) {
                addressEt.setError("please enter your address");
            } else if (mobileNumberEt.length() <= 8) {
                mobileNumberEt.setError("please enter at least 10 characters");
            } else if (!nameEt.equals(strName)) {
                nameEt.setError("please enter your valid name");
            } else if (!mobileNumberEt.equals(strMobileNumber)) {
                mobileNumberEt.setError("Incorrect password");
            } else if (!addressEt.equals(strAddress)) {
                addressEt.setError("please enter your address");
            } else {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }

            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);

            intent.putExtra("name", strName);
            intent.putExtra("mobileNumber", strMobileNumber);
            intent.putExtra("address", strAddress);


            startActivity(intent);
        });
    }
}
