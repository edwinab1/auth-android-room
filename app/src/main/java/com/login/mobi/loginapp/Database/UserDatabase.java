package com.login.mobi.loginapp.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.login.mobi.loginapp.Models.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)

public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDao getUserDao();

}
