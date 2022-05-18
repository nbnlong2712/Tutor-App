package com.nguyenhuyhoang.lettutor.screen.auth;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.nguyenhuyhoang.lettutor.R;
import com.nguyenhuyhoang.lettutor.api.Header;
import com.nguyenhuyhoang.lettutor.api.auth.AuthApi;
import com.nguyenhuyhoang.lettutor.components.AuthDialog;
import com.nguyenhuyhoang.lettutor.components.ProgressIndicator;
import com.nguyenhuyhoang.lettutor.models.Message;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtEmail, edtPassword, edtRePassword;
    Button btnRegister;
    ProgressDialog progress;
    TextView tvSignIn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        progress = new ProgressDialog(this);

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
                if (edtEmail.getText() != null && edtPassword.getText() != null && edtRePassword.getText() != null) {
                    if (!"".contentEquals(edtEmail.getText().toString())
                            && !"".contentEquals(edtPassword.getText().toString())
                            && !"".contentEquals(edtRePassword.getText().toString())) {
                        if (edtPassword.getText().toString().compareTo(edtRePassword.getText().toString()) == 0) {
                            ProgressIndicator.showProgress(progress);
                            final Message[] message = new Message[1];
                            try {
                                Map<String, String> body = new HashMap<String, String>() {{
                                    put("email", edtEmail.getText().toString());
                                    put("password", edtPassword.getText().toString());
                                }};
                                AuthApi.authApi.register(Header.header, body).enqueue(new Callback<Void>() {
                                    @Override
                                    public void onResponse(Call<Void> call, Response<Void> response) {
                                        if (response.code() % 200 < 100) {
                                            AuthDialog.showSuccessDialog(RegisterActivity.this, "Register success!");
                                            ProgressIndicator.hideProgress(progress);
                                            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                                        } else {
                                            try {
                                                JSONObject jObjError = new JSONObject(response.errorBody().string());
                                                AuthDialog.showErrorDialog(RegisterActivity.this, jObjError.getString("message"));
                                                ProgressIndicator.hideProgress(progress);
                                            } catch (JSONException | IOException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }

                                    @Override
                                    public void onFailure(Call<Void> call, Throwable t) {
                                        Log.e("ERR", t.getMessage());
                                        AuthDialog.showErrorDialog(RegisterActivity.this, "Register failed!");
                                        ProgressIndicator.hideProgress(progress);
                                    }
                                });
                            } catch (Exception e) {
                                Log.e("ERR", e.getMessage());
                            }
                        } else {
                            AuthDialog.showErrorDialog(RegisterActivity.this, "Password and Re-password not match!");
                        }
                    } else {
                        AuthDialog.showErrorDialog(RegisterActivity.this, "Please fill enough!");
                    }
                }
                break;
            case R.id.tv_sign_in:
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
                break;
        }
    }
}