package com.example.imageapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLogin();
            }
        });
    }

    private void onLogin() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        if ((username.equals("admin")) && password.equals("123")){
            goMain();
        }else {
            Toast.makeText(LoginActivity.this,"Sai tai khoan",Toast.LENGTH_SHORT).show();
        }
    }

    private void goMain() {
        Toast.makeText(LoginActivity.this,"Success",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        intent.putExtra("username",etUsername.getText().toString());
        intent.putExtra("password",etPassword.getText().toString());
        startActivity(intent);
    }

}