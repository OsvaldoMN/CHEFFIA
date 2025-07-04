package com.example.cheffia.data.repository;

import android.content.Context;
import com.example.cheffia.data.local.AppDatabase;
import com.example.cheffia.data.local.ReceitaEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ \u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/example/cheffia/data/repository/FavoritosRepository;", "", "()V", "adicionar", "", "context", "Landroid/content/Context;", "receita", "Lcom/example/cheffia/data/local/ReceitaEntity;", "(Landroid/content/Context;Lcom/example/cheffia/data/local/ReceitaEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPorId", "id", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listar", "", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remover", "app_debug"})
public final class FavoritosRepository {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cheffia.data.repository.FavoritosRepository INSTANCE = null;
    
    private FavoritosRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object listar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.cheffia.data.local.ReceitaEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object adicionar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.cheffia.data.local.ReceitaEntity receita, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object remover(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.cheffia.data.local.ReceitaEntity receita, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPorId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cheffia.data.local.ReceitaEntity> $completion) {
        return null;
    }
}