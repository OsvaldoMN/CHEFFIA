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
- Room para persistência local dos favoritos
- Retrofit para integração com API REST
- Glide para carregamento e cache de imagens
- RecyclerView para exibição de listas
- ViewBinding para acesso seguro aos componentes da UI

**🌐 API utilizada:**
https://api-receitas-pi.vercel.app

Retorna:
- Id
- Nome
- Ingredientes
- Preparo
- Tipo
- Imagem
