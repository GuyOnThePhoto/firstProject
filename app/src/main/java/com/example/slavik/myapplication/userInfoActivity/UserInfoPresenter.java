package com.example.slavik.myapplication.userInfoActivity;

import com.example.slavik.myapplication.database.Database;
import com.example.slavik.myapplication.model.User;

/**
 * Created by Slavik on 10.03.2018.
 */

public class UserInfoPresenter implements IUserInfoPresenter {
    private Database database;
    private UserInfoView view;

    public UserInfoPresenter(Database database, UserInfoView view) {
        this.database = database;
        this.view = view;
    }

    @Override
    public User getUserFromDatabase(String login) {
        return database.findUser(login);
    }
}
