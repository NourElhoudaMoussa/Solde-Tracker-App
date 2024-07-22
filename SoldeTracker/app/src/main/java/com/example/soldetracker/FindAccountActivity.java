package com.example.soldetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindAccountActivity extends AppCompatActivity {

    Button search;
    Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_account);
        search=findViewById(R.id.search);
        cancel=findViewById(R.id.cancel);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FindAccountActivity.this, EmailConfirmationActivity.class);
                startActivity(i);
                finish();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(FindAccountActivity.this, LoginActivity.class);
                startActivity(j);
                finish();
            }
        });
    }
}