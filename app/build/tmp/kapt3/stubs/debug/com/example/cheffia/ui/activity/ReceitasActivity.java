package com.example.cheffia.ui.activity;

import android.R;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.example.cheffia.data.local.ReceitaEntity;
import com.example.cheffia.data.repository.FavoritosRepository;
import com.example.cheffia.databinding.ActivityReceitasBinding;
import com.example.cheffia.ui.viewmodel.ReceitaViewModel;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/example/cheffia/ui/activity/ReceitasActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/cheffia/databinding/ActivityReceitasBinding;", "index", "", "listaFiltrada", "", "Lcom/example/cheffia/data/model/Receita;", "viewModel", "Lcom/example/cheffia/ui/viewmodel/ReceitaViewModel;", "getViewModel", "()Lcom/example/cheffia/ui/viewmodel/ReceitaViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "exibirReceita", "", "receita", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ReceitasActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.cheffia.databinding.ActivityReceitasBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private int index = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.cheffia.data.model.Receita> listaFiltrada;
    
    public ReceitasActivity() {
        super();
    }
    
    private final com.example.cheffia.ui.viewmodel.ReceitaViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void exibirReceita(com.example.cheffia.data.model.Receita receita) {
    }
}