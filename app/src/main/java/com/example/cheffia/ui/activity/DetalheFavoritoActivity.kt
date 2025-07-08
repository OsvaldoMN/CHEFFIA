package com.example.cheffia.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.cheffia.data.model.Receita
import com.example.cheffia.databinding.ActivityDetalheFavoritoBinding
import com.example.cheffia.data.local.ReceitaEntity


class DetalheFavoritoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalheFavoritoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheFavoritoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val receita = intent.getSerializableExtra("receita") as? ReceitaEntity


        receita?.let {
            binding.nomeReceita.text = it.nome
            binding.ingredientes.text = it.ingredientes
            binding.preparo.text = it.preparo
            binding.tipo.text = it.tipo

            Glide.with(this)
                .load(it.imagem)
                .into(binding.imgReceita)
        }

        binding.logo.setOnClickListener { finish() }
    }
}
