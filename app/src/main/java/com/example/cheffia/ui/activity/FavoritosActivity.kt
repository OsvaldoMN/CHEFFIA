package com.example.cheffia.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cheffia.data.repository.FavoritosRepository
import com.example.cheffia.databinding.ActivityFavoritosBinding
import com.example.cheffia.ui.adapter.FavoritosAdapter
import kotlinx.coroutines.*

class FavoritosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoritosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoritosBinding.inflate(layoutInflater) //traz os campos e btn do item
        setContentView(binding.root)

        CoroutineScope(Dispatchers.IO).launch {
            val lista = FavoritosRepository.listar(this@FavoritosActivity).toMutableList()

            withContext(Dispatchers.Main) {
                val adapter = FavoritosAdapter(this@FavoritosActivity, lista) //pega dados de cada item
                binding.recyclerFavoritos.layoutManager = LinearLayoutManager(this@FavoritosActivity)
                binding.recyclerFavoritos.adapter = adapter //coloca os dados no xml da recycler view
            }
        }
        binding.logo.setOnClickListener{ finish() }
    }
}
