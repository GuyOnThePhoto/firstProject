package com.example.slavik.myapplication.database;
import android.arch.persistence.room.*;
import android.arch.persistence.room.Database;
import com.example.slavik.myapplication.model.User;



@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {
public abstract UserDAO userDAO();
}
