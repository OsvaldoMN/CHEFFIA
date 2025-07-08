package com.example.cheffia.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "favoritos")
data class ReceitaEntity(
    @PrimaryKey val id: String,
    val nome: String,
    val ingredientes: String,
    val preparo: String,
    val tipo: String,
    val imagem: String
) : Serializable
