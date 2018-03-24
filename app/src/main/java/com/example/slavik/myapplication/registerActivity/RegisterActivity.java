package com.example.slavik.myapplication.registerActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.slavik.myapplication.R;

public class RegisterActivity extends AppCompatActivity implements RegisterView{

    private final String LOG_TAG = "Register log";
    private EditText loginRegisterText;
    private EditText firstnameRegisterEditText;
    private EditText lastnameRegisterEditText;
    private EditText passwordRegisterEditText;
    private EditText passwordConfirmRegisterEditText;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        loginRegisterText = findViewById(R.id.loginRegisterEditText);
        firstnameRegisterEditText = findViewById(R.id.firstnameRegisterEditText);
        lastnameRegisterEditText = findViewById(R.id.lastnameRegisterEditText);
        passwordRegisterEditText = findViewById(R.id.passwordRegisterEditText);
        passwordConfirmRegisterEditText = findViewById(R.id.passwordConfirmRegisterEditText);

        registerButton = findViewById(R.id.registerButton);

    }

}
