package com.example.slavik.myapplication.database;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.slavik.myapplication.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Slavik on 22.02.2018.
 */

public class DatabaseImpl implements Database {
    private final String DATABASE_NAME = "User";

    private UserDatabase database;

    public DatabaseImpl(Context context){
        database = Room.databaseBuilder(context, UserDatabase.class, DATABASE_NAME).build();
    }

    @Override
    public void saveUser(User user) {
        database.userDAO().insertUser(user);
    }

    @Override
    public User findUser(String login) {
        User user = database.userDAO().findUserByLogin(login);
        return user;
           }
}
