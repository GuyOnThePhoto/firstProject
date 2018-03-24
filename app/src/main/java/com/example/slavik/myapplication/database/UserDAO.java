package com.example.slavik.myapplication.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.slavik.myapplication.model.User;

import java.util.List;

/**
 * Created by Slavik on 10.03.2018.
 */
@Dao
public interface UserDAO {
@Query("SELECT * FROM user")
    List<User> getUserList();

    @Query("SELECT * FROM user WHERE id LIKE :id")
    User findUserById(int id);

    @Query("SELECT * FROM user WHERE login LIKE :login")
    User findUserByLogin(String login);

    @Insert
    void insertUser(User user);
}
