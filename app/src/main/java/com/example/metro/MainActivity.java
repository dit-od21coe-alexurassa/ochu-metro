package com.example.metro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button loginBtn;
    EditText fullNameField;
    EditText emailField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        fullNameField = findViewById(R.id.name);
        emailField = findViewById(R.id.email);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String fullName = fullNameField.getText().toString();
                final String email = emailField.getText().toString();

                if(fullName.isEmpty() || email.isEmpty()) {
                    // show toast
                    Toast.makeText(MainActivity.this, "Please enter your Full name and email to continue", Toast.LENGTH_SHORT).show();
                }
                else {
                    // put extra data and navigate to welcome screen
                    Intent welcomeIntent = new Intent(MainActivity.this, WelcomeActivity.class);
                    welcomeIntent.putExtra(getString(R.string.full_name_key), fullName);
                    startActivity(welcomeIntent);

                }
            }
        });


    }
}