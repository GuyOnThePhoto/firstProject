package com.example.slavik.myapplication.loginActivity;

import com.example.slavik.myapplication.model.User;

/**
 * Created by Slavik on 10.03.2018.
 */

public interface ILoginPresenter {
    User findUserByLogin(String login);
    boolean isPasswordCorrect(String password);
}
