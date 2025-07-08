package com.example.cheffia.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cheffia.R
import com.example.cheffia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)



        binding.btnNovaReceita.setOnClickListener{ receitas() }
        binding.btnFavoritos.setOnClickListener{ favoritos() }

    }

    private fun receitas(){
        val intent = Intent(this, ReceitasActivity::class.java)
        startActivity(intent)

    }

    private fun favoritos(){
        val intent = Intent(this, FavoritosActivity::class.java)
        startActivity(intent)

    }

}