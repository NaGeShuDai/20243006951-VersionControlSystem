package com.example.practical3_github;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usernameInput = findViewById(R.id.usernameInput);
        EditText passwordInput = findViewById(R.id.passwordInput);

        findViewById(R.id.loginButton).setOnClickListener(view -> {
            boolean valid = usernameInput.getText().toString().equals("admin")
                    && passwordInput.getText().toString().equals("password123");
            Toast.makeText(this, valid ? "Login Successful!" : "Invalid Credentials",
                    Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.cancelButton).setOnClickListener(view -> {
            usernameInput.setText("");
            passwordInput.setText("");
            usernameInput.requestFocus();
        });
    }
}
