package com.example.slavik.myapplication.registerActivity;

import com.example.slavik.myapplication.database.Database;
import com.example.slavik.myapplication.model.User;

/**
 * Created by Slavik on 10.03.2018.
 */

public class RegisterPresenter implements IRegisterPresenter {
    private RegisterView view;
    private Database database;

    public RegisterPresenter(RegisterView view, Database database) {
        this.view = view;
        this.database = database;
    }

    @Override
    public void saveUser(User user) {
        database.saveUser(user);
    }

    @Override
    public boolean isUserExists(String login) {
        User user = database.findUser(login);

        return user != null;
    }
}
