package com.example.soldetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView forgot_password;
    TextView sign_up;
    Button sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        forgot_password=findViewById(R.id.Forgot_password);
        sign_up=findViewById(R.id.Sign_up);
        sign_in=findViewById(R.id.sign_in);
        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this, FindAccountActivity.class);
                startActivity(i);
                finish();
            }
        });
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(j);
                finish();
            }
        });
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(LoginActivity.this, ProfileActivity.class);
                startActivity(j);
                finish();
            }
        });

    }

}