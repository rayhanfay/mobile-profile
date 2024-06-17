package com.example.prouas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    TextView welcomeMessage, userName, userEmail, userWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Initializing TextViews
        welcomeMessage = findViewById(R.id.welcome_message);
        userName = findViewById(R.id.user_name);
        userEmail = findViewById(R.id.user_email);
        userWebsite = findViewById(R.id.user_website);

        // Getting data from intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String website = intent.getStringExtra("website");

        // Setting the received data to TextViews
        userName.setText(name);
        userEmail.setText(email);
        userWebsite.setText(website);

        // Proceed to MainActivity after delay
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1250);
    }
}
