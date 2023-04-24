package m2;

import android.database.Cursor;
import r2.c;

/* loaded from: classes.dex */
public final class x extends c.a {

    /* renamed from: b */
    public g f20311b;

    /* renamed from: c */
    public final a f20312c;

    /* renamed from: d */
    public final String f20313d;

    /* renamed from: e */
    public final String f20314e;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public final int f20315a;

        public a(int i10) {
            this.f20315a = i10;
        }

        public abstract void a(s2.a aVar);

        public abstract void b(s2.a aVar);

        public abstract void c(s2.a aVar);

        public abstract void d(s2.a aVar);

        public abstract void e();

        public abstract void f(s2.a aVar);

        public abstract b g(s2.a aVar);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final boolean f20316a;

        /* renamed from: b */
        public final String f20317b;

        public b(String str, boolean z10) {
            this.f20316a = z10;
            this.f20317b = str;
        }
    }

    public x(g gVar, a aVar, String str, String str2) {
        super(aVar.f20315a);
        this.f20311b = gVar;
        this.f20312c = aVar;
        this.f20313d = str;
        this.f20314e = str2;
    }

    @Override // r2.c.a
    public final void b(s2.a aVar) {
        gm.l.f(aVar, "db");
    }

    @Override // r2.c.a
    public final void c(s2.a aVar) {
        gm.l.f(aVar, "db");
        Cursor U = aVar.U("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        gm.l.e(U, "db.query(\n              …_metadata'\"\n            )");
        try {
            boolean z10 = false;
            if (U.moveToFirst()) {
                if (U.getInt(0) == 0) {
                    z10 = true;
                }
            }
            mf.a0.d(U, null);
            this.f20312c.a(aVar);
            if (!z10) {
                b g10 = this.f20312c.g(aVar);
                if (!g10.f20316a) {
                    StringBuilder a10 = android.support.v4.media.d.a("Pre-packaged database has an invalid schema: ");
                    a10.append(g10.f20317b);
                    throw new IllegalStateException(a10.toString());
                }
            }
            g(aVar);
            this.f20312c.c(aVar);
        } finally {
        }
    }

    @Override // r2.c.a
    public final void d(s2.a aVar, int i10, int i11) {
        gm.l.f(aVar, "db");
        f(aVar, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007a  */
    @Override // r2.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(s2.a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "db"
            gm.l.f(r5, r0)
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r5.U(r0)
            java.lang.String r1 = "db.query(\n              …LE_NAME }'\"\n            )"
            gm.l.e(r0, r1)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> La9
            r2 = 0
            if (r1 == 0) goto L1f
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> La9
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r3 = 0
            mf.a0.d(r0, r3)
            if (r1 == 0) goto L7a
            r2.a r0 = new r2.a
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1, r3)
            android.database.Cursor r0 = r5.f0(r0)
            java.lang.String r1 = "db.query(\n              …READ_QUERY)\n            )"
            gm.l.e(r0, r1)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L41
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L73
            goto L42
        L41:
            r1 = r3
        L42:
            mf.a0.d(r0, r3)
            java.lang.String r0 = r4.f20313d
            boolean r0 = gm.l.a(r0, r1)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r4.f20314e
            boolean r0 = gm.l.a(r0, r1)
            if (r0 == 0) goto L56
            goto L8c
        L56:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
            java.lang.String r2 = r4.f20313d
            r0.append(r2)
            java.lang.String r2 = ", found: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L73:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L75
        L75:
            r1 = move-exception
            mf.a0.d(r0, r5)
            throw r1
        L7a:
            m2.x$a r0 = r4.f20312c
            m2.x$b r0 = r0.g(r5)
            boolean r1 = r0.f20316a
            if (r1 == 0) goto L94
            m2.x$a r0 = r4.f20312c
            r0.e()
            r4.g(r5)
        L8c:
            m2.x$a r0 = r4.f20312c
            r0.d(r5)
            r4.f20311b = r3
            return
        L94:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r1 = android.support.v4.media.d.a(r1)
            java.lang.String r0 = r0.f20317b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        La9:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> Lab
        Lab:
            r1 = move-exception
            mf.a0.d(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.x.e(s2.a):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0066, code lost:
        if (r9 <= r14) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0072, code lost:
        if (r9 < r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0074, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0077, code lost:
        continue;
     */
    @Override // r2.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(s2.a r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.x.f(s2.a, int, int):void");
    }

    public final void g(s2.a aVar) {
        aVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f20313d;
        gm.l.f(str, "hash");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT OR REPLACE INTO ");
        sb2.append("room_master_table");
        sb2.append(" (");
        sb2.append("id");
        sb2.append(',');
        hj.o.a(sb2, "identity_hash", ") VALUES(", "42", ", '");
        sb2.append(str);
        sb2.append("')");
        aVar.o(sb2.toString());
    }
}
