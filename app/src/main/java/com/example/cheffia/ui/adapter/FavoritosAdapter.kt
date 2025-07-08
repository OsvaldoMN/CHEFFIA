package com.example.cheffia.ui.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cheffia.data.local.ReceitaEntity
import com.example.cheffia.data.model.Receita
import com.example.cheffia.databinding.ItemFavoritoBinding
import com.example.cheffia.ui.activity.DetalheFavoritoActivity
import kotlinx.coroutines.*
import com.example.cheffia.data.repository.FavoritosRepository


class FavoritosAdapter(
    private val context: Context,
    private var lista: MutableList<ReceitaEntity>
) : RecyclerView.Adapter<FavoritosAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemFavoritoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(receita: ReceitaEntity) {
            binding.nomeFavorito.text = receita.nome
            Glide.with(context).load(receita.imagem).into(binding.imgFavorito)

            binding.root.setOnClickListener {
                val intent = Intent(context, DetalheFavoritoActivity::class.java)
                intent.putExtra("receita", receita)
                context.startActivity(intent)
            }

            binding.btnDelete.setOnClickListener {
                CoroutineScope(Dispatchers.IO).launch {
                    // tira do banco
                    FavoritosRepository.remover(context, receita)

                    // tira da ui
                    withContext(Dispatchers.Main) {
                        val position = adapterPosition
                        if (position != RecyclerView.NO_POSITION) {
                            lista.removeAt(position)
                            notifyItemRemoved(position)
                            notifyItemRangeChanged(position, lista.size)
                        }
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemFavoritoBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount() = lista.size //(pega o tamanho da lista pra chamar o bind N vezes)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])
    }
}
