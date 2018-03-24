package com.example.slavik.myapplication.userInfoActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.slavik.myapplication.R;

public class UserInfoActivity extends AppCompatActivity implements UserInfoView {

    private final String LOG_TAG = "UserActivity log";
    private TextView loginTextView;
    private TextView firstnameTextView;
    private TextView passwordTextView;
    private TextView loginShow;
    private TextView firstnameShow;
    private TextView passwordShow;

    private String login = "";
    private String password = "";

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info_activity);

        loginTextView = findViewById(R.id.editTextLoginField);
        firstnameTextView = findViewById(R.id.firstnameShow);
        passwordTextView = findViewById(R.id.passwordTextView);
        loginShow = findViewById(R.id.loginShow);
        firstnameShow = findViewById(R.id.firstnameShow);
        passwordShow = findViewById(R.id.passwordShow);

        intent = getIntent();

        login = intent.getStringExtra(getResources().getString(R.string.login));
        loginShow.setText(password);

        login = intent.getStringExtra(getResources().getString(R.string.password));
        passwordShow.setText(password);



    }
}
