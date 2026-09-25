package com.example.token;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class OtpVerificationActivity extends AppCompatActivity {

    EditText etOtp;
    Button btnVerifyOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_otp_verification);

        etOtp = findViewById(R.id.etOtp);
        btnVerifyOtp = findViewById(R.id.btnVerifyOtp);

        // VERIFY OTP
        btnVerifyOtp.setOnClickListener(v -> {

            String otp =
                    etOtp.getText().toString().trim();

            if (otp.isEmpty()) {
                etOtp.setError("Enter OTP");
                return;
            }

            // OTP verification will be connected
            // with Firebase/backend later.

            // For now, go to New Password page
            Intent intent = new Intent(
                    OtpVerificationActivity.this,
                    NewPasswordActivity.class
            );

            startActivity(intent);
        });
    }
}