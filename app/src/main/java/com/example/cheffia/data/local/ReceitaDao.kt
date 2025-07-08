package com.example.cheffia.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ReceitaDao {

    @Query("SELECT * FROM favoritos")
    suspend fun getTodos(): List<ReceitaEntity>

    @Insert
    suspend fun inserir(receita: ReceitaEntity)

    @Delete
    suspend fun deletar(receita: ReceitaEntity)

    @Query("SELECT * FROM favoritos WHERE id = :id")
    suspend fun getPorId(id: String): ReceitaEntity?
}
