package com.login.mobi.loginapp;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {User.class}, version = 1, exportSchema = false)

public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDao getUserDao();

}
