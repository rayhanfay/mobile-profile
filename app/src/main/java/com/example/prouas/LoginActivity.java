package com.example.prouas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText username, pass;
    Button button_login, button_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.user);
        pass = findViewById(R.id.password);
        button_login= findViewById(R.id.btn_login);
        button_register = findViewById(R.id.btn_register);

        button_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String user_str = username.getText().toString().trim();
                String pass_str = pass.getText().toString().trim();

                if(user_str.equals("rayhan") && pass_str.equals("123")){
                    // Passing user details to WelcomeActivity
                    Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
                    intent.putExtra("name", "Rayhan Al Farassy"); // Hardcoded for simplicity
                    intent.putExtra("email", "rayhan.al5776@student.unri.ac.id"); // Hardcoded for simplicity
                    intent.putExtra("website", "www.linkedin.com/in/rayhanalfarassy"); // Hardcoded for simplicity
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Username atau password salah...", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
