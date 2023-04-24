package r2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* loaded from: classes.dex */
public interface c extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public final int f25190a;

        public a(int i10) {
            this.f25190a = i10;
        }

        public static void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e10) {
                    Log.w("SupportSQLite", "delete failed: ", e10);
                }
            }
        }

        public abstract void b(s2.a aVar);

        public abstract void c(s2.a aVar);

        public abstract void d(s2.a aVar, int i10, int i11);

        public abstract void e(s2.a aVar);

        public abstract void f(s2.a aVar, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final Context f25191a;

        /* renamed from: b */
        public final String f25192b;

        /* renamed from: c */
        public final a f25193c;

        /* renamed from: d */
        public final boolean f25194d;

        public b(Context context, String str, a aVar, boolean z10) {
            this.f25191a = context;
            this.f25192b = str;
            this.f25193c = aVar;
            this.f25194d = z10;
        }
    }

    /* renamed from: r2.c$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0458c {
        c a(b bVar);
    }

    r2.b T();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
