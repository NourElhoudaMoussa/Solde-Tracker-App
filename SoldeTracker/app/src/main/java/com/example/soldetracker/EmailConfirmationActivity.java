package com.example.soldetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmailConfirmationActivity extends AppCompatActivity {
    Button cancel;
    Button continueBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_confirmation);
        cancel=findViewById(R.id.cancelBTN);
        continueBTN=findViewById(R.id.continueBTN);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(EmailConfirmationActivity.this, FindAccountActivity.class);
                startActivity(i);
                finish();
            }
        });
        continueBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(EmailConfirmationActivity.this, ChangePasswordActivity.class);
                startActivity(j);
                finish();
            }
        });
    }
}