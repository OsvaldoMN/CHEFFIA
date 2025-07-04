package com.example.cheffia.data.api;

import com.example.cheffia.data.model.Receita;
import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/cheffia/data/api/ReceitaApi;", "", "getReceitas", "", "Lcom/example/cheffia/data/model/Receita;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ReceitaApi {
    
    @retrofit2.http.GET(value = "receitas/todas")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReceitas(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.cheffia.data.model.Receita>> $completion);
}