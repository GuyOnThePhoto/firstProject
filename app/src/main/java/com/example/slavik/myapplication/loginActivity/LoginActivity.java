package com.example.slavik.myapplication.loginActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.slavik.myapplication.R;
import com.example.slavik.myapplication.database.DatabaseImpl;
import com.example.slavik.myapplication.model.User;
import com.example.slavik.myapplication.registerActivity.RegisterActivity;
import com.example.slavik.myapplication.userInfoActivity.UserInfoActivity;

public class LoginActivity extends AppCompatActivity implements LoginActivityView {

    private final String LOG_TAG = "LoginActivity log";
    private EditText editTextLoginField;
    private EditText editTextPasswordField;
    private Button loginButton;
    private Button registerButton;
    private Intent intent;
    private TextView mainActivityErrorMessageTextView;
    private ProgressBar userLoadingProgressBar;
    private ILoginPresenter presenter;
    private String login;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        editTextLoginField = findViewById(R.id.editTextLoginField);
        editTextPasswordField = findViewById(R.id.editTextPasswordField);
        loginButton = findViewById(R.id.loginButton);
        registerButton = findViewById(R.id.registerButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (areFieldsEmpty()) {
                    login = editTextLoginField.getText().toString();
                    password = editTextPasswordField.getText().toString();
                } else {
                    showErrorMessage();
                    return;
                }
                User user = presenter.findUserByLogin(login);
                intent = new Intent(LoginActivity.this, UserInfoActivity.class);
                startActivity(intent);
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
        mainActivityErrorMessageTextView = findViewById(R.id.mainActivityErrorMessageTextView);
        userLoadingProgressBar = findViewById(R.id.userLoadingProgressBar);

        presenter = new LoginPresenter(LoginActivity.this, new DatabaseImpl(LoginActivity.this));

    }

    @Override
    public boolean areFieldsEmpty() {
        login = editTextLoginField.getText().toString();
        password = editTextPasswordField.getText().toString();
        return login.equals("") && password.equals("");
    }

    @Override
    public void showErrorMessage() {
        mainActivityErrorMessageTextView.setVisibility(View.VISIBLE);
    }

    @Override
    public void showSuccessMessage() {
        Toast.makeText(this, getResources().getString(R.string.success_login_message), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideErrorMessage() {
        mainActivityErrorMessageTextView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showUserLoadingProgressBar() {
        userLoadingProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideUserLoadingProgressBar() {
        userLoadingProgressBar.setVisibility(View.INVISIBLE);
    }
}
