package com.example.prouas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText fullName, email, password, phoneNumber, personalWebsite;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullName = findViewById(R.id.full_name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        phoneNumber = findViewById(R.id.phone_number);
        personalWebsite = findViewById(R.id.personal_website);
        registerButton = findViewById(R.id.btn_register);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Capture the user input
                String name_str = fullName.getText().toString().trim();
                String email_str = email.getText().toString().trim();
                String website_str = personalWebsite.getText().toString().trim();

                // Passing user details to WelcomeActivity
                Intent intent = new Intent(RegisterActivity.this, WelcomeActivity.class);
                intent.putExtra("name", name_str);
                intent.putExtra("email", email_str);
                intent.putExtra("website", website_str);
                startActivity(intent);
            }
        });
    }
}
