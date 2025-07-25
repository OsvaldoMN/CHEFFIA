// Generated by view binder compiler. Do not edit!
package com.example.cheffia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cheffia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetalheFavoritoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imgReceita;

  @NonNull
  public final TextView ingredienteTitle;

  @NonNull
  public final TextView ingredientes;

  @NonNull
  public final ConstraintLayout layout;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final TextView logo;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView nomeReceita;

  @NonNull
  public final TextView preparo;

  @NonNull
  public final TextView preparoTitle;

  @NonNull
  public final ScrollView scrollView3;

  @NonNull
  public final Space space;

  @NonNull
  public final Space space2;

  @NonNull
  public final TextView tipo;

  private ActivityDetalheFavoritoBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imgReceita, @NonNull TextView ingredienteTitle,
      @NonNull TextView ingredientes, @NonNull ConstraintLayout layout,
      @NonNull ConstraintLayout linearLayout, @NonNull TextView logo,
      @NonNull ConstraintLayout main, @NonNull TextView nomeReceita, @NonNull TextView preparo,
      @NonNull TextView preparoTitle, @NonNull ScrollView scrollView3, @NonNull Space space,
      @NonNull Space space2, @NonNull TextView tipo) {
    this.rootView = rootView;
    this.imgReceita = imgReceita;
    this.ingredienteTitle = ingredienteTitle;
    this.ingredientes = ingredientes;
    this.layout = layout;
    this.linearLayout = linearLayout;
    this.logo = logo;
    this.main = main;
    this.nomeReceita = nomeReceita;
    this.preparo = preparo;
    this.preparoTitle = preparoTitle;
    this.scrollView3 = scrollView3;
    this.space = space;
    this.space2 = space2;
    this.tipo = tipo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetalheFavoritoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetalheFavoritoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detalhe_favorito, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetalheFavoritoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgReceita;
      ImageView imgReceita = ViewBindings.findChildViewById(rootView, id);
      if (imgReceita == null) {
        break missingId;
      }

      id = R.id.ingredienteTitle;
      TextView ingredienteTitle = ViewBindings.findChildViewById(rootView, id);
      if (ingredienteTitle == null) {
        break missingId;
      }

      id = R.id.ingredientes;
      TextView ingredientes = ViewBindings.findChildViewById(rootView, id);
      if (ingredientes == null) {
        break missingId;
      }

      id = R.id.layout;
      ConstraintLayout layout = ViewBindings.findChildViewById(rootView, id);
      if (layout == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      ConstraintLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.logo;
      TextView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.nomeReceita;
      TextView nomeReceita = ViewBindings.findChildViewById(rootView, id);
      if (nomeReceita == null) {
        break missingId;
      }

      id = R.id.preparo;
      TextView preparo = ViewBindings.findChildViewById(rootView, id);
      if (preparo == null) {
        break missingId;
      }

      id = R.id.preparoTitle;
      TextView preparoTitle = ViewBindings.findChildViewById(rootView, id);
      if (preparoTitle == null) {
        break missingId;
      }

      id = R.id.scrollView3;
      ScrollView scrollView3 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView3 == null) {
        break missingId;
      }

      id = R.id.space;
      Space space = ViewBindings.findChildViewById(rootView, id);
      if (space == null) {
        break missingId;
      }

      id = R.id.space2;
      Space space2 = ViewBindings.findChildViewById(rootView, id);
      if (space2 == null) {
        break missingId;
      }

      id = R.id.tipo;
      TextView tipo = ViewBindings.findChildViewById(rootView, id);
      if (tipo == null) {
        break missingId;
      }

      return new ActivityDetalheFavoritoBinding((ConstraintLayout) rootView, imgReceita,
          ingredienteTitle, ingredientes, layout, linearLayout, logo, main, nomeReceita, preparo,
          preparoTitle, scrollView3, space, space2, tipo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
