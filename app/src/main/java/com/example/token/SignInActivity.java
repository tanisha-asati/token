package com.example.token;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    EditText etPhoneEmail;
    EditText etPassword;

    Button btnSignIn;

    TextView tvForgotPassword;
    TextView tvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_in);

        // Connect XML components
        etPhoneEmail = findViewById(R.id.etPhoneEmail);
        etPassword = findViewById(R.id.etPassword);

        btnSignIn = findViewById(R.id.btnSignIn);

        tvForgotPassword = findViewById(R.id.tvForgotPassword);
        tvSignUp = findViewById(R.id.tvSignUp);

        // SIGN IN BUTTON
        btnSignIn.setOnClickListener(v -> {

            String phoneEmail =
                    etPhoneEmail.getText().toString().trim();

            String password =
                    etPassword.getText().toString().trim();

            // Check phone/email
            if (phoneEmail.isEmpty()) {
                etPhoneEmail.setError(
                        "Enter phone number or email"
                );
                return;
            }

            // Check password
            if (password.isEmpty()) {
                etPassword.setError(
                        "Enter password"
                );
                return;
            }

            // Authentication will be added later
            // Firebase/Python backend will be connected here.
        });

        // FORGOT PASSWORD
        tvForgotPassword.setOnClickListener(v -> {

            Intent intent = new Intent(
                    SignInActivity.this,
                    ForgotPasswordActivity.class
            );

            startActivity(intent);
        });

        // SIGN UP
        tvSignUp.setOnClickListener(v -> {

            Intent intent = new Intent(
                    SignInActivity.this,
                    SignUpActivity.class
            );

            startActivity(intent);
        });
    }
}