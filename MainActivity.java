package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText usernameBox, passwordBox;
    Button sign_inBtn;

    String strUsername = "12345";
    String strPassword = "1234567";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_inBtn = findViewById(R.id.sign_inBtn);
        usernameBox = findViewById(R.id.et_username);
        passwordBox = findViewById(R.id.et_password);

        sign_inBtn.setOnClickListener(view -> {

            String username = usernameBox.getText().toString();

            String password = passwordBox.getText().toString();

            if (username.equals("") && password.equals("")) {
                usernameBox.setError("please enter your username");
                passwordBox.setError("please enter your password");
            } else if (username.equals("")) {
                usernameBox.setError(("please enter your username"));
            } else if (password.equals("")) {
                passwordBox.setError(("please enter your password"));
            } else if (password.length() <= 6) {
                passwordBox.setError("please enter at least 7 characters");
            } else if (!username.equals(strUsername)) {
                usernameBox.setError("please enter your valid mobile number");
            } else if (!password.equals(strPassword)) {
                passwordBox.setError("Incorrect Password");
            } else {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
