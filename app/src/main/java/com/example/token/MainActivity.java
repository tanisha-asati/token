package com.example.token;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        // SIGN IN
        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    SignInActivity.class
            );

            startActivity(intent);
        });

        // SIGN UP
        btnRegister.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    SignUpActivity.class
            );

            startActivity(intent);
        });
    }
}