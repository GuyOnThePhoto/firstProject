package com.example.slavik.myapplication.loginActivity;

import com.example.slavik.myapplication.database.DatabaseImpl;
import com.example.slavik.myapplication.model.User;


public class LoginPresenter implements ILoginPresenter {

    private LoginActivityView view;
    private DatabaseImpl database;

    private User user;

    public LoginPresenter(LoginActivityView view, DatabaseImpl database) {
        this.view = view;
        this.database = database;
    }

    @Override
    public User findUserByLogin(String login) {
        user = database.findUser(login);
        if (user == null) {
            view.showErrorMessage();
        }
        if (isPasswordCorrect(user.getPassword())) {

        }
        return user;
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        return user.getPassword() == password;
    }
}
