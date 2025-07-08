package com.example.cheffia.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Receita(

    val id:String,

    @SerializedName("receita")
    val nome: String,

    val ingredientes: String,

    @SerializedName("modo_preparo")
    val preparo: String,

    val categoria: String,

    @SerializedName("link_imagem")
    val imagem: String,

    @SerializedName("tipo")
    val tipo: String
) : Serializable
