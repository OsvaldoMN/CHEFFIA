# CHEFFIA
Repositório para o APP de receitas CHEFFIA

**Funcionalidade:**

🔍 Filtro de receitas (Todos, Salgado, Docê e Agridocê)

⏭️ Botão próximo, para passar aleatóriamente para a próxima receita

❤️ Botão Gostei para salvar a receita em Favoritos

⭐ Lista de Favoritos

🗑️ Botão de deletar receita favoritada

🔄 Atualização dinâmica da lista usando RecyclerView

**🧠 Tecnologias Utilizadas:**
- Kotlin como linguagem principal
- MVVM (Model-View-ViewModel) como arquitetura base
- Room para salvar a receita localmente em favoritos
- Retrofit para integração com a API
- Glide para carregamento de imagens
- RecyclerView para exibição da lista
- ViewBinding para acesso aos componentes da UI

**🌐 API utilizada:**
https://api-receitas-pi.vercel.app

Retorna:
- Id
- Nome
- Ingredientes
- Preparo
- Tipo
- Imagem
