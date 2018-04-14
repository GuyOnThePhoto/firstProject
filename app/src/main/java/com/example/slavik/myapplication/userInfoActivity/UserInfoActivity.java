package com.example.slavik.myapplication.userInfoActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.slavik.myapplication.R;
import com.example.slavik.myapplication.database.DatabaseImpl;
import com.example.slavik.myapplication.model.User;

public class UserInfoActivity extends AppCompatActivity implements UserInfoView {

    private final String LOG_TAG = "UserActivity log";
    private TextView loginShow;
    private TextView passwordShow;
    private TextView firstNameShow;
    private TextView lastNameView;
    private User user;
    private IUserInfoPresenter presenter;

    private String login = "";

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info_activity);
        loginShow = findViewById(R.id.loginShow);
        passwordShow = findViewById(R.id.passwordShow);
        firstNameShow = findViewById(R.id.firstNameShow);
        lastNameView = findViewById(R.id.lastNameShow);

        intent = getIntent();

        login = intent.getStringExtra(getResources().getString(R.string.login));
        loginShow.setText(login);


        presenter = new UserInfoPresenter(new DatabaseImpl(UserInfoActivity.this), UserInfoActivity.this);
        user = presenter.getUserFromDatabase(login);

        if (user != null){
            showUserInfo();
        }
    }

    @Override
    public void showUserInfo() {
        loginShow.setText(user.getLogin());
        passwordShow.setText(user.getPassword());
        firstNameShow.setText(user.getFirstName());
        lastNameView.setText(user.getLastName());
    }
}
