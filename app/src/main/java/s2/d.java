package s2;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class d implements r2.d {

    /* renamed from: a */
    public final SQLiteProgram f26551a;

    public d(SQLiteProgram sQLiteProgram) {
        this.f26551a = sQLiteProgram;
    }

    @Override // r2.d
    public final void H(int i10, long j10) {
        this.f26551a.bindLong(i10, j10);
    }

    @Override // r2.d
    public final void Q(int i10, byte[] bArr) {
        this.f26551a.bindBlob(i10, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f26551a.close();
    }

    @Override // r2.d
    public final void j0(double d10, int i10) {
        this.f26551a.bindDouble(i10, d10);
    }

    @Override // r2.d
    public final void m0(int i10) {
        this.f26551a.bindNull(i10);
    }

    @Override // r2.d
    public final void p(int i10, String str) {
        this.f26551a.bindString(i10, str);
    }
}
