package com.example.parcialdam;

import android.arch.persistence.room.Room;
import android.content.Context;

import java.util.List;

public class Repositorio {
    private static Repositorio rep=null;
    private DaoRoom dao;
    private Repositorio(Context contexto){
        DataBase db = Room.databaseBuilder(contexto, DataBase.class,"ParcialDam")
                .allowMainThreadQueries().fallbackToDestructiveMigration().build();
        dao=db.daoRoom();
    }
    public static Repositorio getInstance(Context contexto){
        if(rep==null) return new Repositorio(contexto);
        else return rep;
    }
    public void insertEntidad(Entidad e){
        dao.insertEntidad(e);
    }
    public List<Entidad> getEntidades(String desc){
        return dao.getEntidades(desc);
    }
}
