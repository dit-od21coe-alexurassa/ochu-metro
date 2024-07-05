package com.example.metro;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomeTextView = findViewById(R.id.Welcome);
        final String welcomeText = welcomeTextView.getText().toString();

        final String fullName = getIntent().getStringExtra(getString(R.string.full_name_key));

        welcomeTextView.setText(welcomeText +  " " + fullName);
    }
}