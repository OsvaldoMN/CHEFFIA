package com.example.cheffia.ui.activity

import android.R
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.cheffia.data.local.ReceitaEntity
import com.example.cheffia.data.repository.FavoritosRepository
import com.example.cheffia.databinding.ActivityReceitasBinding
import com.example.cheffia.ui.viewmodel.ReceitaViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ReceitasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReceitasBinding
    private val viewModel: ReceitaViewModel by viewModels()

    private var index = 0 // controle do btn proximo
    private var listaFiltrada: List<com.example.cheffia.data.model.Receita> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReceitasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val categorias = listOf("Todos", "Salgado", "Doce", "Agridoce")

        val adapter = ArrayAdapter(
            this,
            R.layout.simple_spinner_item,
            categorias
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        binding.spinnerCategoria.adapter = adapter

        binding.logo.setOnClickListener { finish() }

        viewModel.receitas.observe(this) { lista ->
            Log.d("API_TESTE", "Receitas recebidas: $lista")

            fun aplicarFiltro(categoriaSelecionada: String) {
                val categoria = categoriaSelecionada.lowercase()

                listaFiltrada = if (categoria == "todos") {
                    lista
                } else {
                    lista.filter {
                        it.tipo.lowercase() == categoria
                    }
                }

                if (listaFiltrada.isNotEmpty()) {
                    index = 0
                    exibirReceita(listaFiltrada[index])

                    binding.btnProximo.setOnClickListener {
                        index = (index + 1) % listaFiltrada.size //chega ao fim, volta ao começo (loop)
                        exibirReceita(listaFiltrada[index])
                    }

                } else {
                    binding.nomeReceita.text = "Sem receitas"
                    binding.ingredientes.text = ""
                    binding.preparo.text = ""
                    binding.tipo.text = ""
                    binding.imgReceita.setImageResource(0)
                }
            }

            // Listener do spinner
            binding.spinnerCategoria.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    val categoriaSelecionada = categorias[position]
                    aplicarFiltro(categoriaSelecionada)
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {}
            }

            // Forçar aplicação do filtro na primeira abertura
            val categoriaInicial = categorias[binding.spinnerCategoria.selectedItemPosition]
            aplicarFiltro(categoriaInicial)
        }

        binding.btnGostei.setOnClickListener {
            val receitaAtual = listaFiltrada[index]
            val receitaEntity = ReceitaEntity(
                id = receitaAtual.id,
                nome = receitaAtual.nome,
                ingredientes = receitaAtual.ingredientes,
                preparo = receitaAtual.preparo,
                tipo = receitaAtual.tipo,
                imagem = receitaAtual.imagem
            )

            CoroutineScope(Dispatchers.IO).launch {
                FavoritosRepository.adicionar(this@ReceitasActivity, receitaEntity)
            }
        }


    }

    private fun exibirReceita(receita: com.example.cheffia.data.model.Receita) {
        binding.nomeReceita.text = receita.nome
        binding.ingredientes.text = receita.ingredientes
        binding.preparo.text = receita.preparo
        binding.tipo.text = receita.tipo

        // Carregar imagem
        Glide.with(this)
            .load(receita.imagem)
            .into(binding.imgReceita)
    }
}
