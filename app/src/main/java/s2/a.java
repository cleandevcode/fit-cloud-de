package s2;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import r2.f;

/* loaded from: classes.dex */
public final class a implements r2.b {

    /* renamed from: b */
    public static final String[] f26528b = new String[0];

    /* renamed from: a */
    public final SQLiteDatabase f26529a;

    /* renamed from: s2.a$a */
    /* loaded from: classes.dex */
    public class C0467a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ r2.e f26530a;

        public C0467a(r2.e eVar) {
            this.f26530a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f26530a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* loaded from: classes.dex */
    public class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ r2.e f26531a;

        public b(r2.e eVar) {
            this.f26531a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f26531a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f26529a = sQLiteDatabase;
    }

    @Override // r2.b
    public final Cursor C0(r2.e eVar, CancellationSignal cancellationSignal) {
        return this.f26529a.rawQueryWithFactory(new b(eVar), eVar.b(), f26528b, null, cancellationSignal);
    }

    @Override // r2.b
    public final void K() {
        this.f26529a.setTransactionSuccessful();
    }

    @Override // r2.b
    public final void M() {
        this.f26529a.beginTransactionNonExclusive();
    }

    @Override // r2.b
    public final Cursor U(String str) {
        return f0(new r2.a(str, null));
    }

    @Override // r2.b
    public final void Y() {
        this.f26529a.endTransaction();
    }

    public final void a(Object[] objArr) {
        this.f26529a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final List<Pair<String, String>> b() {
        return this.f26529a.getAttachedDbs();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f26529a.close();
    }

    @Override // r2.b
    public final Cursor f0(r2.e eVar) {
        return this.f26529a.rawQueryWithFactory(new C0467a(eVar), eVar.b(), f26528b, null);
    }

    public final String h() {
        return this.f26529a.getPath();
    }

    @Override // r2.b
    public final void i() {
        this.f26529a.beginTransaction();
    }

    @Override // r2.b
    public final boolean isOpen() {
        return this.f26529a.isOpen();
    }

    @Override // r2.b
    public final Cursor m(String str, Object[] objArr) {
        return f0(new r2.a(str, objArr));
    }

    @Override // r2.b
    public final void o(String str) {
        this.f26529a.execSQL(str);
    }

    @Override // r2.b
    public final boolean r0() {
        return this.f26529a.inTransaction();
    }

    @Override // r2.b
    public final f t(String str) {
        return new e(this.f26529a.compileStatement(str));
    }

    @Override // r2.b
    public final boolean v0() {
        return this.f26529a.isWriteAheadLoggingEnabled();
    }
}
