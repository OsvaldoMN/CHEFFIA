package com.example.cheffia.data.repository

import android.content.Context
import com.example.cheffia.data.local.AppDatabase
import com.example.cheffia.data.local.ReceitaEntity

object FavoritosRepository {

    suspend fun listar(context: Context): List<ReceitaEntity> {
        val db = AppDatabase.getInstance(context)
        return db.receitaDao().getTodos()
    }

    suspend fun adicionar(context: Context, receita: ReceitaEntity) {
        val db = AppDatabase.getInstance(context)
        db.receitaDao().inserir(receita)
    }

    suspend fun remover(context: Context, receita: ReceitaEntity) {
        val db = AppDatabase.getInstance(context)
        db.receitaDao().deletar(receita)
    }

    suspend fun getPorId(context: Context, id: String): ReceitaEntity? {
        val db = AppDatabase.getInstance(context)
        return db.receitaDao().getPorId(id)
    }
}
