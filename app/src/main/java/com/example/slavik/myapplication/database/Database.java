package com.example.slavik.myapplication.database;

import com.example.slavik.myapplication.model.User;

/**
 * Created by Slavik on 22.02.2018.
 */

public interface Database {
   void saveUser(User user);
   User findUser(String login);
}
