package com.example.ceramicvessille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity {

    LinearLayout platesLl,bowlsLl,mugsLl,spoonsLl,about1Ll,contactLl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        platesLl = findViewById(R.id.ll_plates);
        bowlsLl = findViewById(R.id.ll_bowls);
        mugsLl = findViewById(R.id.ll_mugs);
        spoonsLl = findViewById(R.id.ll_spoons);
        about1Ll = findViewById(R.id.ll_about);
        contactLl = findViewById(R.id.ll_contact);


        platesLl.setOnClickListener(view -> {
            Intent intent = new Intent(MenuActivity.this, PlatesActivity.class);

            startActivity(intent);
        });
        bowlsLl.setOnClickListener(view1 -> {
            Intent intent1 = new Intent(MenuActivity.this, BowlsActivity.class);

            startActivity(intent1);
        });
        mugsLl.setOnClickListener(view2 -> {
            Intent intent2 = new Intent(MenuActivity.this, MugsActivity.class);

            startActivity(intent2);
        });
        spoonsLl.setOnClickListener(view3 -> {
            Intent intent3 = new Intent(MenuActivity.this, SpoonsActivity.class);

            startActivity(intent3);
        });
        about1Ll.setOnClickListener(view1 -> {
            Intent intent1 = new Intent(MenuActivity.this, AboutActivity.class);

            startActivity(intent1);
        });
        contactLl.setOnClickListener(view1 -> {
            Intent intent1 = new Intent(MenuActivity.this, ContactActivity.class);

            startActivity(intent1);
        });
    }
}
