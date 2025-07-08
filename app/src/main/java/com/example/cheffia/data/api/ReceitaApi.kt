package com.example.cheffia.data.api

import com.example.cheffia.data.model.Receita
import retrofit2.http.GET

interface ReceitaApi {

    @GET("receitas/todas")
    suspend fun getReceitas(): List<Receita>
}
