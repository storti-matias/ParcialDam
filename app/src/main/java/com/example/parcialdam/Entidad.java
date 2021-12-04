package com.example.parcialdam;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "entidades")
public class Entidad {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    int id;
    @ColumnInfo(name = "descripcion")
    String descripcion;

    public Entidad(String desc){
        descripcion=desc;
    }
    public Entidad(int i,String desc){
        id=i;
        descripcion=desc;
    }
    public String getDescripcion(){
        return descripcion;
    }
    @NonNull
    public String toString(){
        return descripcion;
    }
}
