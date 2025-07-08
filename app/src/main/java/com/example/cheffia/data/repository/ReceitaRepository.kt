package com.example.cheffia.data.repository

import com.example.cheffia.data.api.RetrofitInstance
import com.example.cheffia.data.model.Receita

class ReceitaRepository {
    suspend fun getReceitas(): List<Receita> { //fun la do recitaapi
        return RetrofitInstance.api.getReceitas()
    }
}
