package com.example.cheffia.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import com.example.cheffia.data.model.Receita
import com.example.cheffia.data.repository.ReceitaRepository
import kotlinx.coroutines.launch

class ReceitaViewModel : ViewModel() {

    private val repository = ReceitaRepository()

    private val _receitas = MutableLiveData<List<Receita>>()
    val receitas: LiveData<List<Receita>> = _receitas

    init {
        fetchReceitas()
    }

    private fun fetchReceitas() {
        viewModelScope.launch {
            try {
                val lista = repository.getReceitas() //busca no repositorio a receita (fun receitaapi)
                _receitas.value = lista
                Log.d("API_TESTE", "dados recebidos no viewmodel: $lista")
            } catch (e: Exception) {
                Log.e("API_TESTE", "erro na busca dados: ${e.message}")
            }
        }
    }
}
