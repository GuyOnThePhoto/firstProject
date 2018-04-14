package com.example.slavik.myapplication.userInfoActivity;

import com.example.slavik.myapplication.model.User;

/**
 * Created by Slavik on 10.03.2018.
 */

public interface IUserInfoPresenter {
    User getUserFromDatabase(String login);
}
