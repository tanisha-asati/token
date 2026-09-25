package  com.example.token;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    EditText etName;
    EditText etPhone;
    EditText etEmail;
    EditText etPassword;
    EditText etConfirmPassword;

    Button btnSendOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_up);

        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);

        btnSendOtp = findViewById(R.id.btnSendOtp);

        // SEND OTP
        btnSendOtp.setOnClickListener(v -> {

            String name =
                    etName.getText().toString().trim();

            String phone =
                    etPhone.getText().toString().trim();

            String email =
                    etEmail.getText().toString().trim();

            String password =
                    etPassword.getText().toString().trim();

            String confirmPassword =
                    etConfirmPassword.getText().toString().trim();

            if (name.isEmpty()) {
                etName.setError("Enter your name");
                return;
            }

            if (phone.isEmpty()) {
                etPhone.setError("Enter phone number");
                return;
            }

            if (email.isEmpty()) {
                etEmail.setError("Enter email");
                return;
            }

            if (password.isEmpty()) {
                etPassword.setError("Create a password");
                return;
            }

            if (confirmPassword.isEmpty()) {
                etConfirmPassword.setError("Confirm your password");
                return;
            }

            if (!password.equals(confirmPassword)) {
                etConfirmPassword.setError("Passwords do not match");
                return;
            }

            // OTP functionality will be added later.
        });
    }
}