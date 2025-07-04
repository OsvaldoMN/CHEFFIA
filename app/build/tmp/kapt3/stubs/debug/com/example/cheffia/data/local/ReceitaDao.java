package com.example.cheffia.data.local;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/example/cheffia/data/local/ReceitaDao;", "", "deletar", "", "receita", "Lcom/example/cheffia/data/local/ReceitaEntity;", "(Lcom/example/cheffia/data/local/ReceitaEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPorId", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTodos", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inserir", "app_debug"})
@androidx.room.Dao()
public abstract interface ReceitaDao {
    
    @androidx.room.Query(value = "SELECT * FROM favoritos")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTodos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.cheffia.data.local.ReceitaEntity>> $completion);
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object inserir(@org.jetbrains.annotations.NotNull()
    com.example.cheffia.data.local.ReceitaEntity receita, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletar(@org.jetbrains.annotations.NotNull()
    com.example.cheffia.data.local.ReceitaEntity receita, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM favoritos WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPorId(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cheffia.data.local.ReceitaEntity> $completion);
}