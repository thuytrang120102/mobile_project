package com.example.appbanhang.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;

import com.example.appbanhang.R;

public class SignUpActivity extends AppCompatActivity {
    EditText user,email, pass, repass;
    AppCompatButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initView();
        initControll();
    }

    private void initControll() {
    }

    private void initView() {
        user = findViewById(R.id.txtUser);
        email = findViewById(R.id.txtEmail);
        pass = findViewById(R.id.txtPassword);
        repass = findViewById(R.id.txtConfirmPassword);
        button = findViewById(R.id.btnDangky);
    }
}