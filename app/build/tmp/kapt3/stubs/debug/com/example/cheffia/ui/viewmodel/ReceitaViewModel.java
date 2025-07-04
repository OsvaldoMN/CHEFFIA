package com.example.cheffia.ui.viewmodel;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.example.cheffia.data.model.Receita;
import com.example.cheffia.data.repository.ReceitaRepository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/cheffia/ui/viewmodel/ReceitaViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_receitas", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/cheffia/data/model/Receita;", "receitas", "Landroidx/lifecycle/LiveData;", "getReceitas", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/example/cheffia/data/repository/ReceitaRepository;", "fetchReceitas", "", "app_debug"})
public final class ReceitaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.cheffia.data.repository.ReceitaRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.cheffia.data.model.Receita>> _receitas = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.cheffia.data.model.Receita>> receitas = null;
    
    public ReceitaViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.cheffia.data.model.Receita>> getReceitas() {
        return null;
    }
    
    private final void fetchReceitas() {
    }
}