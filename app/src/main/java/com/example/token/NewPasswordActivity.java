package com.example.token;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewPasswordActivity extends AppCompatActivity {

    EditText etNewPassword;
    EditText etConfirmPassword;

    Button btnSetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new_password);

        // Connect XML components
        etNewPassword = findViewById(R.id.etNewPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);

        btnSetPassword = findViewById(R.id.btnSetPassword);

        // SET PASSWORD
        btnSetPassword.setOnClickListener(v -> {

            String newPassword =
                    etNewPassword.getText().toString().trim();

            String confirmPassword =
                    etConfirmPassword.getText().toString().trim();

            // Check new password
            if (newPassword.isEmpty()) {
                etNewPassword.setError("Enter new password");
                return;
            }

            // Check confirm password
            if (confirmPassword.isEmpty()) {
                etConfirmPassword.setError("Confirm your password");
                return;
            }

            // Check passwords match
            if (!newPassword.equals(confirmPassword)) {
                etConfirmPassword.setError("Passwords do not match");
                return;
            }

            // Password successfully set
            Toast.makeText(
                    NewPasswordActivity.this,
                    "Password is set successfully",
                    Toast.LENGTH_SHORT
            ).show();

            // Open Sign In page
            Intent intent = new Intent(
                    NewPasswordActivity.this,
                    SignInActivity.class
            );

            // Clear previous password-reset screens
            intent.setFlags(
                    Intent.FLAG_ACTIVITY_CLEAR_TOP |
                            Intent.FLAG_ACTIVITY_NEW_TASK
            );

            startActivity(intent);

            // Close current page
            finish();
        });
    }
}