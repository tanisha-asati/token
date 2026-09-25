package com.example.token;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    EditText etPhoneEmail;
    Button btnSendOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_forgot_password);

        etPhoneEmail = findViewById(R.id.etPhoneEmail);
        btnSendOtp = findViewById(R.id.btnSendOtp);

        // SEND OTP
        btnSendOtp.setOnClickListener(v -> {

            String phoneEmail =
                    etPhoneEmail.getText().toString().trim();

            if (phoneEmail.isEmpty()) {

                etPhoneEmail.setError(
                        "Enter phone number or email"
                );

                return;
            }

            // OTP will be sent using Firebase/backend later.

            // For now, go to OTP verification page
            Intent intent = new Intent(
                    ForgotPasswordActivity.this,
                    OtpVerificationActivity.class
            );

            startActivity(intent);
        });
    }
}