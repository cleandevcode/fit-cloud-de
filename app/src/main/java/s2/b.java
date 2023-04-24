package s2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import r2.c;
import s.c0;

/* loaded from: classes.dex */
public final class b implements r2.c {

    /* renamed from: a */
    public final Context f26532a;

    /* renamed from: b */
    public final String f26533b;

    /* renamed from: c */
    public final c.a f26534c;

    /* renamed from: d */
    public final boolean f26535d;

    /* renamed from: e */
    public final boolean f26536e;

    /* renamed from: f */
    public final Object f26537f = new Object();

    /* renamed from: g */
    public a f26538g;

    /* renamed from: h */
    public boolean f26539h;

    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: a */
        public final s2.a[] f26540a;

        /* renamed from: b */
        public final Context f26541b;

        /* renamed from: c */
        public final c.a f26542c;

        /* renamed from: d */
        public final boolean f26543d;

        /* renamed from: e */
        public boolean f26544e;

        /* renamed from: f */
        public final t2.a f26545f;

        /* renamed from: g */
        public boolean f26546g;

        /* renamed from: s2.b$a$a */
        /* loaded from: classes.dex */
        public class C0468a implements DatabaseErrorHandler {

            /* renamed from: a */
            public final /* synthetic */ c.a f26547a;

            /* renamed from: b */
            public final /* synthetic */ s2.a[] f26548b;

            public C0468a(c.a aVar, s2.a[] aVarArr) {
                this.f26547a = aVar;
                this.f26548b = aVarArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:51:0x0010, code lost:
                if (r3 == false) goto L38;
             */
            @Override // android.database.DatabaseErrorHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onCorruption(android.database.sqlite.SQLiteDatabase r5) {
                /*
                    r4 = this;
                    r2.c$a r0 = r4.f26547a
                    s2.a[] r1 = r4.f26548b
                    r2 = 0
                    r3 = r1[r2]
                    if (r3 == 0) goto L12
                    android.database.sqlite.SQLiteDatabase r3 = r3.f26529a
                    if (r3 != r5) goto Lf
                    r3 = 1
                    goto L10
                Lf:
                    r3 = 0
                L10:
                    if (r3 != 0) goto L19
                L12:
                    s2.a r3 = new s2.a
                    r3.<init>(r5)
                    r1[r2] = r3
                L19:
                    r5 = r1[r2]
                    r0.getClass()
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Corruption reported by sqlite on database: "
                    r0.append(r1)
                    java.lang.String r1 = r5.h()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "SupportSQLite"
                    android.util.Log.e(r1, r0)
                    boolean r0 = r5.isOpen()
                    if (r0 != 0) goto L3f
                    goto L88
                L3f:
                    r0 = 0
                    java.util.List r0 = r5.b()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
                    goto L47
                L45:
                    r1 = move-exception
                    goto L4b
                L47:
                    r5.close()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L6d
                    goto L6e
                L4b:
                    if (r0 == 0) goto L65
                    java.util.Iterator r5 = r0.iterator()
                L51:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L6c
                    java.lang.Object r0 = r5.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    r2.c.a.a(r0)
                    goto L51
                L65:
                    java.lang.String r5 = r5.h()
                    r2.c.a.a(r5)
                L6c:
                    throw r1
                L6d:
                L6e:
                    if (r0 == 0) goto L88
                    java.util.Iterator r5 = r0.iterator()
                L74:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L8f
                    java.lang.Object r0 = r5.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    r2.c.a.a(r0)
                    goto L74
                L88:
                    java.lang.String r5 = r5.h()
                    r2.c.a.a(r5)
                L8f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: s2.b.a.C0468a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        /* renamed from: s2.b$a$b */
        /* loaded from: classes.dex */
        public static final class C0469b extends RuntimeException {

            /* renamed from: a */
            public final int f26549a;

            /* renamed from: b */
            public final Throwable f26550b;

            public C0469b(int i10, Throwable th2) {
                super(th2);
                this.f26549a = i10;
                this.f26550b = th2;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f26550b;
            }
        }

        public a(Context context, String str, s2.a[] aVarArr, c.a aVar, boolean z10) {
            super(context, str, null, aVar.f25190a, new C0468a(aVar, aVarArr));
            this.f26541b = context;
            this.f26542c = aVar;
            this.f26540a = aVarArr;
            this.f26543d = z10;
            this.f26545f = new t2.a(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
        }

        public final r2.b a(boolean z10) {
            r2.b b10;
            try {
                this.f26545f.a((this.f26546g || getDatabaseName() == null) ? false : true);
                this.f26544e = false;
                SQLiteDatabase h10 = h(z10);
                if (this.f26544e) {
                    close();
                    b10 = a(z10);
                } else {
                    b10 = b(h10);
                }
                return b10;
            } finally {
                this.f26545f.b();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x000e, code lost:
            if (r2 == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final s2.a b(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                s2.a[] r0 = r3.f26540a
                r1 = 0
                r2 = r0[r1]
                if (r2 == 0) goto L10
                android.database.sqlite.SQLiteDatabase r2 = r2.f26529a
                if (r2 != r4) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = 0
            Le:
                if (r2 != 0) goto L17
            L10:
                s2.a r2 = new s2.a
                r2.<init>(r4)
                r0[r1] = r2
            L17:
                r4 = r0[r1]
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: s2.b.a.b(android.database.sqlite.SQLiteDatabase):s2.a");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            try {
                t2.a aVar = this.f26545f;
                aVar.a(aVar.f27522c);
                super.close();
                this.f26540a[0] = null;
                this.f26546g = false;
            } finally {
                this.f26545f.b();
            }
        }

        public final SQLiteDatabase h(boolean z10) {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.f26541b.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                if (z10) {
                    return getWritableDatabase();
                }
                return getReadableDatabase();
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    if (z10) {
                        return getWritableDatabase();
                    }
                    return getReadableDatabase();
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof C0469b) {
                        C0469b c0469b = th2;
                        Throwable th3 = c0469b.f26550b;
                        int b10 = c0.b(c0469b.f26549a);
                        if (b10 != 0 && b10 != 1 && b10 != 2 && b10 != 3) {
                            if (!(th3 instanceof SQLiteException)) {
                                throw th3;
                            }
                        } else {
                            throw th3;
                        }
                    } else if (th2 instanceof SQLiteException) {
                        if (databaseName == null || !this.f26543d) {
                            throw th2;
                        }
                    } else {
                        throw th2;
                    }
                    this.f26541b.deleteDatabase(databaseName);
                    try {
                        if (z10) {
                            return getWritableDatabase();
                        }
                        return getReadableDatabase();
                    } catch (C0469b e10) {
                        throw e10.f26550b;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            try {
                this.f26542c.b(b(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new C0469b(1, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                this.f26542c.c(b(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new C0469b(2, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f26544e = true;
            try {
                this.f26542c.d(b(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new C0469b(4, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f26544e) {
                try {
                    this.f26542c.e(b(sQLiteDatabase));
                } catch (Throwable th2) {
                    throw new C0469b(5, th2);
                }
            }
            this.f26546g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f26544e = true;
            try {
                this.f26542c.f(b(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new C0469b(3, th2);
            }
        }
    }

    public b(Context context, String str, c.a aVar, boolean z10, boolean z11) {
        this.f26532a = context;
        this.f26533b = str;
        this.f26534c = aVar;
        this.f26535d = z10;
        this.f26536e = z11;
    }

    @Override // r2.c
    public final r2.b T() {
        return a().a(true);
    }

    public final a a() {
        a aVar;
        synchronized (this.f26537f) {
            if (this.f26538g == null) {
                s2.a[] aVarArr = new s2.a[1];
                if (Build.VERSION.SDK_INT >= 23 && this.f26533b != null && this.f26535d) {
                    this.f26538g = new a(this.f26532a, new File(this.f26532a.getNoBackupFilesDir(), this.f26533b).getAbsolutePath(), aVarArr, this.f26534c, this.f26536e);
                } else {
                    this.f26538g = new a(this.f26532a, this.f26533b, aVarArr, this.f26534c, this.f26536e);
                }
                this.f26538g.setWriteAheadLoggingEnabled(this.f26539h);
            }
            aVar = this.f26538g;
        }
        return aVar;
    }

    @Override // r2.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // r2.c
    public final String getDatabaseName() {
        return this.f26533b;
    }

    @Override // r2.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f26537f) {
            a aVar = this.f26538g;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.f26539h = z10;
        }
    }
}
