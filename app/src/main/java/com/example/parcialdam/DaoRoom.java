package com.example.parcialdam;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DaoRoom {
    @Insert
    public void insertEntidad(Entidad e);
    @Query("SELECT * FROM entidades WHERE descripcion= :desc")
    public List<Entidad> getEntidades(String desc);
}
