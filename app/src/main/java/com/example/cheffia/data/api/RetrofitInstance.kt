package com.example.cheffia.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api-receitas-pi.vercel.app")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ReceitaApi by lazy {
        retrofit.create(ReceitaApi::class.java)
    }
}
