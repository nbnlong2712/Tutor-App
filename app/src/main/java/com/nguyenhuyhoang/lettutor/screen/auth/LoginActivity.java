package com.nguyenhuyhoang.lettutor.screen.auth;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.nguyenhuyhoang.lettutor.MyApplication;
import com.nguyenhuyhoang.lettutor.R;
import com.nguyenhuyhoang.lettutor.api.Header;
import com.nguyenhuyhoang.lettutor.api.auth.AuthApi;
import com.nguyenhuyhoang.lettutor.api.user.UserApi;
import com.nguyenhuyhoang.lettutor.components.AuthDialog;
import com.nguyenhuyhoang.lettutor.models.Token;
import com.nguyenhuyhoang.lettutor.models.User;
import com.nguyenhuyhoang.lettutor.screen.home.HomeScreenActivity;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtEmail, edtPassword;
    Button btnLogin;
    SharedPreferences prefs;
    ProgressDialog progress;
    TextView tvSignUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        progress = new ProgressDialog(this);

        prefs = getApplicationContext().getSharedPreferences("Auth", Context.MODE_PRIVATE);

        if (!prefs.getString("access", "").isEmpty()) {
            showIndicator();
            fetchMainUser();
        }

        init();
    }

    void showIndicator() {
        progress.setCancelable(true);
        progress.show();
    }

    void hideIndicator() {
        progress.dismiss();
    }

    void init() {
        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_password);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);

        tvSignUp = findViewById(R.id.tv_sign_up);
        tvSignUp.setOnClickListener(this);
    }

    @SuppressLint({"NonConstantResourceId", "CommitPrefEdits"})
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_sign_up:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
            case R.id.btn_login:
                final Token[] token = new Token[1];
                if (edtEmail.getText() != null && edtPassword.getText() != null) {
                    if (!"".contentEquals(edtEmail.getText().toString()) && !"".contentEquals(edtPassword.getText().toString())) {
                        showIndicator();
                        try {
                            Map<String, String> body = new HashMap<String, String>() {{
                                put("email", edtEmail.getText().toString());
                                put("password", edtPassword.getText().toString());
                            }};
                            AuthApi.authApi.login(Header.header, body).enqueue(new Callback<Token>() {
                                @Override
                                public void onResponse(Call<Token> call, Response<Token> response) {
                                    if (response.code() == 200) {
                                        token[0] = response.body();
                                        prefs.edit().putString("access", token[0].getTokens().getAccess().getToken()).apply();
                                        prefs.edit().putString("refresh", token[0].getTokens().getRefresh().getToken()).apply();
                                        fetchMainUser();
                                    } else {
                                        AuthDialog.showErrorDialog(LoginActivity.this, "Email or password is invalid!");
                                    }
                                    hideIndicator();
                                }

                                @Override
                                public void onFailure(Call<Token> call, Throwable t) {
                                    Log.e("ERR", t.getMessage());
                                    hideIndicator();
                                }
                            });
                        } catch (Exception e) {
                            Log.e("ERRR", e.getMessage());
                            AuthDialog.showErrorDialog(LoginActivity.this, "Failed to login!");
                            hideIndicator();
                        }
                    } else {
                        AuthDialog.showErrorDialog(LoginActivity.this, "Please fill enough!");
                        hideIndicator();
                    }
                } else {
                    AuthDialog.showErrorDialog(LoginActivity.this, "Please fill enough!");
                }
                break;
        }
    }

    void fetchMainUser() {
        UserApi.userApi.getUserInfo(Header.headers()).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.code() == 200) {
                    User user = response.body();
                    ((MyApplication) LoginActivity.this.getApplication()).setMainUser(user);
                    startActivity(new Intent(LoginActivity.this, HomeScreenActivity.class));
                    finish();
                }
                hideIndicator();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.e("ERR", t.getMessage());
                hideIndicator();
            }
        });
    }
}