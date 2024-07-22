package com.example.soldetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpConfirmationActivity extends AppCompatActivity {
    Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_confirmation);
        cancel=findViewById(R.id.cancelBTN);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SignUpConfirmationActivity.this, SignUpActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}