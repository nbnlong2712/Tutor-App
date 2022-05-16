package com.nguyenhuyhoang.lettutor.screen.auth;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.nguyenhuyhoang.lettutor.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtEmail, edtPassword, edtRePassword;
    Button btnRegister;
    TextView tvSignIn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        init();
    }

    void init() {
        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_password);
        edtRePassword = findViewById(R.id.edt_re_password);

        btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(this);

        tvSignIn = findViewById(R.id.tv_sign_in);
        tvSignIn.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_register:
                break;
            case R.id.tv_sign_in:
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
                break;
        }
    }
}
