package com.example.parcialdam;

import android.arch.persistence.room.RoomDatabase;

import androidx.room.Database;

@Database(entities = {Entidad.class},version = 3)
public abstract class DataBase extends RoomDatabase {
    public abstract DaoRoom daoRoom();
}
