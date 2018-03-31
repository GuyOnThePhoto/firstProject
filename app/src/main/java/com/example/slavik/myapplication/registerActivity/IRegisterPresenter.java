package com.example.slavik.myapplication.registerActivity;

import com.example.slavik.myapplication.model.User;

/**
 * Created by Slavik on 10.03.2018.
 */

public interface IRegisterPresenter {
    void saveUser(User user);
    boolean isUserExists(String login);
}
