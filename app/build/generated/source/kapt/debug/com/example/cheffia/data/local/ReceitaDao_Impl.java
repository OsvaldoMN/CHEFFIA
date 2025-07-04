package com.example.cheffia.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ReceitaDao_Impl implements ReceitaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ReceitaEntity> __insertionAdapterOfReceitaEntity;

  private final EntityDeletionOrUpdateAdapter<ReceitaEntity> __deletionAdapterOfReceitaEntity;

  public ReceitaDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfReceitaEntity = new EntityInsertionAdapter<ReceitaEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `favoritos` (`id`,`nome`,`ingredientes`,`preparo`,`tipo`,`imagem`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ReceitaEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getNome() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNome());
        }
        if (entity.getIngredientes() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getIngredientes());
        }
        if (entity.getPreparo() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPreparo());
        }
        if (entity.getTipo() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getTipo());
        }
        if (entity.getImagem() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getImagem());
        }
      }
    };
    this.__deletionAdapterOfReceitaEntity = new EntityDeletionOrUpdateAdapter<ReceitaEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `favoritos` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ReceitaEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
      }
    };
  }

  @Override
  public Object inserir(final ReceitaEntity receita, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfReceitaEntity.insert(receita);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deletar(final ReceitaEntity receita, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfReceitaEntity.handle(receita);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getTodos(final Continuation<? super List<ReceitaEntity>> $completion) {
    final String _sql = "SELECT * FROM favoritos";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ReceitaEntity>>() {
      @Override
      @NonNull
      public List<ReceitaEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfIngredientes = CursorUtil.getColumnIndexOrThrow(_cursor, "ingredientes");
          final int _cursorIndexOfPreparo = CursorUtil.getColumnIndexOrThrow(_cursor, "preparo");
          final int _cursorIndexOfTipo = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo");
          final int _cursorIndexOfImagem = CursorUtil.getColumnIndexOrThrow(_cursor, "imagem");
          final List<ReceitaEntity> _result = new ArrayList<ReceitaEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ReceitaEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpIngredientes;
            if (_cursor.isNull(_cursorIndexOfIngredientes)) {
              _tmpIngredientes = null;
            } else {
              _tmpIngredientes = _cursor.getString(_cursorIndexOfIngredientes);
            }
            final String _tmpPreparo;
            if (_cursor.isNull(_cursorIndexOfPreparo)) {
              _tmpPreparo = null;
            } else {
              _tmpPreparo = _cursor.getString(_cursorIndexOfPreparo);
            }
            final String _tmpTipo;
            if (_cursor.isNull(_cursorIndexOfTipo)) {
              _tmpTipo = null;
            } else {
              _tmpTipo = _cursor.getString(_cursorIndexOfTipo);
            }
            final String _tmpImagem;
            if (_cursor.isNull(_cursorIndexOfImagem)) {
              _tmpImagem = null;
            } else {
              _tmpImagem = _cursor.getString(_cursorIndexOfImagem);
            }
            _item = new ReceitaEntity(_tmpId,_tmpNome,_tmpIngredientes,_tmpPreparo,_tmpTipo,_tmpImagem);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getPorId(final String id, final Continuation<? super ReceitaEntity> $completion) {
    final String _sql = "SELECT * FROM favoritos WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ReceitaEntity>() {
      @Override
      @Nullable
      public ReceitaEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfIngredientes = CursorUtil.getColumnIndexOrThrow(_cursor, "ingredientes");
          final int _cursorIndexOfPreparo = CursorUtil.getColumnIndexOrThrow(_cursor, "preparo");
          final int _cursorIndexOfTipo = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo");
          final int _cursorIndexOfImagem = CursorUtil.getColumnIndexOrThrow(_cursor, "imagem");
          final ReceitaEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpIngredientes;
            if (_cursor.isNull(_cursorIndexOfIngredientes)) {
              _tmpIngredientes = null;
            } else {
              _tmpIngredientes = _cursor.getString(_cursorIndexOfIngredientes);
            }
            final String _tmpPreparo;
            if (_cursor.isNull(_cursorIndexOfPreparo)) {
              _tmpPreparo = null;
            } else {
              _tmpPreparo = _cursor.getString(_cursorIndexOfPreparo);
            }
            final String _tmpTipo;
            if (_cursor.isNull(_cursorIndexOfTipo)) {
              _tmpTipo = null;
            } else {
              _tmpTipo = _cursor.getString(_cursorIndexOfTipo);
            }
            final String _tmpImagem;
            if (_cursor.isNull(_cursorIndexOfImagem)) {
              _tmpImagem = null;
            } else {
              _tmpImagem = _cursor.getString(_cursorIndexOfImagem);
            }
            _result = new ReceitaEntity(_tmpId,_tmpNome,_tmpIngredientes,_tmpPreparo,_tmpTipo,_tmpImagem);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
