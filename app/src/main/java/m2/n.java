package m2;

import android.database.Cursor;
import bi.z0;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ m f20242a;

    public n(m mVar) {
        this.f20242a = mVar;
    }

    public final vl.h a() {
        m mVar = this.f20242a;
        vl.h hVar = new vl.h();
        Cursor o10 = mVar.f20218a.o(new r2.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", null), null);
        while (o10.moveToNext()) {
            try {
                hVar.add(Integer.valueOf(o10.getInt(0)));
            } finally {
            }
        }
        tl.l lVar = tl.l.f28297a;
        mf.a0.d(o10, null);
        z0.c(hVar);
        if (!hVar.isEmpty()) {
            if (this.f20242a.f20225h != null) {
                r2.f fVar = this.f20242a.f20225h;
                if (fVar != null) {
                    fVar.r();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00aa A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            m2.m r0 = r5.f20242a
            m2.t r0 = r0.f20218a
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f20269i
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            java.lang.String r1 = "readWriteLock.readLock()"
            gm.l.e(r0, r1)
            r0.lock()
            r1 = 1
            m2.m r2 = r5.f20242a     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            if (r2 != 0) goto L24
        L1b:
            r0.unlock()
            m2.m r0 = r5.f20242a
            r0.getClass()
            return
        L24:
            m2.m r2 = r5.f20242a     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f20223f     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            r3 = 0
            boolean r2 = r2.compareAndSet(r1, r3)     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            if (r2 != 0) goto L30
            goto L1b
        L30:
            m2.m r2 = r5.f20242a     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            m2.t r2 = r2.f20218a     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            boolean r2 = r2.k()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            if (r2 == 0) goto L3b
            goto L1b
        L3b:
            m2.m r2 = r5.f20242a     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            m2.t r2 = r2.f20218a     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            r2.c r2 = r2.h()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            r2.b r2 = r2.T()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            r2.M()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            vl.h r3 = r5.a()     // Catch: java.lang.Throwable -> L55
            r2.K()     // Catch: java.lang.Throwable -> L55
            r2.Y()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            goto L70
        L55:
            r3 = move-exception
            r2.Y()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
            throw r3     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c java.lang.IllegalStateException -> L67
        L5a:
            r1 = move-exception
            goto Lab
        L5c:
            r2 = move-exception
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L5a
        L64:
            ul.u r3 = ul.u.f28881a     // Catch: java.lang.Throwable -> L5a
            goto L70
        L67:
            r2 = move-exception
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L5a
            goto L64
        L70:
            r0.unlock()
            m2.m r0 = r5.f20242a
            r0.getClass()
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto Laa
            m2.m r0 = r5.f20242a
            n.b<m2.m$c, m2.m$d> r1 = r0.f20227j
            monitor-enter(r1)
            n.b<m2.m$c, m2.m$d> r0 = r0.f20227j     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La7
        L8a:
            r2 = r0
            n.b$e r2 = (n.b.e) r2     // Catch: java.lang.Throwable -> La7
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto La3
            java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> La7
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> La7
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> La7
            m2.m$d r2 = (m2.m.d) r2     // Catch: java.lang.Throwable -> La7
            r2.a(r3)     // Catch: java.lang.Throwable -> La7
            goto L8a
        La3:
            tl.l r0 = tl.l.f28297a     // Catch: java.lang.Throwable -> La7
            monitor-exit(r1)
            goto Laa
        La7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        Laa:
            return
        Lab:
            r0.unlock()
            m2.m r0 = r5.f20242a
            r0.getClass()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.n.run():void");
    }
}
